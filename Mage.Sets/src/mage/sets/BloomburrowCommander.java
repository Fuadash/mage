package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class BloomburrowCommander extends ExpansionSet {

    private static final BloomburrowCommander instance = new BloomburrowCommander();

    public static BloomburrowCommander getInstance() {
        return instance;
    }

    private BloomburrowCommander() {
        super("Bloomburrow Commander", "BLC", ExpansionSet.buildDate(2024, 8, 2), SetType.SUPPLEMENTAL);
        this.hasBasicLands = false;

        cards.add(new SetCardInfo("Abrade", 191, Rarity.COMMON, mage.cards.a.Abrade.class));
        cards.add(new SetCardInfo("Academy Manufactor", 264, Rarity.RARE, mage.cards.a.AcademyManufactor.class));
        cards.add(new SetCardInfo("Adarkar Wastes", 291, Rarity.RARE, mage.cards.a.AdarkarWastes.class));
        cards.add(new SetCardInfo("Aether Channeler", 160, Rarity.RARE, mage.cards.a.AetherChanneler.class));
        cards.add(new SetCardInfo("Aetherize", 161, Rarity.UNCOMMON, mage.cards.a.Aetherize.class));
        cards.add(new SetCardInfo("Agate Instigator", 21, Rarity.RARE, mage.cards.a.AgateInstigator.class));
        cards.add(new SetCardInfo("An Offer You Can't Refuse", 170, Rarity.UNCOMMON, mage.cards.a.AnOfferYouCantRefuse.class));
        cards.add(new SetCardInfo("Angel of the Ruins", 134, Rarity.RARE, mage.cards.a.AngelOfTheRuins.class));
        cards.add(new SetCardInfo("Ant Queen", 80, Rarity.RARE, mage.cards.a.AntQueen.class));
        cards.add(new SetCardInfo("Arasta of the Endless Web", 205, Rarity.RARE, mage.cards.a.ArastaOfTheEndlessWeb.class));
        cards.add(new SetCardInfo("Arcane Signet", 127, Rarity.COMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Azorius Signet", 265, Rarity.UNCOMMON, mage.cards.a.AzoriusSignet.class));
        cards.add(new SetCardInfo("Baird, Steward of Argive", 135, Rarity.UNCOMMON, mage.cards.b.BairdStewardOfArgive.class));
        cards.add(new SetCardInfo("Baleful Strix", 86, Rarity.RARE, mage.cards.b.BalefulStrix.class));
        cards.add(new SetCardInfo("Barren Moor", 292, Rarity.UNCOMMON, mage.cards.b.BarrenMoor.class));
        cards.add(new SetCardInfo("Bastion of Remembrance", 179, Rarity.UNCOMMON, mage.cards.b.BastionOfRemembrance.class));
        cards.add(new SetCardInfo("Battlefield Forge", 293, Rarity.RARE, mage.cards.b.BattlefieldForge.class));
        cards.add(new SetCardInfo("Beast Within", 206, Rarity.UNCOMMON, mage.cards.b.BeastWithin.class));
        cards.add(new SetCardInfo("Beastmaster Ascension", 118, Rarity.RARE, mage.cards.b.BeastmasterAscension.class));
        cards.add(new SetCardInfo("Beledros Witherbloom", 247, Rarity.MYTHIC, mage.cards.b.BeledrosWitherbloom.class));
        cards.add(new SetCardInfo("Berserkers' Onslaught", 192, Rarity.RARE, mage.cards.b.BerserkersOnslaught.class));
        cards.add(new SetCardInfo("Bident of Thassa", 162, Rarity.RARE, mage.cards.b.BidentOfThassa.class));
        cards.add(new SetCardInfo("Big Score", 193, Rarity.COMMON, mage.cards.b.BigScore.class));
        cards.add(new SetCardInfo("Binding the Old Gods", 248, Rarity.UNCOMMON, mage.cards.b.BindingTheOldGods.class));
        cards.add(new SetCardInfo("Birds of Paradise", 81, Rarity.RARE, mage.cards.b.BirdsOfParadise.class));
        cards.add(new SetCardInfo("Blade Splicer", 136, Rarity.RARE, mage.cards.b.BladeSplicer.class));
        cards.add(new SetCardInfo("Blasphemous Act", 114, Rarity.RARE, mage.cards.b.BlasphemousAct.class));
        cards.add(new SetCardInfo("Bloodroot Apothecary", 27, Rarity.RARE, mage.cards.b.BloodrootApothecary.class));
        cards.add(new SetCardInfo("Body of Knowledge", 163, Rarity.RARE, mage.cards.b.BodyOfKnowledge.class));
        cards.add(new SetCardInfo("Bojuka Bog", 294, Rarity.COMMON, mage.cards.b.BojukaBog.class));
        cards.add(new SetCardInfo("Bootleggers' Stash", 207, Rarity.MYTHIC, mage.cards.b.BootleggersStash.class));
        cards.add(new SetCardInfo("Boros Signet", 128, Rarity.UNCOMMON, mage.cards.b.BorosSignet.class));
        cards.add(new SetCardInfo("Boss's Chauffeur", 137, Rarity.RARE, mage.cards.b.BosssChauffeur.class));
        cards.add(new SetCardInfo("Brightcap Badger", 28, Rarity.RARE, mage.cards.b.BrightcapBadger.class));
        cards.add(new SetCardInfo("Broken Wings", 208, Rarity.COMMON, mage.cards.b.BrokenWings.class));
        cards.add(new SetCardInfo("Brushland", 295, Rarity.RARE, mage.cards.b.Brushland.class));
        cards.add(new SetCardInfo("Burnished Hart", 266, Rarity.UNCOMMON, mage.cards.b.BurnishedHart.class));
        cards.add(new SetCardInfo("Calamity of Cinders", 23, Rarity.RARE, mage.cards.c.CalamityOfCinders.class));
        cards.add(new SetCardInfo("Canopy Vista", 296, Rarity.RARE, mage.cards.c.CanopyVista.class));
        cards.add(new SetCardInfo("Cascade Bluffs", 297, Rarity.RARE, mage.cards.c.CascadeBluffs.class));
        cards.add(new SetCardInfo("Castle Ardenvale", 298, Rarity.RARE, mage.cards.c.CastleArdenvale.class));
        cards.add(new SetCardInfo("Casualties of War", 125, Rarity.RARE, mage.cards.c.CasualtiesOfWar.class));
        cards.add(new SetCardInfo("Chaos Warp", 115, Rarity.RARE, mage.cards.c.ChaosWarp.class));
        cards.add(new SetCardInfo("Chart a Course", 110, Rarity.UNCOMMON, mage.cards.c.ChartACourse.class));
        cards.add(new SetCardInfo("Chasm Skulker", 164, Rarity.RARE, mage.cards.c.ChasmSkulker.class));
        cards.add(new SetCardInfo("Chatterfang, Squirrel General", 82, Rarity.MYTHIC, mage.cards.c.ChatterfangSquirrelGeneral.class));
        cards.add(new SetCardInfo("Chatterstorm", 210, Rarity.COMMON, mage.cards.c.Chatterstorm.class));
        cards.add(new SetCardInfo("Chittering Witch", 180, Rarity.RARE, mage.cards.c.ChitteringWitch.class));
        cards.add(new SetCardInfo("Chitterspitter", 211, Rarity.RARE, mage.cards.c.Chitterspitter.class));
        cards.add(new SetCardInfo("Cinder Glade", 299, Rarity.RARE, mage.cards.c.CinderGlade.class));
        cards.add(new SetCardInfo("Circuit Mender", 267, Rarity.UNCOMMON, mage.cards.c.CircuitMender.class));
        cards.add(new SetCardInfo("Clifftop Retreat", 300, Rarity.RARE, mage.cards.c.ClifftopRetreat.class));
        cards.add(new SetCardInfo("Cloudblazer", 249, Rarity.UNCOMMON, mage.cards.c.Cloudblazer.class));
        cards.add(new SetCardInfo("Coiling Oracle", 250, Rarity.COMMON, mage.cards.c.CoilingOracle.class));
        cards.add(new SetCardInfo("Combat Celebrant", 194, Rarity.MYTHIC, mage.cards.c.CombatCelebrant.class));
        cards.add(new SetCardInfo("Command Tower", 130, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Communal Brewing", 29, Rarity.RARE, mage.cards.c.CommunalBrewing.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Communal Brewing", 63, Rarity.RARE, mage.cards.c.CommunalBrewing.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Copperline Gorge", 301, Rarity.RARE, mage.cards.c.CopperlineGorge.class));
        cards.add(new SetCardInfo("Coveted Jewel", 268, Rarity.RARE, mage.cards.c.CovetedJewel.class));
        cards.add(new SetCardInfo("Cultivate", 212, Rarity.COMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Curiosity Crafter", 165, Rarity.RARE, mage.cards.c.CuriosityCrafter.class));
        cards.add(new SetCardInfo("Cut a Deal", 105, Rarity.UNCOMMON, mage.cards.c.CutADeal.class));
        cards.add(new SetCardInfo("Deadly Dispute", 181, Rarity.COMMON, mage.cards.d.DeadlyDispute.class));
        cards.add(new SetCardInfo("Decimate", 251, Rarity.RARE, mage.cards.d.Decimate.class));
        cards.add(new SetCardInfo("Decree of Pain", 182, Rarity.RARE, mage.cards.d.DecreeOfPain.class));
        cards.add(new SetCardInfo("Deep Forest Hermit", 213, Rarity.RARE, mage.cards.d.DeepForestHermit.class));
        cards.add(new SetCardInfo("Derevi, Empyrial Tactician", 87, Rarity.RARE, mage.cards.d.DereviEmpyrialTactician.class));
        cards.add(new SetCardInfo("Devilish Valet", 195, Rarity.RARE, mage.cards.d.DevilishValet.class));
        cards.add(new SetCardInfo("Domri, Anarch of Bolas", 98, Rarity.RARE, mage.cards.d.DomriAnarchOfBolas.class));
        cards.add(new SetCardInfo("Dusk // Dawn", 138, Rarity.RARE, mage.cards.d.DuskDawn.class));
        cards.add(new SetCardInfo("Elspeth, Sun's Champion", 97, Rarity.MYTHIC, mage.cards.e.ElspethSunsChampion.class));
        cards.add(new SetCardInfo("End-Raze Forerunners", 214, Rarity.RARE, mage.cards.e.EndRazeForerunners.class));
        cards.add(new SetCardInfo("Esika's Chariot", 215, Rarity.RARE, mage.cards.e.EsikasChariot.class));
        cards.add(new SetCardInfo("Etali, Primal Storm", 196, Rarity.RARE, mage.cards.e.EtaliPrimalStorm.class));
        cards.add(new SetCardInfo("Evolving Wilds", 302, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Exotic Orchard", 131, Rarity.RARE, mage.cards.e.ExoticOrchard.class));
        cards.add(new SetCardInfo("Explore", 216, Rarity.COMMON, mage.cards.e.Explore.class));
        cards.add(new SetCardInfo("Faeburrow Elder", 252, Rarity.RARE, mage.cards.f.FaeburrowElder.class));
        cards.add(new SetCardInfo("Farseek", 119, Rarity.UNCOMMON, mage.cards.f.Farseek.class));
        cards.add(new SetCardInfo("Fellwar Stone", 269, Rarity.UNCOMMON, mage.cards.f.FellwarStone.class));
        cards.add(new SetCardInfo("Ferrous Lake", 303, Rarity.RARE, mage.cards.f.FerrousLake.class));
        cards.add(new SetCardInfo("Flooded Grove", 304, Rarity.RARE, mage.cards.f.FloodedGrove.class));
        cards.add(new SetCardInfo("Flubs, the Fool", 356, Rarity.MYTHIC, mage.cards.f.FlubsTheFool.class));
        cards.add(new SetCardInfo("Forgotten Ancient", 217, Rarity.RARE, mage.cards.f.ForgottenAncient.class));
        cards.add(new SetCardInfo("Forgotten Cave", 305, Rarity.COMMON, mage.cards.f.ForgottenCave.class));
        cards.add(new SetCardInfo("Fortune Teller's Talent", 14, Rarity.RARE, mage.cards.f.FortuneTellersTalent.class));
        cards.add(new SetCardInfo("Game Trail", 306, Rarity.RARE, mage.cards.g.GameTrail.class));
        cards.add(new SetCardInfo("Garruk's Packleader", 218, Rarity.UNCOMMON, mage.cards.g.GarruksPackleader.class));
        cards.add(new SetCardInfo("Garruk's Uprising", 219, Rarity.UNCOMMON, mage.cards.g.GarruksUprising.class));
        cards.add(new SetCardInfo("Garruk, Cursed Huntsman", 99, Rarity.MYTHIC, mage.cards.g.GarrukCursedHuntsman.class));
        cards.add(new SetCardInfo("Generous Gift", 106, Rarity.UNCOMMON, mage.cards.g.GenerousGift.class));
        cards.add(new SetCardInfo("Ghalta, Primal Hunger", 220, Rarity.RARE, mage.cards.g.GhaltaPrimalHunger.class));
        cards.add(new SetCardInfo("Ghirapur Orrery", 270, Rarity.RARE, mage.cards.g.GhirapurOrrery.class));
        cards.add(new SetCardInfo("Gilded Goose", 83, Rarity.RARE, mage.cards.g.GildedGoose.class));
        cards.add(new SetCardInfo("Gilded Lotus", 271, Rarity.RARE, mage.cards.g.GildedLotus.class));
        cards.add(new SetCardInfo("Glacial Fortress", 307, Rarity.RARE, mage.cards.g.GlacialFortress.class));
        cards.add(new SetCardInfo("Golgari Rot Farm", 308, Rarity.UNCOMMON, mage.cards.g.GolgariRotFarm.class));
        cards.add(new SetCardInfo("Golgari Signet", 272, Rarity.UNCOMMON, mage.cards.g.GolgariSignet.class));
        cards.add(new SetCardInfo("Goreclaw, Terror of Qal Sisma", 222, Rarity.RARE, mage.cards.g.GoreclawTerrorOfQalSisma.class));
        cards.add(new SetCardInfo("Gratuitous Violence", 197, Rarity.RARE, mage.cards.g.GratuitousViolence.class));
        cards.add(new SetCardInfo("Greater Good", 223, Rarity.RARE, mage.cards.g.GreaterGood.class));
        cards.add(new SetCardInfo("Grim Backwoods", 309, Rarity.RARE, mage.cards.g.GrimBackwoods.class));
        cards.add(new SetCardInfo("Grothama, All-Devouring", 224, Rarity.MYTHIC, mage.cards.g.GrothamaAllDevouring.class));
        cards.add(new SetCardInfo("Grumgully, the Generous", 253, Rarity.UNCOMMON, mage.cards.g.GrumgullyTheGenerous.class));
        cards.add(new SetCardInfo("Gruul Signet", 273, Rarity.UNCOMMON, mage.cards.g.GruulSignet.class));
        cards.add(new SetCardInfo("Gruul Turf", 310, Rarity.COMMON, mage.cards.g.GruulTurf.class));
        cards.add(new SetCardInfo("Hanged Executioner", 139, Rarity.RARE, mage.cards.h.HangedExecutioner.class));
        cards.add(new SetCardInfo("Harmonize", 120, Rarity.UNCOMMON, mage.cards.h.Harmonize.class));
        cards.add(new SetCardInfo("Haunted Mire", 311, Rarity.COMMON, mage.cards.h.HauntedMire.class));
        cards.add(new SetCardInfo("Haywire Mite", 274, Rarity.UNCOMMON, mage.cards.h.HaywireMite.class));
        cards.add(new SetCardInfo("Hedron Archive", 275, Rarity.UNCOMMON, mage.cards.h.HedronArchive.class));
        cards.add(new SetCardInfo("Helm of the Host", 276, Rarity.RARE, mage.cards.h.HelmOfTheHost.class));
        cards.add(new SetCardInfo("Hinterland Harbor", 312, Rarity.RARE, mage.cards.h.HinterlandHarbor.class));
        cards.add(new SetCardInfo("Hoofprints of the Stag", 140, Rarity.RARE, mage.cards.h.HoofprintsOfTheStag.class));
        cards.add(new SetCardInfo("Idol of Oblivion", 277, Rarity.RARE, mage.cards.i.IdolOfOblivion.class));
        cards.add(new SetCardInfo("Illusionist's Gambit", 166, Rarity.RARE, mage.cards.i.IllusionistsGambit.class));
        cards.add(new SetCardInfo("Illusory Ambusher", 167, Rarity.UNCOMMON, mage.cards.i.IllusoryAmbusher.class));
        cards.add(new SetCardInfo("Inferno Titan", 198, Rarity.MYTHIC, mage.cards.i.InfernoTitan.class));
        cards.add(new SetCardInfo("Ink-Eyes, Servant of Oni", 77, Rarity.RARE, mage.cards.i.InkEyesServantOfOni.class));
        cards.add(new SetCardInfo("Inspiring Overseer", 141, Rarity.COMMON, mage.cards.i.InspiringOverseer.class));
        cards.add(new SetCardInfo("Intellectual Offering", 168, Rarity.RARE, mage.cards.i.IntellectualOffering.class));
        cards.add(new SetCardInfo("Ishai, Ojutai Dragonspeaker", 89, Rarity.MYTHIC, mage.cards.i.IshaiOjutaiDragonspeaker.class));
        cards.add(new SetCardInfo("Izzet Signet", 278, Rarity.UNCOMMON, mage.cards.i.IzzetSignet.class));
        cards.add(new SetCardInfo("Jace, the Mind Sculptor", 75, Rarity.MYTHIC, mage.cards.j.JaceTheMindSculptor.class));
        cards.add(new SetCardInfo("Jacked Rabbit", 9, Rarity.RARE, mage.cards.j.JackedRabbit.class));
        cards.add(new SetCardInfo("Jazal Goldmane", 142, Rarity.RARE, mage.cards.j.JazalGoldmane.class));
        cards.add(new SetCardInfo("Jolrael, Mwonvuli Recluse", 225, Rarity.RARE, mage.cards.j.JolraelMwonvuliRecluse.class));
        cards.add(new SetCardInfo("Jungle Hollow", 313, Rarity.COMMON, mage.cards.j.JungleHollow.class));
        cards.add(new SetCardInfo("Junk Winder", 169, Rarity.UNCOMMON, mage.cards.j.JunkWinder.class));
        cards.add(new SetCardInfo("Kalonian Hydra", 226, Rarity.MYTHIC, mage.cards.k.KalonianHydra.class));
        cards.add(new SetCardInfo("Karn, the Great Creator", 73, Rarity.MYTHIC, mage.cards.k.KarnTheGreatCreator.class));
        cards.add(new SetCardInfo("Karplusan Forest", 314, Rarity.RARE, mage.cards.k.KarplusanForest.class));
        cards.add(new SetCardInfo("Kodama of the East Tree", 227, Rarity.RARE, mage.cards.k.KodamaOfTheEastTree.class));
        cards.add(new SetCardInfo("Kwain, Itinerant Meddler", 90, Rarity.RARE, mage.cards.k.KwainItinerantMeddler.class));
        cards.add(new SetCardInfo("Kykar, Wind's Fury", 91, Rarity.MYTHIC, mage.cards.k.KykarWindsFury.class));
        cards.add(new SetCardInfo("Liliana of the Dark Realms", 78, Rarity.MYTHIC, mage.cards.l.LilianaOfTheDarkRealms.class));
        cards.add(new SetCardInfo("Llanowar Loamspeaker", 228, Rarity.RARE, mage.cards.l.LlanowarLoamspeaker.class));
        cards.add(new SetCardInfo("Llanowar Wastes", 315, Rarity.RARE, mage.cards.l.LlanowarWastes.class));
        cards.add(new SetCardInfo("Loran of the Third Path", 143, Rarity.RARE, mage.cards.l.LoranOfTheThirdPath.class));
        cards.add(new SetCardInfo("Lotus Cobra", 229, Rarity.RARE, mage.cards.l.LotusCobra.class));
        cards.add(new SetCardInfo("Loyal Warhound", 107, Rarity.RARE, mage.cards.l.LoyalWarhound.class));
        cards.add(new SetCardInfo("Luminous Broodmoth", 74, Rarity.MYTHIC, mage.cards.l.LuminousBroodmoth.class));
        cards.add(new SetCardInfo("Maelstrom Pulse", 126, Rarity.RARE, mage.cards.m.MaelstromPulse.class));
        cards.add(new SetCardInfo("Managorger Hydra", 230, Rarity.RARE, mage.cards.m.ManagorgerHydra.class));
        cards.add(new SetCardInfo("Mangara, the Diplomat", 145, Rarity.MYTHIC, mage.cards.m.MangaraTheDiplomat.class));
        cards.add(new SetCardInfo("Marrow-Gnawer", 79, Rarity.RARE, mage.cards.m.MarrowGnawer.class));
        cards.add(new SetCardInfo("Martial Coup", 146, Rarity.RARE, mage.cards.m.MartialCoup.class));
        cards.add(new SetCardInfo("Martial Impetus", 108, Rarity.UNCOMMON, mage.cards.m.MartialImpetus.class));
        cards.add(new SetCardInfo("Maskwood Nexus", 279, Rarity.RARE, mage.cards.m.MaskwoodNexus.class));
        cards.add(new SetCardInfo("Mind Stone", 280, Rarity.UNCOMMON, mage.cards.m.MindStone.class));
        cards.add(new SetCardInfo("Moldervine Reclamation", 255, Rarity.UNCOMMON, mage.cards.m.MoldervineReclamation.class));
        cards.add(new SetCardInfo("Moonstone Eulogist", 19, Rarity.RARE, mage.cards.m.MoonstoneEulogist.class));
        cards.add(new SetCardInfo("Morbid Opportunist", 183, Rarity.UNCOMMON, mage.cards.m.MorbidOpportunist.class));
        cards.add(new SetCardInfo("Mossfire Valley", 316, Rarity.RARE, mage.cards.m.MossfireValley.class));
        cards.add(new SetCardInfo("Mosswort Bridge", 317, Rarity.RARE, mage.cards.m.MosswortBridge.class));
        cards.add(new SetCardInfo("Murmuration", 10, Rarity.RARE, mage.cards.m.Murmuration.class));
        cards.add(new SetCardInfo("Mystic Monastery", 318, Rarity.UNCOMMON, mage.cards.m.MysticMonastery.class));
        cards.add(new SetCardInfo("Nadier's Nightblade", 184, Rarity.UNCOMMON, mage.cards.n.NadiersNightblade.class));
        cards.add(new SetCardInfo("Narset, Parter of Veils", 76, Rarity.RARE, mage.cards.n.NarsetParterOfVeils.class));
        cards.add(new SetCardInfo("Necroblossom Snarl", 319, Rarity.RARE, mage.cards.n.NecroblossomSnarl.class));
        cards.add(new SetCardInfo("Nested Shambler", 185, Rarity.COMMON, mage.cards.n.NestedShambler.class));
        cards.add(new SetCardInfo("Nissa, Who Shakes the World", 84, Rarity.RARE, mage.cards.n.NissaWhoShakesTheWorld.class));
        cards.add(new SetCardInfo("Octomancer", 37, Rarity.RARE, mage.cards.o.Octomancer.class));
        cards.add(new SetCardInfo("Ogre Slumlord", 186, Rarity.RARE, mage.cards.o.OgreSlumlord.class));
        cards.add(new SetCardInfo("Oran-Rief, the Vastwood", 320, Rarity.RARE, mage.cards.o.OranRiefTheVastwood.class));
        cards.add(new SetCardInfo("Ornithopter of Paradise", 281, Rarity.COMMON, mage.cards.o.OrnithopterOfParadise.class));
        cards.add(new SetCardInfo("Outpost Siege", 199, Rarity.RARE, mage.cards.o.OutpostSiege.class));
        cards.add(new SetCardInfo("Overflowing Basin", 321, Rarity.RARE, mage.cards.o.OverflowingBasin.class));
        cards.add(new SetCardInfo("Path of Ancestry", 322, Rarity.COMMON, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Path of Discovery", 231, Rarity.RARE, mage.cards.p.PathOfDiscovery.class));
        cards.add(new SetCardInfo("Path to Exile", 147, Rarity.UNCOMMON, mage.cards.p.PathToExile.class));
        cards.add(new SetCardInfo("Perch Protection", 11, Rarity.RARE, mage.cards.p.PerchProtection.class));
        cards.add(new SetCardInfo("Perplexing Test", 171, Rarity.RARE, mage.cards.p.PerplexingTest.class));
        cards.add(new SetCardInfo("Plaguecrafter", 187, Rarity.UNCOMMON, mage.cards.p.Plaguecrafter.class));
        cards.add(new SetCardInfo("Plumb the Forbidden", 188, Rarity.UNCOMMON, mage.cards.p.PlumbTheForbidden.class));
        cards.add(new SetCardInfo("Poison-Tip Archer", 256, Rarity.UNCOMMON, mage.cards.p.PoisonTipArcher.class));
        cards.add(new SetCardInfo("Pollywog Prodigy", 15, Rarity.RARE, mage.cards.p.PollywogProdigy.class));
        cards.add(new SetCardInfo("Prairie Stream", 323, Rarity.RARE, mage.cards.p.PrairieStream.class));
        cards.add(new SetCardInfo("Primeval Bounty", 232, Rarity.MYTHIC, mage.cards.p.PrimevalBounty.class));
        cards.add(new SetCardInfo("Promise of Loyalty", 148, Rarity.RARE, mage.cards.p.PromiseOfLoyalty.class));
        cards.add(new SetCardInfo("Prosperous Bandit", 25, Rarity.RARE, mage.cards.p.ProsperousBandit.class));
        cards.add(new SetCardInfo("Prosperous Innkeeper", 121, Rarity.UNCOMMON, mage.cards.p.ProsperousInnkeeper.class));
        cards.add(new SetCardInfo("Psychosis Crawler", 282, Rarity.RARE, mage.cards.p.PsychosisCrawler.class));
        cards.add(new SetCardInfo("Pull from Tomorrow", 172, Rarity.RARE, mage.cards.p.PullFromTomorrow.class));
        cards.add(new SetCardInfo("Putrefy", 257, Rarity.UNCOMMON, mage.cards.p.Putrefy.class));
        cards.add(new SetCardInfo("Pyreswipe Hawk", 26, Rarity.RARE, mage.cards.p.PyreswipeHawk.class));
        cards.add(new SetCardInfo("Raging Ravine", 324, Rarity.RARE, mage.cards.r.RagingRavine.class));
        cards.add(new SetCardInfo("Rain of Riches", 200, Rarity.RARE, mage.cards.r.RainOfRiches.class));
        cards.add(new SetCardInfo("Rampaging Baloths", 233, Rarity.MYTHIC, mage.cards.r.RampagingBaloths.class));
        cards.add(new SetCardInfo("Rampant Growth", 234, Rarity.COMMON, mage.cards.r.RampantGrowth.class));
        cards.add(new SetCardInfo("Rapid Hybridization", 111, Rarity.UNCOMMON, mage.cards.r.RapidHybridization.class));
        cards.add(new SetCardInfo("Ravenous Squirrel", 258, Rarity.UNCOMMON, mage.cards.r.RavenousSquirrel.class));
        cards.add(new SetCardInfo("Razorverge Thicket", 325, Rarity.RARE, mage.cards.r.RazorvergeThicket.class));
        cards.add(new SetCardInfo("Realm-Cloaked Giant", 149, Rarity.MYTHIC, mage.cards.r.RealmCloakedGiant.class));
        cards.add(new SetCardInfo("Reliquary Tower", 132, Rarity.UNCOMMON, mage.cards.r.ReliquaryTower.class));
        cards.add(new SetCardInfo("Restoration Angel", 150, Rarity.RARE, mage.cards.r.RestorationAngel.class));
        cards.add(new SetCardInfo("Riot Control", 151, Rarity.COMMON, mage.cards.r.RiotControl.class));
        cards.add(new SetCardInfo("Rishkar, Peema Renegade", 235, Rarity.RARE, mage.cards.r.RishkarPeemaRenegade.class));
        cards.add(new SetCardInfo("Rites of Flourishing", 122, Rarity.RARE, mage.cards.r.RitesOfFlourishing.class));
        cards.add(new SetCardInfo("Rolling Hamsphere", 39, Rarity.RARE, mage.cards.r.RollingHamsphere.class));
        cards.add(new SetCardInfo("Rootbound Crag", 326, Rarity.RARE, mage.cards.r.RootboundCrag.class));
        cards.add(new SetCardInfo("Rootcast Apprenticeship", 32, Rarity.RARE, mage.cards.r.RootcastApprenticeship.class));
        cards.add(new SetCardInfo("Rose Room Treasurer", 201, Rarity.RARE, mage.cards.r.RoseRoomTreasurer.class));
        cards.add(new SetCardInfo("Rowdy Research", 173, Rarity.UNCOMMON, mage.cards.r.RowdyResearch.class));
        cards.add(new SetCardInfo("Rugged Prairie", 327, Rarity.RARE, mage.cards.r.RuggedPrairie.class));
        cards.add(new SetCardInfo("Sakura-Tribe Elder", 236, Rarity.COMMON, mage.cards.s.SakuraTribeElder.class));
        cards.add(new SetCardInfo("Saw in Half", 113, Rarity.RARE, mage.cards.s.SawInHalf.class));
        cards.add(new SetCardInfo("Scurry of Squirrels", 33, Rarity.RARE, mage.cards.s.ScurryOfSquirrels.class));
        cards.add(new SetCardInfo("Seachrome Coast", 328, Rarity.RARE, mage.cards.s.SeachromeCoast.class));
        cards.add(new SetCardInfo("Seaside Citadel", 329, Rarity.UNCOMMON, mage.cards.s.SeasideCitadel.class));
        cards.add(new SetCardInfo("Second Harvest", 123, Rarity.RARE, mage.cards.s.SecondHarvest.class));
        cards.add(new SetCardInfo("Secret Rendezvous", 152, Rarity.UNCOMMON, mage.cards.s.SecretRendezvous.class));
        cards.add(new SetCardInfo("Selfless Spirit", 153, Rarity.RARE, mage.cards.s.SelflessSpirit.class));
        cards.add(new SetCardInfo("Selvala, Explorer Returned", 259, Rarity.RARE, mage.cards.s.SelvalaExplorerReturned.class));
        cards.add(new SetCardInfo("Shamanic Revelation", 237, Rarity.RARE, mage.cards.s.ShamanicRevelation.class));
        cards.add(new SetCardInfo("Sheltered Thicket", 330, Rarity.RARE, mage.cards.s.ShelteredThicket.class));
        cards.add(new SetCardInfo("Shield Broker", 174, Rarity.RARE, mage.cards.s.ShieldBroker.class));
        cards.add(new SetCardInfo("Shivan Reef", 331, Rarity.RARE, mage.cards.s.ShivanReef.class));
        cards.add(new SetCardInfo("Siege-Gang Commander", 202, Rarity.RARE, mage.cards.s.SiegeGangCommander.class));
        cards.add(new SetCardInfo("Simic Ascendancy", 260, Rarity.RARE, mage.cards.s.SimicAscendancy.class));
        cards.add(new SetCardInfo("Skullclamp", 283, Rarity.UNCOMMON, mage.cards.s.Skullclamp.class));
        cards.add(new SetCardInfo("Skyclave Apparition", 154, Rarity.RARE, mage.cards.s.SkyclaveApparition.class));
        cards.add(new SetCardInfo("Skycloud Expanse", 332, Rarity.RARE, mage.cards.s.SkycloudExpanse.class));
        cards.add(new SetCardInfo("Skyfisher Spider", 261, Rarity.UNCOMMON, mage.cards.s.SkyfisherSpider.class));
        cards.add(new SetCardInfo("Sol Ring", 129, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 284, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Sphinx of Enlightenment", 175, Rarity.MYTHIC, mage.cards.s.SphinxOfEnlightenment.class));
        cards.add(new SetCardInfo("Spine of Ish Sah", 285, Rarity.RARE, mage.cards.s.SpineOfIshSah.class));
        cards.add(new SetCardInfo("Spirited Companion", 155, Rarity.COMMON, mage.cards.s.SpiritedCompanion.class));
        cards.add(new SetCardInfo("Spore Frog", 238, Rarity.COMMON, mage.cards.s.SporeFrog.class));
        cards.add(new SetCardInfo("Squirrel Mob", 85, Rarity.RARE, mage.cards.s.SquirrelMob.class));
        cards.add(new SetCardInfo("Squirrel Nest", 239, Rarity.UNCOMMON, mage.cards.s.SquirrelNest.class));
        cards.add(new SetCardInfo("Squirrel Sovereign", 240, Rarity.UNCOMMON, mage.cards.s.SquirrelSovereign.class));
        cards.add(new SetCardInfo("Starstorm", 203, Rarity.RARE, mage.cards.s.Starstorm.class));
        cards.add(new SetCardInfo("Steelburr Champion", 12, Rarity.RARE, mage.cards.s.SteelburrChampion.class));
        cards.add(new SetCardInfo("Stolen by the Fae", 176, Rarity.RARE, mage.cards.s.StolenByTheFae.class));
        cards.add(new SetCardInfo("Storm of Souls", 156, Rarity.RARE, mage.cards.s.StormOfSouls.class));
        cards.add(new SetCardInfo("Sulfur Falls", 333, Rarity.RARE, mage.cards.s.SulfurFalls.class));
        cards.add(new SetCardInfo("Sun Titan", 157, Rarity.MYTHIC, mage.cards.s.SunTitan.class));
        cards.add(new SetCardInfo("Sunbird's Invocation", 116, Rarity.RARE, mage.cards.s.SunbirdsInvocation.class));
        cards.add(new SetCardInfo("Sungrass Prairie", 334, Rarity.RARE, mage.cards.s.SungrassPrairie.class));
        cards.add(new SetCardInfo("Sunpetal Grove", 335, Rarity.RARE, mage.cards.s.SunpetalGrove.class));
        cards.add(new SetCardInfo("Sunscorch Regent", 158, Rarity.RARE, mage.cards.s.SunscorchRegent.class));
        cards.add(new SetCardInfo("Sunscorched Divide", 336, Rarity.RARE, mage.cards.s.SunscorchedDivide.class));
        cards.add(new SetCardInfo("Swarmyard", 133, Rarity.RARE, mage.cards.s.Swarmyard.class));
        cards.add(new SetCardInfo("Swiftfoot Boots", 286, Rarity.UNCOMMON, mage.cards.s.SwiftfootBoots.class));
        cards.add(new SetCardInfo("Swords to Plowshares", 109, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Tainted Wood", 337, Rarity.UNCOMMON, mage.cards.t.TaintedWood.class));
        cards.add(new SetCardInfo("Talisman of Impulse", 287, Rarity.UNCOMMON, mage.cards.t.TalismanOfImpulse.class));
        cards.add(new SetCardInfo("Talisman of Resilience", 288, Rarity.UNCOMMON, mage.cards.t.TalismanOfResilience.class));
        cards.add(new SetCardInfo("Tamiyo, Field Researcher", 100, Rarity.MYTHIC, mage.cards.t.TamiyoFieldResearcher.class));
        cards.add(new SetCardInfo("Tear Asunder", 241, Rarity.UNCOMMON, mage.cards.t.TearAsunder.class));
        cards.add(new SetCardInfo("Teferi, Time Raveler", 92, Rarity.RARE, mage.cards.t.TeferiTimeRaveler.class));
        cards.add(new SetCardInfo("Temple of Abandon", 338, Rarity.RARE, mage.cards.t.TempleOfAbandon.class));
        cards.add(new SetCardInfo("Temple of Enlightenment", 339, Rarity.RARE, mage.cards.t.TempleOfEnlightenment.class));
        cards.add(new SetCardInfo("Temple of Epiphany", 340, Rarity.RARE, mage.cards.t.TempleOfEpiphany.class));
        cards.add(new SetCardInfo("Temple of Malady", 341, Rarity.RARE, mage.cards.t.TempleOfMalady.class));
        cards.add(new SetCardInfo("Temple of Mystery", 342, Rarity.RARE, mage.cards.t.TempleOfMystery.class));
        cards.add(new SetCardInfo("Temple of Plenty", 343, Rarity.RARE, mage.cards.t.TempleOfPlenty.class));
        cards.add(new SetCardInfo("Temple of Triumph", 344, Rarity.RARE, mage.cards.t.TempleOfTriumph.class));
        cards.add(new SetCardInfo("Tempt with Discovery", 124, Rarity.RARE, mage.cards.t.TemptWithDiscovery.class));
        cards.add(new SetCardInfo("Tendershoot Dryad", 242, Rarity.RARE, mage.cards.t.TendershootDryad.class));
        cards.add(new SetCardInfo("Tenuous Truce", 159, Rarity.RARE, mage.cards.t.TenuousTruce.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 345, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Tetsuko Umezawa, Fugitive", 177, Rarity.UNCOMMON, mage.cards.t.TetsukoUmezawaFugitive.class));
        cards.add(new SetCardInfo("The Gitrog Monster", 88, Rarity.MYTHIC, mage.cards.t.TheGitrogMonster.class));
        cards.add(new SetCardInfo("Thopter Engineer", 204, Rarity.UNCOMMON, mage.cards.t.ThopterEngineer.class));
        cards.add(new SetCardInfo("Thought Vessel", 289, Rarity.COMMON, mage.cards.t.ThoughtVessel.class));
        cards.add(new SetCardInfo("Thran Dynamo", 290, Rarity.UNCOMMON, mage.cards.t.ThranDynamo.class));
        cards.add(new SetCardInfo("Thriving Bluff", 346, Rarity.COMMON, mage.cards.t.ThrivingBluff.class));
        cards.add(new SetCardInfo("Thriving Grove", 347, Rarity.COMMON, mage.cards.t.ThrivingGrove.class));
        cards.add(new SetCardInfo("Thriving Heath", 348, Rarity.COMMON, mage.cards.t.ThrivingHeath.class));
        cards.add(new SetCardInfo("Thriving Isle", 349, Rarity.COMMON, mage.cards.t.ThrivingIsle.class));
        cards.add(new SetCardInfo("Time Wipe", 262, Rarity.RARE, mage.cards.t.TimeWipe.class));
        cards.add(new SetCardInfo("Tireless Provisioner", 243, Rarity.UNCOMMON, mage.cards.t.TirelessProvisioner.class));
        cards.add(new SetCardInfo("Toski, Bearer of Secrets", 244, Rarity.RARE, mage.cards.t.ToskiBearerOfSecrets.class));
        cards.add(new SetCardInfo("Trailtracker Scout", 35, Rarity.RARE, mage.cards.t.TrailtrackerScout.class));
        cards.add(new SetCardInfo("Tranquil Thicket", 350, Rarity.COMMON, mage.cards.t.TranquilThicket.class));
        cards.add(new SetCardInfo("Triskaidekaphile", 178, Rarity.RARE, mage.cards.t.Triskaidekaphile.class));
        cards.add(new SetCardInfo("Twenty-Toed Toad", 16, Rarity.RARE, mage.cards.t.TwentyToedToad.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Twenty-Toed Toad", 51, Rarity.RARE, mage.cards.t.TwentyToedToad.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Twilight Mire", 351, Rarity.RARE, mage.cards.t.TwilightMire.class));
        cards.add(new SetCardInfo("Unnatural Growth", 245, Rarity.RARE, mage.cards.u.UnnaturalGrowth.class));
        cards.add(new SetCardInfo("Viridescent Bog", 352, Rarity.RARE, mage.cards.v.ViridescentBog.class));
        cards.add(new SetCardInfo("Warstorm Surge", 117, Rarity.RARE, mage.cards.w.WarstormSurge.class));
        cards.add(new SetCardInfo("Wildsear, Scouring Maw", 8, Rarity.MYTHIC, mage.cards.w.WildsearScouringMaw.class));
        cards.add(new SetCardInfo("Windgrace's Judgment", 263, Rarity.RARE, mage.cards.w.WindgracesJudgment.class));
        cards.add(new SetCardInfo("Wizard Class", 112, Rarity.UNCOMMON, mage.cards.w.WizardClass.class));
        cards.add(new SetCardInfo("Woe Strider", 189, Rarity.RARE, mage.cards.w.WoeStrider.class));
        cards.add(new SetCardInfo("Wolfwillow Haven", 246, Rarity.UNCOMMON, mage.cards.w.WolfwillowHaven.class));
        cards.add(new SetCardInfo("Wooded Ridgeline", 353, Rarity.COMMON, mage.cards.w.WoodedRidgeline.class));
        cards.add(new SetCardInfo("Woodland Cemetery", 354, Rarity.RARE, mage.cards.w.WoodlandCemetery.class));
        cards.add(new SetCardInfo("Yavimaya Coast", 355, Rarity.RARE, mage.cards.y.YavimayaCoast.class));
        cards.add(new SetCardInfo("Zulaport Cutthroat", 190, Rarity.UNCOMMON, mage.cards.z.ZulaportCutthroat.class));
    }
}
