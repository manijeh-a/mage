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
package mage.sets.odyssey;

import java.util.List;
import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.effects.SearchEffect;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.Cards;
import mage.cards.CardsImpl;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.Rarity;
import mage.constants.Zone;
import mage.filter.FilterCard;
import mage.game.Game;
import mage.players.Player;
import mage.target.common.TargetCardInLibrary;

/**
 *
 * @author Plopman
 */
public class Entomb extends CardImpl<Entomb> {

    public Entomb(UUID ownerId) {
        super(ownerId, 132, "Entomb", Rarity.RARE, new CardType[]{CardType.INSTANT}, "{B}");
        this.expansionSetCode = "ODY";

        this.color.setBlack(true);

        // Search your library for a card and put that card into your graveyard. Then shuffle your library.
        this.getSpellAbility().addEffect(new SearchLibraryPutInGraveyard());
    }

    public Entomb(final Entomb card) {
        super(card);
    }

    @Override
    public Entomb copy() {
        return new Entomb(this);
    }
}


class SearchLibraryPutInGraveyard extends SearchEffect<SearchLibraryPutInGraveyard> {

  public SearchLibraryPutInGraveyard() {
        super(new TargetCardInLibrary(new FilterCard()), Outcome.Neutral);
        staticText = "Search your library for a card and put that card into your graveyard. Then shuffle your library";
    }

    public SearchLibraryPutInGraveyard(final SearchLibraryPutInGraveyard effect) {
        super(effect);
    }

    @Override
    public SearchLibraryPutInGraveyard copy() {
        return new SearchLibraryPutInGraveyard(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        if (controller == null) {
            return false;
        }
        boolean result = false;
        if (controller.searchLibrary(target, game)) {
            if (target.getTargets().size() > 0) {
                for (UUID cardId: (List<UUID>)target.getTargets()) {
                    Card card = controller.getLibrary().remove(cardId, game);
                    if (card != null) {
                        controller.moveCardToGraveyardWithInfo(card, source.getSourceId(), game, Zone.LIBRARY);
                    }
                }
            }
            result = true;
        }
        controller.shuffleLibrary(game);
        return result;
    }
    
}
