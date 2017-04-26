/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.cards.n;

import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.dynamicvalue.common.PermanentsOnBattlefieldCount;
import mage.abilities.effects.OneShotEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.CardsImpl;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.TargetController;
import mage.constants.Zone;
import mage.filter.common.FilterBasicLandCard;
import mage.filter.common.FilterControlledLandPermanent;
import mage.filter.common.FilterLandPermanent;
import mage.filter.predicate.permanent.ControllerPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.players.PlayerList;
import mage.target.common.TargetCardInLibrary;
import mage.target.common.TargetControlledPermanent;

/**
 *
 * @author Rene - bugisemail at gmail dot com
 */
public class NaturalBalance extends CardImpl {

    public NaturalBalance(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{2}{G}{G}");

        // Each player who controls six or more lands chooses five lands he or she controls and sacrifices the rest. Each player who controls four or fewer lands may search his or her library for up to X basic land cards and put them onto the battlefield, where X is five minus the number of lands he or she controls. Then each player who searched his or her library this way shuffles it.
        this.getSpellAbility().addEffect(new NaturalBalanceEffect());
    }

    public NaturalBalance(final NaturalBalance card) {
        super(card);
    }

    @Override
    public NaturalBalance copy() {
        return new NaturalBalance(this);
    }

    class NaturalBalanceEffect extends OneShotEffect {

        public NaturalBalanceEffect() {
            super(Outcome.PutCardInPlay);
            this.staticText = "Each player who controls six or more lands chooses five lands he or she controls and sacrifices the rest. Each player who controls four or fewer lands may search his or her library for up to X basic land cards and put them onto the battlefield, where X is five minus the number of lands he or she controls. Then each player who searched his or her library this way shuffles it.";
        }

        public NaturalBalanceEffect(final NaturalBalanceEffect effect) {
            super(effect);
        }

        @Override
        public NaturalBalanceEffect copy() {
            return new NaturalBalanceEffect(this);
        }

        @Override
        public boolean apply(Game game, Ability source) {
            Player controller = game.getPlayer(source.getControllerId());
            if (controller != null) {
                PlayerList players = game.getState().getPlayerList(controller.getId());
                for (UUID playerId : players) {
                    Player player = game.getPlayer(playerId);
                    if (player != null) {
                        int landCount = game.getBattlefield().countAll(new FilterControlledLandPermanent(), player.getId(), game);
                        if (landCount > 5) {
                            //Sacrifice lands till you have 5
                            TargetControlledPermanent target = new TargetControlledPermanent(5, 5, new FilterControlledLandPermanent("lands to keep"), true);
                            if (target.choose(Outcome.Sacrifice, player.getId(), source.getSourceId(), game)) {
                                for (Permanent permanent : game.getBattlefield().getActivePermanents(new FilterControlledLandPermanent(), player.getId(), source.getSourceId(), game)) {
                                    if (permanent != null && !target.getTargets().contains(permanent.getId())) {
                                        permanent.sacrifice(source.getId(), game);
                                    }
                                }
                            }
                        } else if (landCount < 5) {
                            //Play basic lands till you have 5
                            FilterLandPermanent filter = new FilterLandPermanent();
                            filter.add(new ControllerPredicate(TargetController.YOU));
                            int amount = 5 - landCount;
                            TargetCardInLibrary target = new TargetCardInLibrary(0, amount, new FilterBasicLandCard());
                            if (player.searchLibrary(target, game)) {
                                player.moveCards(new CardsImpl(target.getTargets()).getCards(game), Zone.BATTLEFIELD, source, game, true, false, false, null);
                            }
                            player.shuffleLibrary(source, game);
                        }
                    }
                }
                return true;
            }
            return false;
        }
    }
}
