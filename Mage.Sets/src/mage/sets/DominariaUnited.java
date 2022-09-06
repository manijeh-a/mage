package mage.sets;

import mage.cards.ExpansionSet;
import mage.cards.repository.CardCriteria;
import mage.cards.repository.CardInfo;
import mage.cards.repository.CardRepository;
import mage.constants.CardType;
import mage.constants.Rarity;
import mage.constants.SetType;
import mage.constants.SuperType;

import java.util.List;

/**
 * @author TheElk801
 */
public final class DominariaUnited extends ExpansionSet {

    private static final DominariaUnited instance = new DominariaUnited();

    public static DominariaUnited getInstance() {
        return instance;
    }

    private DominariaUnited() {
        super("Dominaria United", "DMU", ExpansionSet.buildDate(2022, 11, 9), SetType.EXPANSION);
        this.blockName = "Dominaria United";
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;        // non-legendary creature: 46 rare, 13 mythic
        this.ratioBoosterSpecialRare = 4;
        this.ratioBoosterSpecialMythic = 5; // legendary creature: 14 rare, 7 mythic
        this.maxCardNumberInBooster = 281;

        cards.add(new SetCardInfo("Academy Loremaster", 40, Rarity.RARE, mage.cards.a.AcademyLoremaster.class));
        cards.add(new SetCardInfo("Academy Wall", 41, Rarity.COMMON, mage.cards.a.AcademyWall.class));
        cards.add(new SetCardInfo("Adarkar Wastes", 243, Rarity.RARE, mage.cards.a.AdarkarWastes.class));
        cards.add(new SetCardInfo("Aether Channeler", 42, Rarity.RARE, mage.cards.a.AetherChanneler.class));
        cards.add(new SetCardInfo("Aggressive Sabotage", 78, Rarity.COMMON, mage.cards.a.AggressiveSabotage.class));
        cards.add(new SetCardInfo("Ajani, Sleeper Agent", 192, Rarity.MYTHIC, mage.cards.a.AjaniSleeperAgent.class));
        cards.add(new SetCardInfo("Anointed Peacekeeper", 2, Rarity.RARE, mage.cards.a.AnointedPeacekeeper.class));
        cards.add(new SetCardInfo("Archangel of Wrath", 3, Rarity.RARE, mage.cards.a.ArchangelOfWrath.class));
        cards.add(new SetCardInfo("Argivian Cavalier", 4, Rarity.COMMON, mage.cards.a.ArgivianCavalier.class));
        cards.add(new SetCardInfo("Argivian Phalanx", 5, Rarity.COMMON, mage.cards.a.ArgivianPhalanx.class));
        cards.add(new SetCardInfo("Aron, Benalia's Ruin", 193, Rarity.UNCOMMON, mage.cards.a.AronBenaliasRuin.class));
        cards.add(new SetCardInfo("Artillery Blast", 6, Rarity.COMMON, mage.cards.a.ArtilleryBlast.class));
        cards.add(new SetCardInfo("Astor, Bearer of Blades", 194, Rarity.RARE, mage.cards.a.AstorBearerOfBlades.class));
        cards.add(new SetCardInfo("Automatic Librarian", 229, Rarity.COMMON, mage.cards.a.AutomaticLibrarian.class));
        cards.add(new SetCardInfo("Baird, Argivian Recruiter", 195, Rarity.UNCOMMON, mage.cards.b.BairdArgivianRecruiter.class));
        cards.add(new SetCardInfo("Balduvian Atrocity", 79, Rarity.UNCOMMON, mage.cards.b.BalduvianAtrocity.class));
        cards.add(new SetCardInfo("Balduvian Berserker", 116, Rarity.UNCOMMON, mage.cards.b.BalduvianBerserker.class));
        cards.add(new SetCardInfo("Balmor, Battlemage Captain", 196, Rarity.UNCOMMON, mage.cards.b.BalmorBattlemageCaptain.class));
        cards.add(new SetCardInfo("Barkweave Crusher", 154, Rarity.COMMON, mage.cards.b.BarkweaveCrusher.class));
        cards.add(new SetCardInfo("Battle-Rage Blessing", 80, Rarity.COMMON, mage.cards.b.BattleRageBlessing.class));
        cards.add(new SetCardInfo("Battlefly Swarm", 81, Rarity.COMMON, mage.cards.b.BattleflySwarm.class));
        cards.add(new SetCardInfo("Battlewing Mystic", 43, Rarity.UNCOMMON, mage.cards.b.BattlewingMystic.class));
        cards.add(new SetCardInfo("Benalish Faithbonder", 7, Rarity.COMMON, mage.cards.b.BenalishFaithbonder.class));
        cards.add(new SetCardInfo("Benalish Sleeper", 8, Rarity.COMMON, mage.cards.b.BenalishSleeper.class));
        cards.add(new SetCardInfo("Bite Down", 155, Rarity.COMMON, mage.cards.b.BiteDown.class));
        cards.add(new SetCardInfo("Blight Pile", 82, Rarity.UNCOMMON, mage.cards.b.BlightPile.class));
        cards.add(new SetCardInfo("Bog Badger", 156, Rarity.COMMON, mage.cards.b.BogBadger.class));
        cards.add(new SetCardInfo("Bone Splinters", 83, Rarity.COMMON, mage.cards.b.BoneSplinters.class));
        cards.add(new SetCardInfo("Bortuk Bonerattle", 197, Rarity.UNCOMMON, mage.cards.b.BortukBonerattle.class));
        cards.add(new SetCardInfo("Braids's Frightful Return", 85, Rarity.UNCOMMON, mage.cards.b.BraidssFrightfulReturn.class));
        cards.add(new SetCardInfo("Braids, Arisen Nightmare", 84, Rarity.RARE, mage.cards.b.BraidsArisenNightmare.class));
        cards.add(new SetCardInfo("Briar Hydra", 286, Rarity.RARE, mage.cards.b.BriarHydra.class));
        cards.add(new SetCardInfo("Broken Wings", 157, Rarity.COMMON, mage.cards.b.BrokenWings.class));
        cards.add(new SetCardInfo("Captain's Call", 9, Rarity.COMMON, mage.cards.c.CaptainsCall.class));
        cards.add(new SetCardInfo("Caves of Koilos", 244, Rarity.RARE, mage.cards.c.CavesOfKoilos.class));
        cards.add(new SetCardInfo("Chaotic Transformation", 117, Rarity.RARE, mage.cards.c.ChaoticTransformation.class));
        cards.add(new SetCardInfo("Charismatic Vanguard", 10, Rarity.COMMON, mage.cards.c.CharismaticVanguard.class));
        cards.add(new SetCardInfo("Choking Miasma", 86, Rarity.UNCOMMON, mage.cards.c.ChokingMiasma.class));
        cards.add(new SetCardInfo("Citizen's Arrest", 11, Rarity.COMMON, mage.cards.c.CitizensArrest.class));
        cards.add(new SetCardInfo("Cleaving Skyrider", 12, Rarity.UNCOMMON, mage.cards.c.CleavingSkyrider.class));
        cards.add(new SetCardInfo("Clockwork Drawbridge", 13, Rarity.COMMON, mage.cards.c.ClockworkDrawbridge.class));
        cards.add(new SetCardInfo("Coalition Skyknight", 14, Rarity.UNCOMMON, mage.cards.c.CoalitionSkyknight.class));
        cards.add(new SetCardInfo("Coalition Warbrute", 118, Rarity.COMMON, mage.cards.c.CoalitionWarbrute.class));
        cards.add(new SetCardInfo("Colossal Growth", 158, Rarity.COMMON, mage.cards.c.ColossalGrowth.class));
        cards.add(new SetCardInfo("Combat Research", 44, Rarity.UNCOMMON, mage.cards.c.CombatResearch.class));
        cards.add(new SetCardInfo("Contaminated Aquifer", 245, Rarity.COMMON, mage.cards.c.ContaminatedAquifer.class));
        cards.add(new SetCardInfo("Coral Colony", 45, Rarity.UNCOMMON, mage.cards.c.CoralColony.class));
        cards.add(new SetCardInfo("Cosmic Epiphany", 283, Rarity.RARE, mage.cards.c.CosmicEpiphany.class));
        cards.add(new SetCardInfo("Crystal Grotto", 246, Rarity.COMMON, mage.cards.c.CrystalGrotto.class));
        cards.add(new SetCardInfo("Cult Conscript", 88, Rarity.UNCOMMON, mage.cards.c.CultConscript.class));
        cards.add(new SetCardInfo("Cut Down", 89, Rarity.UNCOMMON, mage.cards.c.CutDown.class));
        cards.add(new SetCardInfo("Deathbloom Gardener", 159, Rarity.COMMON, mage.cards.d.DeathbloomGardener.class));
        cards.add(new SetCardInfo("Destroy Evil", 17, Rarity.COMMON, mage.cards.d.DestroyEvil.class));
        cards.add(new SetCardInfo("Djinn of the Fountain", 47, Rarity.UNCOMMON, mage.cards.d.DjinnOfTheFountain.class));
        cards.add(new SetCardInfo("Drag to the Bottom", 91, Rarity.RARE, mage.cards.d.DragToTheBottom.class));
        cards.add(new SetCardInfo("Dragon Whelp", 120, Rarity.UNCOMMON, mage.cards.d.DragonWhelp.class));
        cards.add(new SetCardInfo("Eerie Soultender", 92, Rarity.COMMON, mage.cards.e.EerieSoultender.class));
        cards.add(new SetCardInfo("Elas il-Kor, Sadistic Pilgrim", 198, Rarity.UNCOMMON, mage.cards.e.ElasIlKorSadisticPilgrim.class));
        cards.add(new SetCardInfo("Electrostatic Infantry", 122, Rarity.UNCOMMON, mage.cards.e.ElectrostaticInfantry.class));
        cards.add(new SetCardInfo("Elfhame Wurm", 161, Rarity.COMMON, mage.cards.e.ElfhameWurm.class));
        cards.add(new SetCardInfo("Elvish Hydromancer", 162, Rarity.UNCOMMON, mage.cards.e.ElvishHydromancer.class));
        cards.add(new SetCardInfo("Ertai Resurrected", 199, Rarity.RARE, mage.cards.e.ErtaiResurrected.class));
        cards.add(new SetCardInfo("Ertai's Scorn", 48, Rarity.UNCOMMON, mage.cards.e.ErtaisScorn.class));
        cards.add(new SetCardInfo("Essence Scatter", 49, Rarity.COMMON, mage.cards.e.EssenceScatter.class));
        cards.add(new SetCardInfo("Evolved Sleeper", 93, Rarity.RARE, mage.cards.e.EvolvedSleeper.class));
        cards.add(new SetCardInfo("Extinguish the Light", 94, Rarity.COMMON, mage.cards.e.ExtinguishTheLight.class));
        cards.add(new SetCardInfo("Fires of Victory", 123, Rarity.UNCOMMON, mage.cards.f.FiresOfVictory.class));
        cards.add(new SetCardInfo("Floriferous Vinewall", 163, Rarity.COMMON, mage.cards.f.FloriferousVinewall.class));
        cards.add(new SetCardInfo("Flowstone Infusion", 124, Rarity.COMMON, mage.cards.f.FlowstoneInfusion.class));
        cards.add(new SetCardInfo("Flowstone Kavu", 125, Rarity.COMMON, mage.cards.f.FlowstoneKavu.class));
        cards.add(new SetCardInfo("Forest", 274, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Founding the Third Path", 50, Rarity.UNCOMMON, mage.cards.f.FoundingTheThirdPath.class));
        cards.add(new SetCardInfo("Frostfist Strider", 51, Rarity.UNCOMMON, mage.cards.f.FrostfistStrider.class));
        cards.add(new SetCardInfo("Furious Bellow", 126, Rarity.COMMON, mage.cards.f.FuriousBellow.class));
        cards.add(new SetCardInfo("Gaea's Might", 164, Rarity.COMMON, mage.cards.g.GaeasMight.class));
        cards.add(new SetCardInfo("Geothermal Bog", 247, Rarity.COMMON, mage.cards.g.GeothermalBog.class));
        cards.add(new SetCardInfo("Ghitu Amplifier", 127, Rarity.COMMON, mage.cards.g.GhituAmplifier.class));
        cards.add(new SetCardInfo("Gibbering Barricade", 95, Rarity.COMMON, mage.cards.g.GibberingBarricade.class));
        cards.add(new SetCardInfo("Goblin Picker", 128, Rarity.COMMON, mage.cards.g.GoblinPicker.class));
        cards.add(new SetCardInfo("Griffin Protector", 18, Rarity.COMMON, mage.cards.g.GriffinProtector.class));
        cards.add(new SetCardInfo("Guardian of New Benalia", 19, Rarity.RARE, mage.cards.g.GuardianOfNewBenalia.class));
        cards.add(new SetCardInfo("Hammerhand", 129, Rarity.COMMON, mage.cards.h.Hammerhand.class));
        cards.add(new SetCardInfo("Haughty Djinn", 52, Rarity.RARE, mage.cards.h.HaughtyDjinn.class));
        cards.add(new SetCardInfo("Haunted Mire", 248, Rarity.COMMON, mage.cards.h.HauntedMire.class));
        cards.add(new SetCardInfo("Haunting Figment", 53, Rarity.COMMON, mage.cards.h.HauntingFigment.class));
        cards.add(new SetCardInfo("Herd Migration", 165, Rarity.RARE, mage.cards.h.HerdMigration.class));
        cards.add(new SetCardInfo("Hero's Heirloom", 231, Rarity.UNCOMMON, mage.cards.h.HerosHeirloom.class));
        cards.add(new SetCardInfo("Heroic Charge", 20, Rarity.COMMON, mage.cards.h.HeroicCharge.class));
        cards.add(new SetCardInfo("Hexbane Tortoise", 166, Rarity.COMMON, mage.cards.h.HexbaneTortoise.class));
        cards.add(new SetCardInfo("Hurler Cyclops", 130, Rarity.UNCOMMON, mage.cards.h.HurlerCyclops.class));
        cards.add(new SetCardInfo("Hurloon Battle Hymn", 131, Rarity.UNCOMMON, mage.cards.h.HurloonBattleHymn.class));
        cards.add(new SetCardInfo("Idyllic Beachfront", 249, Rarity.COMMON, mage.cards.i.IdyllicBeachfront.class));
        cards.add(new SetCardInfo("Impede Momentum", 54, Rarity.COMMON, mage.cards.i.ImpedeMomentum.class));
        cards.add(new SetCardInfo("Impulse", 55, Rarity.COMMON, mage.cards.i.Impulse.class));
        cards.add(new SetCardInfo("In Thrall to the Pit", 132, Rarity.COMMON, mage.cards.i.InThrallToThePit.class));
        cards.add(new SetCardInfo("Inscribed Tablet", 232, Rarity.UNCOMMON, mage.cards.i.InscribedTablet.class));
        cards.add(new SetCardInfo("Island", 265, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jaya's Firenado", 134, Rarity.COMMON, mage.cards.j.JayasFirenado.class));
        cards.add(new SetCardInfo("Jaya, Fiery Negotiator", 133, Rarity.MYTHIC, mage.cards.j.JayaFieryNegotiator.class));
        cards.add(new SetCardInfo("Jhoira, Ageless Innovator", 202, Rarity.RARE, mage.cards.j.JhoiraAgelessInnovator.class));
        cards.add(new SetCardInfo("Jodah's Codex", 233, Rarity.UNCOMMON, mage.cards.j.JodahsCodex.class));
        cards.add(new SetCardInfo("Join Forces", 21, Rarity.UNCOMMON, mage.cards.j.JoinForces.class));
        cards.add(new SetCardInfo("Joint Exploration", 56, Rarity.UNCOMMON, mage.cards.j.JointExploration.class));
        cards.add(new SetCardInfo("Juniper Order Rootweaver", 22, Rarity.COMMON, mage.cards.j.JuniperOrderRootweaver.class));
        cards.add(new SetCardInfo("Karn, Living Legacy", 1, Rarity.MYTHIC, mage.cards.k.KarnLivingLegacy.class));
        cards.add(new SetCardInfo("Karplusan Forest", 250, Rarity.RARE, mage.cards.k.KarplusanForest.class));
        cards.add(new SetCardInfo("Keldon Flamesage", 135, Rarity.RARE, mage.cards.k.KeldonFlamesage.class));
        cards.add(new SetCardInfo("Keldon Strike Team", 136, Rarity.COMMON, mage.cards.k.KeldonStrikeTeam.class));
        cards.add(new SetCardInfo("King Darien XLVIII", 204, Rarity.RARE, mage.cards.k.KingDarienXLVIII.class));
        cards.add(new SetCardInfo("Knight of Dawn's Light", 23, Rarity.UNCOMMON, mage.cards.k.KnightOfDawnsLight.class));
        cards.add(new SetCardInfo("Knight of Dusk's Shadow", 96, Rarity.UNCOMMON, mage.cards.k.KnightOfDusksShadow.class));
        cards.add(new SetCardInfo("Lagomos, Hand of Hatred", 205, Rarity.UNCOMMON, mage.cards.l.LagomosHandOfHatred.class));
        cards.add(new SetCardInfo("Leaf-Crowned Visionary", 167, Rarity.RARE, mage.cards.l.LeafCrownedVisionary.class));
        cards.add(new SetCardInfo("Leyline Binding", 24, Rarity.RARE, mage.cards.l.LeylineBinding.class));
        cards.add(new SetCardInfo("Lightning Strike", 137, Rarity.COMMON, mage.cards.l.LightningStrike.class));
        cards.add(new SetCardInfo("Liliana of the Veil", 97, Rarity.MYTHIC, mage.cards.l.LilianaOfTheVeil.class));
        cards.add(new SetCardInfo("Linebreaker Baloth", 168, Rarity.UNCOMMON, mage.cards.l.LinebreakerBaloth.class));
        cards.add(new SetCardInfo("Llanowar Greenwidow", 169, Rarity.RARE, mage.cards.l.LlanowarGreenwidow.class));
        cards.add(new SetCardInfo("Llanowar Loamspeaker", 170, Rarity.RARE, mage.cards.l.LlanowarLoamspeaker.class));
        cards.add(new SetCardInfo("Llanowar Stalker", 171, Rarity.COMMON, mage.cards.l.LlanowarStalker.class));
        cards.add(new SetCardInfo("Love Song of Night and Day", 25, Rarity.UNCOMMON, mage.cards.l.LoveSongOfNightAndDay.class));
        cards.add(new SetCardInfo("Magnigoth Sentry", 172, Rarity.COMMON, mage.cards.m.MagnigothSentry.class));
        cards.add(new SetCardInfo("Meria's Outrider", 138, Rarity.COMMON, mage.cards.m.MeriasOutrider.class));
        cards.add(new SetCardInfo("Meria, Scholar of Antiquity", 206, Rarity.RARE, mage.cards.m.MeriaScholarOfAntiquity.class));
        cards.add(new SetCardInfo("Mesa Cavalier", 26, Rarity.COMMON, mage.cards.m.MesaCavalier.class));
        cards.add(new SetCardInfo("Meteorite", 235, Rarity.COMMON, mage.cards.m.Meteorite.class));
        cards.add(new SetCardInfo("Micromancer", 57, Rarity.UNCOMMON, mage.cards.m.Micromancer.class));
        cards.add(new SetCardInfo("Molten Monstrosity", 139, Rarity.COMMON, mage.cards.m.MoltenMonstrosity.class));
        cards.add(new SetCardInfo("Molten Tributary", 251, Rarity.COMMON, mage.cards.m.MoltenTributary.class));
        cards.add(new SetCardInfo("Monstrous War-Leech", 98, Rarity.UNCOMMON, mage.cards.m.MonstrousWarLeech.class));
        cards.add(new SetCardInfo("Mossbeard Ancient", 173, Rarity.UNCOMMON, mage.cards.m.MossbeardAncient.class));
        cards.add(new SetCardInfo("Mountain", 271, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nael, Avizoa Aeronaut", 207, Rarity.UNCOMMON, mage.cards.n.NaelAvizoaAeronaut.class));
        cards.add(new SetCardInfo("Najal, the Storm Runner", 208, Rarity.UNCOMMON, mage.cards.n.NajalTheStormRunner.class));
        cards.add(new SetCardInfo("Negate", 58, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Nemata, Primeval Warden", 209, Rarity.RARE, mage.cards.n.NemataPrimevalWarden.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nemata, Primeval Warden", 308, Rarity.RARE, mage.cards.n.NemataPrimevalWarden.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nemata, Primeval Warden", 349, Rarity.RARE, mage.cards.n.NemataPrimevalWarden.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nishoba Brawler", 174, Rarity.UNCOMMON, mage.cards.n.NishobaBrawler.class));
        cards.add(new SetCardInfo("Phoenix Chick", 140, Rarity.UNCOMMON, mage.cards.p.PhoenixChick.class));
        cards.add(new SetCardInfo("Phyrexian Espionage", 60, Rarity.COMMON, mage.cards.p.PhyrexianEspionage.class));
        cards.add(new SetCardInfo("Phyrexian Missionary", 27, Rarity.UNCOMMON, mage.cards.p.PhyrexianMissionary.class));
        cards.add(new SetCardInfo("Phyrexian Rager", 99, Rarity.COMMON, mage.cards.p.PhyrexianRager.class));
        cards.add(new SetCardInfo("Phyrexian Vivisector", 100, Rarity.COMMON, mage.cards.p.PhyrexianVivisector.class));
        cards.add(new SetCardInfo("Phyrexian Warhorse", 101, Rarity.COMMON, mage.cards.p.PhyrexianWarhorse.class));
        cards.add(new SetCardInfo("Pilfer", 102, Rarity.UNCOMMON, mage.cards.p.Pilfer.class));
        cards.add(new SetCardInfo("Pixie Illusionist", 61, Rarity.COMMON, mage.cards.p.PixieIllusionist.class));
        cards.add(new SetCardInfo("Plains", 262, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plaza of Heroes", 252, Rarity.RARE, mage.cards.p.PlazaOfHeroes.class));
        cards.add(new SetCardInfo("Prayer of Binding", 28, Rarity.UNCOMMON, mage.cards.p.PrayerOfBinding.class));
        cards.add(new SetCardInfo("Protect the Negotiators", 62, Rarity.UNCOMMON, mage.cards.p.ProtectTheNegotiators.class));
        cards.add(new SetCardInfo("Quirion Beastcaller", 175, Rarity.RARE, mage.cards.q.QuirionBeastcaller.class));
        cards.add(new SetCardInfo("Queen Allenal of Ruadach", 210, Rarity.UNCOMMON, mage.cards.q.QueenAllenalOfRuadach.class));
        cards.add(new SetCardInfo("Radha's Firebrand", 141, Rarity.RARE, mage.cards.r.RadhasFirebrand.class));
        cards.add(new SetCardInfo("Radha, Coalition Warlord", 211, Rarity.UNCOMMON, mage.cards.r.RadhaCoalitionWarlord.class));
        cards.add(new SetCardInfo("Radiant Grove", 253, Rarity.COMMON, mage.cards.r.RadiantGrove.class));
        cards.add(new SetCardInfo("Raff, Weatherlight Stalwart", 212, Rarity.UNCOMMON, mage.cards.r.RaffWeatherlightStalwart.class));
        cards.add(new SetCardInfo("Ragefire Hellkite", 285, Rarity.RARE, mage.cards.r.RagefireHellkite.class));
        cards.add(new SetCardInfo("Ratadrabik of Urborg", 213, Rarity.RARE, mage.cards.r.RatadrabikOfUrborg.class));
        cards.add(new SetCardInfo("Relic of Legends", 236, Rarity.UNCOMMON, mage.cards.r.RelicOfLegends.class));
        cards.add(new SetCardInfo("Resolute Reinforcements", 29, Rarity.UNCOMMON, mage.cards.r.ResoluteReinforcements.class));
        cards.add(new SetCardInfo("Rith, Liberated Primeval", 214, Rarity.MYTHIC, mage.cards.r.RithLiberatedPrimeval.class));
        cards.add(new SetCardInfo("Rona's Vortex", 63, Rarity.UNCOMMON, mage.cards.r.RonasVortex.class));
        cards.add(new SetCardInfo("Rona, Sheoldred's Faithful", 216, Rarity.UNCOMMON, mage.cards.r.RonaSheoldredsFaithful.class));
        cards.add(new SetCardInfo("Rulik Mons, Warren Chief", 217, Rarity.UNCOMMON, mage.cards.r.RulikMonsWarrenChief.class));
        cards.add(new SetCardInfo("Rundvelt Hordemaster", 142, Rarity.RARE, mage.cards.r.RundveltHordemaster.class));
        cards.add(new SetCardInfo("Runic Shot", 30, Rarity.UNCOMMON, mage.cards.r.RunicShot.class));
        cards.add(new SetCardInfo("Sacred Peaks", 254, Rarity.COMMON, mage.cards.s.SacredPeaks.class));
        cards.add(new SetCardInfo("Salvaged Manaworker", 237, Rarity.COMMON, mage.cards.s.SalvagedManaworker.class));
        cards.add(new SetCardInfo("Samite Herbalist", 31, Rarity.COMMON, mage.cards.s.SamiteHerbalist.class));
        cards.add(new SetCardInfo("Scout the Wilderness", 176, Rarity.COMMON, mage.cards.s.ScoutTheWilderness.class));
        cards.add(new SetCardInfo("Sengir Connoisseur", 104, Rarity.UNCOMMON, mage.cards.s.SengirConnoisseur.class));
        cards.add(new SetCardInfo("Serra Redeemer", 282, Rarity.RARE, mage.cards.s.SerraRedeemer.class));
        cards.add(new SetCardInfo("Shadow Prophecy", 105, Rarity.COMMON, mage.cards.s.ShadowProphecy.class));
        cards.add(new SetCardInfo("Shadow-Rite Priest", 106, Rarity.RARE, mage.cards.s.ShadowRitePriest.class));
        cards.add(new SetCardInfo("Shalai's Acolyte", 33, Rarity.UNCOMMON, mage.cards.s.ShalaisAcolyte.class));
        cards.add(new SetCardInfo("Shanna, Purifying Blade", 218, Rarity.MYTHIC, mage.cards.s.ShannaPurifyingBlade.class));
        cards.add(new SetCardInfo("Sheoldred's Restoration", 108, Rarity.UNCOMMON, mage.cards.s.SheoldredsRestoration.class));
        cards.add(new SetCardInfo("Sheoldred, the Apocalypse", 107, Rarity.MYTHIC, mage.cards.s.SheoldredTheApocalypse.class));
        cards.add(new SetCardInfo("Shield-Wall Sentinel", 238, Rarity.COMMON, mage.cards.s.ShieldWallSentinel.class));
        cards.add(new SetCardInfo("Shivan Devastator", 143, Rarity.MYTHIC, mage.cards.s.ShivanDevastator.class));
        cards.add(new SetCardInfo("Shivan Reef", 255, Rarity.RARE, mage.cards.s.ShivanReef.class));
        cards.add(new SetCardInfo("Shore Up", 64, Rarity.COMMON, mage.cards.s.ShoreUp.class));
        cards.add(new SetCardInfo("Silverback Elder", 177, Rarity.MYTHIC, mage.cards.s.SilverbackElder.class));
        cards.add(new SetCardInfo("Slimefoot's Survey", 178, Rarity.UNCOMMON, mage.cards.s.SlimefootsSurvey.class));
        cards.add(new SetCardInfo("Smash to Dust", 144, Rarity.COMMON, mage.cards.s.SmashToDust.class));
        cards.add(new SetCardInfo("Snarespinner", 179, Rarity.COMMON, mage.cards.s.Snarespinner.class));
        cards.add(new SetCardInfo("Soaring Drake", 66, Rarity.COMMON, mage.cards.s.SoaringDrake.class));
        cards.add(new SetCardInfo("Sol'Kanar the Tainted", 219, Rarity.MYTHIC, mage.cards.s.SolKanarTheTainted.class));
        cards.add(new SetCardInfo("Soul of Windgrace", 220, Rarity.MYTHIC, mage.cards.s.SoulOfWindgrace.class));
        cards.add(new SetCardInfo("Sphinx of Clear Skies", 67, Rarity.MYTHIC, mage.cards.s.SphinxOfClearSkies.class));
        cards.add(new SetCardInfo("Splatter Goblin", 109, Rarity.COMMON, mage.cards.s.SplatterGoblin.class));
        cards.add(new SetCardInfo("Sprouting Goblin", 145, Rarity.UNCOMMON, mage.cards.s.SproutingGoblin.class));
        cards.add(new SetCardInfo("Squee, Dubious Monarch", 146, Rarity.RARE, mage.cards.s.SqueeDubiousMonarch.class));
        cards.add(new SetCardInfo("Stall for Time", 34, Rarity.COMMON, mage.cards.s.StallForTime.class));
        cards.add(new SetCardInfo("Stenn, Paranoid Partisan", 221, Rarity.RARE, mage.cards.s.StennParanoidPartisan.class));
        cards.add(new SetCardInfo("Strength of the Coalition", 180, Rarity.UNCOMMON, mage.cards.s.StrengthOfTheCoalition.class));
        cards.add(new SetCardInfo("Stronghold Arena", 110, Rarity.RARE, mage.cards.s.StrongholdArena.class));
        cards.add(new SetCardInfo("Sulfurous Springs", 256, Rarity.RARE, mage.cards.s.SulfurousSprings.class));
        cards.add(new SetCardInfo("Sunbathing Rootwalla", 181, Rarity.COMMON, mage.cards.s.SunbathingRootwalla.class));
        cards.add(new SetCardInfo("Sunlit Marsh", 257, Rarity.COMMON, mage.cards.s.SunlitMarsh.class));
        cards.add(new SetCardInfo("Swamp", 268, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tail Swipe", 182, Rarity.UNCOMMON, mage.cards.t.TailSwipe.class));
        cards.add(new SetCardInfo("Take Up the Shield", 35, Rarity.COMMON, mage.cards.t.TakeUpTheShield.class));
        cards.add(new SetCardInfo("Talas Lookout", 68, Rarity.COMMON, mage.cards.t.TalasLookout.class));
        cards.add(new SetCardInfo("Tangled Islet", 258, Rarity.COMMON, mage.cards.t.TangledIslet.class));
        cards.add(new SetCardInfo("Tattered Apparition", 111, Rarity.COMMON, mage.cards.t.TatteredApparition.class));
        cards.add(new SetCardInfo("Tatyova, Steward of Tides", 222, Rarity.UNCOMMON, mage.cards.t.TatyovaStewardOfTides.class));
        cards.add(new SetCardInfo("Tear Asunder", 183, Rarity.UNCOMMON, mage.cards.t.TearAsunder.class));
        cards.add(new SetCardInfo("Temporal Firestorm", 147, Rarity.RARE, mage.cards.t.TemporalFirestorm.class));
        cards.add(new SetCardInfo("Temporary Lockdown", 36, Rarity.RARE, mage.cards.t.TemporaryLockdown.class));
        cards.add(new SetCardInfo("Territorial Maro", 184, Rarity.UNCOMMON, mage.cards.t.TerritorialMaro.class));
        cards.add(new SetCardInfo("The Cruelty of Gix", 87, Rarity.RARE, mage.cards.t.TheCrueltyOfGix.class));
        cards.add(new SetCardInfo("The Elder Dragon War", 121, Rarity.RARE, mage.cards.t.TheElderDragonWar.class));
        cards.add(new SetCardInfo("The Phasing of Zhalfir", 59, Rarity.RARE, mage.cards.t.ThePhasingOfZhalfir.class));
        cards.add(new SetCardInfo("The Raven Man", 103, Rarity.RARE, mage.cards.t.TheRavenMan.class));
        cards.add(new SetCardInfo("The Weatherseed Treaty", 188, Rarity.UNCOMMON, mage.cards.t.TheWeatherseedTreaty.class));
        cards.add(new SetCardInfo("The World Spell", 189, Rarity.MYTHIC, mage.cards.t.TheWorldSpell.class));
        cards.add(new SetCardInfo("Thran Portal", 259, Rarity.RARE, mage.cards.t.ThranPortal.class));
        cards.add(new SetCardInfo("Threats Undetected", 185, Rarity.RARE, mage.cards.t.ThreatsUndetected.class));
        cards.add(new SetCardInfo("Thrill of Possibility", 148, Rarity.COMMON, mage.cards.t.ThrillOfPossibility.class));
        cards.add(new SetCardInfo("Tidepool Turtle", 69, Rarity.COMMON, mage.cards.t.TidepoolTurtle.class));
        cards.add(new SetCardInfo("Timeless Lotus", 239, Rarity.MYTHIC, mage.cards.t.TimelessLotus.class));
        cards.add(new SetCardInfo("Timely Interference", 70, Rarity.COMMON, mage.cards.t.TimelyInterference.class));
        cards.add(new SetCardInfo("Tolarian Geyser", 71, Rarity.COMMON, mage.cards.t.TolarianGeyser.class));
        cards.add(new SetCardInfo("Tolarian Terror", 72, Rarity.COMMON, mage.cards.t.TolarianTerror.class));
        cards.add(new SetCardInfo("Tori D'Avenant, Fury Rider", 223, Rarity.UNCOMMON, mage.cards.t.ToriDAvenantFuryRider.class));
        cards.add(new SetCardInfo("Toxic Abomination", 112, Rarity.COMMON, mage.cards.t.ToxicAbomination.class));
        cards.add(new SetCardInfo("Tribute to Urborg", 113, Rarity.COMMON, mage.cards.t.TributeToUrborg.class));
        cards.add(new SetCardInfo("Tura Kennerud, Skyknight", 224, Rarity.UNCOMMON, mage.cards.t.TuraKennerudSkyknight.class));
        cards.add(new SetCardInfo("Twinferno", 149, Rarity.UNCOMMON, mage.cards.t.Twinferno.class));
        cards.add(new SetCardInfo("Urborg Lhurgoyf", 186, Rarity.RARE, mage.cards.u.UrborgLhurgoyf.class));
        cards.add(new SetCardInfo("Urborg Repossession", 114, Rarity.COMMON, mage.cards.u.UrborgRepossession.class));
        cards.add(new SetCardInfo("Urza Assembles the Titans", 37, Rarity.RARE, mage.cards.u.UrzaAssemblesTheTitans.class));
        cards.add(new SetCardInfo("Uurg, Spawn of Turg", 225, Rarity.UNCOMMON, mage.cards.u.UurgSpawnOfTurg.class));
        cards.add(new SetCardInfo("Valiant Veteran", 38, Rarity.RARE, mage.cards.v.ValiantVeteran.class));
        cards.add(new SetCardInfo("Vanquisher's Axe", 240, Rarity.COMMON, mage.cards.v.VanquishersAxe.class));
        cards.add(new SetCardInfo("Vesuvan Duplimancy", 73, Rarity.MYTHIC, mage.cards.v.VesuvanDuplimancy.class));
        cards.add(new SetCardInfo("Viashino Branchrider", 150, Rarity.COMMON, mage.cards.v.ViashinoBranchrider.class));
        cards.add(new SetCardInfo("Vineshaper Prodigy", 187, Rarity.COMMON, mage.cards.v.VineshaperProdigy.class));
        cards.add(new SetCardInfo("Voda Sea Scavenger", 74, Rarity.COMMON, mage.cards.v.VodaSeaScavenger.class));
        cards.add(new SetCardInfo("Vodalian Hexcatcher", 75, Rarity.RARE, mage.cards.v.VodalianHexcatcher.class));
        cards.add(new SetCardInfo("Vodalian Mindsinger", 76, Rarity.RARE, mage.cards.v.VodalianMindsinger.class));
        cards.add(new SetCardInfo("Volshe Tideturner", 77, Rarity.COMMON, mage.cards.v.VolsheTideturner.class));
        cards.add(new SetCardInfo("Walking Bulwark", 241, Rarity.UNCOMMON, mage.cards.w.WalkingBulwark.class));
        cards.add(new SetCardInfo("Warhost's Frenzy", 151, Rarity.UNCOMMON, mage.cards.w.WarhostsFrenzy.class));
        cards.add(new SetCardInfo("Weatherlight Compleated", 242, Rarity.MYTHIC, mage.cards.w.WeatherlightCompleated.class));
        cards.add(new SetCardInfo("Wingmantle Chaplain", 39, Rarity.UNCOMMON, mage.cards.w.WingmantleChaplain.class));
        cards.add(new SetCardInfo("Wooded Ridgeline", 260, Rarity.COMMON, mage.cards.w.WoodedRidgeline.class));
        cards.add(new SetCardInfo("Writhing Necromass", 115, Rarity.COMMON, mage.cards.w.WrithingNecromass.class));
        cards.add(new SetCardInfo("Yavimaya Coast", 261, Rarity.RARE, mage.cards.y.YavimayaCoast.class));
        cards.add(new SetCardInfo("Yavimaya Iconoclast", 190, Rarity.UNCOMMON, mage.cards.y.YavimayaIconoclast.class));
        cards.add(new SetCardInfo("Yavimaya Sojourner", 191, Rarity.COMMON, mage.cards.y.YavimayaSojourner.class));
        cards.add(new SetCardInfo("Yavimaya Steelcrusher", 152, Rarity.COMMON, mage.cards.y.YavimayaSteelcrusher.class));
        cards.add(new SetCardInfo("Yotia Declares War", 153, Rarity.UNCOMMON, mage.cards.y.YotiaDeclaresWar.class));
        cards.add(new SetCardInfo("Zar Ojanen, Scion of Efrava", 227, Rarity.UNCOMMON, mage.cards.z.ZarOjanenScionOfEfrava.class));
        cards.add(new SetCardInfo("Zur, Eternal Schemer", 228, Rarity.MYTHIC, mage.cards.z.ZurEternalSchemer.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zur, Eternal Schemer", 327, Rarity.MYTHIC, mage.cards.z.ZurEternalSchemer.class, NON_FULL_USE_VARIOUS));
    }

    @Override
    protected List<CardInfo> findSpecialCardsByRarity(Rarity rarity) {
        List<CardInfo> cardInfos = super.findSpecialCardsByRarity(rarity);
        cardInfos.addAll(CardRepository.instance.findCards(new CardCriteria()
                .setCodes(this.code)
                .rarities(rarity)
                .supertypes(SuperType.LEGENDARY)
                .types(CardType.CREATURE)
                .maxCardNumber(maxCardNumberInBooster)));
        return cardInfos;
    }

//    @Override
//    public BoosterCollator createCollator() {
//        return new DominariaUnitedCollator();
//    }
}
