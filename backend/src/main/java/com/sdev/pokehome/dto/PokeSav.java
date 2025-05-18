package com.sdev.pokehome.dto;

import java.util.ArrayList;

public class PokeSav {

    _personal _personalObject;
    private String Small;
    private String Large;
    private String Storage;
    private String Data;
    ArrayList<Object> TeamSlots = new ArrayList<Object>();
    private float ActiveSlot;
    private float Version;
    Personal PersonalObject;
    private float EventFlagCount;
    private float EventWorkCount;
    private float DaycareSlotSize;
    private float EggEventFlag;
    private float BadgeFlagStart;
    private float EventFlag;
    private float EventWork;
    private float PokeDex;
    private float DaycareOffset;
    private boolean NationalDex;
    private float BerryPowder;
    private float JoyfulJumpInRow;
    private float JoyfulJump5InRow;
    private float JoyfulJumpGamesMaxPlayers;
    private float JoyfulJumpScore;
    private float JoyfulBerriesScore;
    private float JoyfulBerriesInRow;
    private float JoyfulBerries5InRow;
    private float SecurityKey;
    private float PartyCount;
    private float Money;
    private float Coin;
    private float SeenOffset2;
    private float MailOffset;
    private float PKHeX_Core_IDaycareRandomStateSystem_UInt16_Seed;
    private float ExternalEventData;
    private float WonderOffset;
    private float WonderCardOffset;
    private float WonderCardExtraOffset;
    WonderNews WonderNewsObject;
    WonderCard WonderCardObject;
    WonderCardExtra WonderCardExtraObject;
    MysteryData MysteryDataObject;
    private float SeenOffset3;
    private String RivalName;
    private String ShortSummary;
    private String Extension;
    private float SaveRevision;
    private String SaveRevisionString;
    private boolean Japanese;
    private boolean Korean;
    private float Language;
    private boolean IsMisconfiguredSize;
    private float SIZE_STORED;
    private float SIZE_PARTY;
    BlankPKM BlankPKMObject;
    private String PKMType;
    private float MaxMoveID;
    private float MaxSpeciesID;
    private float MaxAbilityID;
    private float MaxItemID;
    private float MaxBallID;
    private float MaxGameID;
    private float BoxCount;
    private float MaxEV;
    private float Generation;
    private float Context;
    private float MaxStringLengthTrainer;
    private float MaxStringLengthNickname;
    private float MaxMoney;
    private boolean HasParty;
    private boolean ChecksumsValid;
    private String ChecksumInfo;
    private String OT;
    private float Gender;
    private float ID32;
    private float TID16;
    private float SID16;
    private float PlayedHours;
    private float PlayedMinutes;
    private float PlayedSeconds;
    private float PlayedFrames;
    private float Badges;
    ArrayList<Object> Inventory = new ArrayList<Object>();
    private boolean HasPokeDex;
    private float DaycareSlotCount;
    private boolean IsEggAvailable;
    private float CurrentBox;
    private float DexPIDUnown;
    private float DexPIDSpinda;
    private float DexUnownForm;
    private float PokedexSort;
    private float PokedexMode;
    private float PokedexNationalMagicRSE;
    private float PokedexNationalMagicFRLG;
    private String EBerryName;
    private boolean IsEBerryEngima;
    private float ExternalEventFlags;
    private float ColosseumRaw1;
    private float ColosseumRaw2;
    private float ColosseumCoupons;
    private boolean ColosseumPokeCouponTitleGold;
    private boolean ColosseumPokeCouponTitleSilver;
    private boolean ColosseumPokeCouponTitleBronze;
    private boolean ColosseumReceivedAgeto;
    private float ColosseumCouponsTotal;
    private boolean HasUsedRSBOX;
    private float RSBoxDepositEggsUnlocked;
    private boolean HasReceivedWishmkrJirachi;
    State StateObject;
    Metadata MetadataObject;
    private String PlayTimeString;
    ArrayList<Object> PKMExtensions = new ArrayList<Object>();
    private float MinGameID;
    private float SecondsToStart;
    private float SecondsToFame;
    private float SlotCount;
    private float MaxCoins;
    private float TrainerIDDisplayFormat;
    private float TrainerTID7;
    private float TrainerSID7;
    private float DisplayTID;
    private float DisplaySID;
    private float Party;
    ArrayList<Object> PartyData = new ArrayList<Object>();
    private float SIZE_BOXSLOT;
    private float MaxIV;
    private float SeenCount;
    private float CaughtCount;
    private float PercentSeen;
    private float PercentCaught;
    private boolean HasBox;
    private float BoxSlotCount;
    private float BoxesUnlocked;
    private String BoxFlags;
    private float Box;
    ArrayList<Object> BoxData = new ArrayList<Object>();
    ArrayList<Object> SlotPointers = new ArrayList<Object>();
    private boolean IsStorageFull;


    // Getter Methods

    public _personal get_personal() {
        return _personalObject;
    }

    public String getSmall() {
        return Small;
    }

    public String getLarge() {
        return Large;
    }

    public String getStorage() {
        return Storage;
    }

    public String getData() {
        return Data;
    }

    public float getActiveSlot() {
        return ActiveSlot;
    }

    public float getVersion() {
        return Version;
    }

    public Personal getPersonal() {
        return PersonalObject;
    }

    public float getEventFlagCount() {
        return EventFlagCount;
    }

    public float getEventWorkCount() {
        return EventWorkCount;
    }

    public float getDaycareSlotSize() {
        return DaycareSlotSize;
    }

    public float getEggEventFlag() {
        return EggEventFlag;
    }

    public float getBadgeFlagStart() {
        return BadgeFlagStart;
    }

    public float getEventFlag() {
        return EventFlag;
    }

    public float getEventWork() {
        return EventWork;
    }

    public float getPokeDex() {
        return PokeDex;
    }

    public float getDaycareOffset() {
        return DaycareOffset;
    }

    public boolean getNationalDex() {
        return NationalDex;
    }

    public float getBerryPowder() {
        return BerryPowder;
    }

    public float getJoyfulJumpInRow() {
        return JoyfulJumpInRow;
    }

    public float getJoyfulJump5InRow() {
        return JoyfulJump5InRow;
    }

    public float getJoyfulJumpGamesMaxPlayers() {
        return JoyfulJumpGamesMaxPlayers;
    }

    public float getJoyfulJumpScore() {
        return JoyfulJumpScore;
    }

    public float getJoyfulBerriesScore() {
        return JoyfulBerriesScore;
    }

    public float getJoyfulBerriesInRow() {
        return JoyfulBerriesInRow;
    }

    public float getJoyfulBerries5InRow() {
        return JoyfulBerries5InRow;
    }

    public float getSecurityKey() {
        return SecurityKey;
    }

    public float getPartyCount() {
        return PartyCount;
    }

    public float getMoney() {
        return Money;
    }

    public float getCoin() {
        return Coin;
    }

    public float getSeenOffset2() {
        return SeenOffset2;
    }

    public float getMailOffset() {
        return MailOffset;
    }

    public float getPKHeX_Core_IDaycareRandomStateSystem_UInt16_Seed() {
        return PKHeX_Core_IDaycareRandomStateSystem_UInt16_Seed;
    }

    public float getExternalEventData() {
        return ExternalEventData;
    }

    public float getWonderOffset() {
        return WonderOffset;
    }

    public float getWonderCardOffset() {
        return WonderCardOffset;
    }

    public float getWonderCardExtraOffset() {
        return WonderCardExtraOffset;
    }

    public WonderNews getWonderNews() {
        return WonderNewsObject;
    }

    public WonderCard getWonderCard() {
        return WonderCardObject;
    }

    public WonderCardExtra getWonderCardExtra() {
        return WonderCardExtraObject;
    }

    public MysteryData getMysteryData() {
        return MysteryDataObject;
    }

    public float getSeenOffset3() {
        return SeenOffset3;
    }

    public String getRivalName() {
        return RivalName;
    }

    public String getShortSummary() {
        return ShortSummary;
    }

    public String getExtension() {
        return Extension;
    }

    public float getSaveRevision() {
        return SaveRevision;
    }

    public String getSaveRevisionString() {
        return SaveRevisionString;
    }

    public boolean getJapanese() {
        return Japanese;
    }

    public boolean getKorean() {
        return Korean;
    }

    public float getLanguage() {
        return Language;
    }

    public boolean getIsMisconfiguredSize() {
        return IsMisconfiguredSize;
    }

    public float getSIZE_STORED() {
        return SIZE_STORED;
    }

    public float getSIZE_PARTY() {
        return SIZE_PARTY;
    }

    public BlankPKM getBlankPKM() {
        return BlankPKMObject;
    }

    public String getPKMType() {
        return PKMType;
    }

    public float getMaxMoveID() {
        return MaxMoveID;
    }

    public float getMaxSpeciesID() {
        return MaxSpeciesID;
    }

    public float getMaxAbilityID() {
        return MaxAbilityID;
    }

    public float getMaxItemID() {
        return MaxItemID;
    }

    public float getMaxBallID() {
        return MaxBallID;
    }

    public float getMaxGameID() {
        return MaxGameID;
    }

    public float getBoxCount() {
        return BoxCount;
    }

    public float getMaxEV() {
        return MaxEV;
    }

    public float getGeneration() {
        return Generation;
    }

    public float getContext() {
        return Context;
    }

    public float getMaxStringLengthTrainer() {
        return MaxStringLengthTrainer;
    }

    public float getMaxStringLengthNickname() {
        return MaxStringLengthNickname;
    }

    public float getMaxMoney() {
        return MaxMoney;
    }

    public boolean getHasParty() {
        return HasParty;
    }

    public boolean getChecksumsValid() {
        return ChecksumsValid;
    }

    public String getChecksumInfo() {
        return ChecksumInfo;
    }

    public String getOT() {
        return OT;
    }

    public float getGender() {
        return Gender;
    }

    public float getID32() {
        return ID32;
    }

    public float getTID16() {
        return TID16;
    }

    public float getSID16() {
        return SID16;
    }

    public float getPlayedHours() {
        return PlayedHours;
    }

    public float getPlayedMinutes() {
        return PlayedMinutes;
    }

    public float getPlayedSeconds() {
        return PlayedSeconds;
    }

    public float getPlayedFrames() {
        return PlayedFrames;
    }

    public float getBadges() {
        return Badges;
    }

    public boolean getHasPokeDex() {
        return HasPokeDex;
    }

    public float getDaycareSlotCount() {
        return DaycareSlotCount;
    }

    public boolean getIsEggAvailable() {
        return IsEggAvailable;
    }

    public float getCurrentBox() {
        return CurrentBox;
    }

    public float getDexPIDUnown() {
        return DexPIDUnown;
    }

    public float getDexPIDSpinda() {
        return DexPIDSpinda;
    }

    public float getDexUnownForm() {
        return DexUnownForm;
    }

    public float getPokedexSort() {
        return PokedexSort;
    }

    public float getPokedexMode() {
        return PokedexMode;
    }

    public float getPokedexNationalMagicRSE() {
        return PokedexNationalMagicRSE;
    }

    public float getPokedexNationalMagicFRLG() {
        return PokedexNationalMagicFRLG;
    }

    public String getEBerryName() {
        return EBerryName;
    }

    public boolean getIsEBerryEngima() {
        return IsEBerryEngima;
    }

    public float getExternalEventFlags() {
        return ExternalEventFlags;
    }

    public float getColosseumRaw1() {
        return ColosseumRaw1;
    }

    public float getColosseumRaw2() {
        return ColosseumRaw2;
    }

    public float getColosseumCoupons() {
        return ColosseumCoupons;
    }

    public boolean getColosseumPokeCouponTitleGold() {
        return ColosseumPokeCouponTitleGold;
    }

    public boolean getColosseumPokeCouponTitleSilver() {
        return ColosseumPokeCouponTitleSilver;
    }

    public boolean getColosseumPokeCouponTitleBronze() {
        return ColosseumPokeCouponTitleBronze;
    }

    public boolean getColosseumReceivedAgeto() {
        return ColosseumReceivedAgeto;
    }

    public float getColosseumCouponsTotal() {
        return ColosseumCouponsTotal;
    }

    public boolean getHasUsedRSBOX() {
        return HasUsedRSBOX;
    }

    public float getRSBoxDepositEggsUnlocked() {
        return RSBoxDepositEggsUnlocked;
    }

    public boolean getHasReceivedWishmkrJirachi() {
        return HasReceivedWishmkrJirachi;
    }

    public State getState() {
        return StateObject;
    }

    public Metadata getMetadata() {
        return MetadataObject;
    }

    public String getPlayTimeString() {
        return PlayTimeString;
    }

    public float getMinGameID() {
        return MinGameID;
    }

    public float getSecondsToStart() {
        return SecondsToStart;
    }

    public float getSecondsToFame() {
        return SecondsToFame;
    }

    public float getSlotCount() {
        return SlotCount;
    }

    public float getMaxCoins() {
        return MaxCoins;
    }

    public float getTrainerIDDisplayFormat() {
        return TrainerIDDisplayFormat;
    }

    public float getTrainerTID7() {
        return TrainerTID7;
    }

    public float getTrainerSID7() {
        return TrainerSID7;
    }

    public float getDisplayTID() {
        return DisplayTID;
    }

    public float getDisplaySID() {
        return DisplaySID;
    }

    public float getParty() {
        return Party;
    }

    public float getSIZE_BOXSLOT() {
        return SIZE_BOXSLOT;
    }

    public float getMaxIV() {
        return MaxIV;
    }

    public float getSeenCount() {
        return SeenCount;
    }

    public float getCaughtCount() {
        return CaughtCount;
    }

    public float getPercentSeen() {
        return PercentSeen;
    }

    public float getPercentCaught() {
        return PercentCaught;
    }

    public boolean getHasBox() {
        return HasBox;
    }

    public float getBoxSlotCount() {
        return BoxSlotCount;
    }

    public float getBoxesUnlocked() {
        return BoxesUnlocked;
    }

    public String getBoxFlags() {
        return BoxFlags;
    }

    public float getBox() {
        return Box;
    }

    public boolean getIsStorageFull() {
        return IsStorageFull;
    }

    // Setter Methods

    public void set_personal( _personal _personalObject ) {
        this._personalObject = _personalObject;
    }

    public void setSmall( String Small ) {
        this.Small = Small;
    }

    public void setLarge( String Large ) {
        this.Large = Large;
    }

    public void setStorage( String Storage ) {
        this.Storage = Storage;
    }

    public void setData( String Data ) {
        this.Data = Data;
    }

    public void setActiveSlot( float ActiveSlot ) {
        this.ActiveSlot = ActiveSlot;
    }

    public void setVersion( float Version ) {
        this.Version = Version;
    }

    public void setPersonal( Personal PersonalObject ) {
        this.PersonalObject = PersonalObject;
    }

    public void setEventFlagCount( float EventFlagCount ) {
        this.EventFlagCount = EventFlagCount;
    }

    public void setEventWorkCount( float EventWorkCount ) {
        this.EventWorkCount = EventWorkCount;
    }

    public void setDaycareSlotSize( float DaycareSlotSize ) {
        this.DaycareSlotSize = DaycareSlotSize;
    }

    public void setEggEventFlag( float EggEventFlag ) {
        this.EggEventFlag = EggEventFlag;
    }

    public void setBadgeFlagStart( float BadgeFlagStart ) {
        this.BadgeFlagStart = BadgeFlagStart;
    }

    public void setEventFlag( float EventFlag ) {
        this.EventFlag = EventFlag;
    }

    public void setEventWork( float EventWork ) {
        this.EventWork = EventWork;
    }

    public void setPokeDex( float PokeDex ) {
        this.PokeDex = PokeDex;
    }

    public void setDaycareOffset( float DaycareOffset ) {
        this.DaycareOffset = DaycareOffset;
    }

    public void setNationalDex( boolean NationalDex ) {
        this.NationalDex = NationalDex;
    }

    public void setBerryPowder( float BerryPowder ) {
        this.BerryPowder = BerryPowder;
    }

    public void setJoyfulJumpInRow( float JoyfulJumpInRow ) {
        this.JoyfulJumpInRow = JoyfulJumpInRow;
    }

    public void setJoyfulJump5InRow( float JoyfulJump5InRow ) {
        this.JoyfulJump5InRow = JoyfulJump5InRow;
    }

    public void setJoyfulJumpGamesMaxPlayers( float JoyfulJumpGamesMaxPlayers ) {
        this.JoyfulJumpGamesMaxPlayers = JoyfulJumpGamesMaxPlayers;
    }

    public void setJoyfulJumpScore( float JoyfulJumpScore ) {
        this.JoyfulJumpScore = JoyfulJumpScore;
    }

    public void setJoyfulBerriesScore( float JoyfulBerriesScore ) {
        this.JoyfulBerriesScore = JoyfulBerriesScore;
    }

    public void setJoyfulBerriesInRow( float JoyfulBerriesInRow ) {
        this.JoyfulBerriesInRow = JoyfulBerriesInRow;
    }

    public void setJoyfulBerries5InRow( float JoyfulBerries5InRow ) {
        this.JoyfulBerries5InRow = JoyfulBerries5InRow;
    }

    public void setSecurityKey( float SecurityKey ) {
        this.SecurityKey = SecurityKey;
    }

    public void setPartyCount( float PartyCount ) {
        this.PartyCount = PartyCount;
    }

    public void setMoney( float Money ) {
        this.Money = Money;
    }

    public void setCoin( float Coin ) {
        this.Coin = Coin;
    }

    public void setSeenOffset2( float SeenOffset2 ) {
        this.SeenOffset2 = SeenOffset2;
    }

    public void setMailOffset( float MailOffset ) {
        this.MailOffset = MailOffset;
    }

    public void setPKHeX_Core_IDaycareRandomStateSystem_UInt16_Seed( float PKHeX_Core_IDaycareRandomStateSystem_UInt16_Seed ) {
        this.PKHeX_Core_IDaycareRandomStateSystem_UInt16_Seed = PKHeX_Core_IDaycareRandomStateSystem_UInt16_Seed;
    }

    public void setExternalEventData( float ExternalEventData ) {
        this.ExternalEventData = ExternalEventData;
    }

    public void setWonderOffset( float WonderOffset ) {
        this.WonderOffset = WonderOffset;
    }

    public void setWonderCardOffset( float WonderCardOffset ) {
        this.WonderCardOffset = WonderCardOffset;
    }

    public void setWonderCardExtraOffset( float WonderCardExtraOffset ) {
        this.WonderCardExtraOffset = WonderCardExtraOffset;
    }

    public void setWonderNews( WonderNews WonderNewsObject ) {
        this.WonderNewsObject = WonderNewsObject;
    }

    public void setWonderCard( WonderCard WonderCardObject ) {
        this.WonderCardObject = WonderCardObject;
    }

    public void setWonderCardExtra( WonderCardExtra WonderCardExtraObject ) {
        this.WonderCardExtraObject = WonderCardExtraObject;
    }

    public void setMysteryData( MysteryData MysteryDataObject ) {
        this.MysteryDataObject = MysteryDataObject;
    }

    public void setSeenOffset3( float SeenOffset3 ) {
        this.SeenOffset3 = SeenOffset3;
    }

    public void setRivalName( String RivalName ) {
        this.RivalName = RivalName;
    }

    public void setShortSummary( String ShortSummary ) {
        this.ShortSummary = ShortSummary;
    }

    public void setExtension( String Extension ) {
        this.Extension = Extension;
    }

    public void setSaveRevision( float SaveRevision ) {
        this.SaveRevision = SaveRevision;
    }

    public void setSaveRevisionString( String SaveRevisionString ) {
        this.SaveRevisionString = SaveRevisionString;
    }

    public void setJapanese( boolean Japanese ) {
        this.Japanese = Japanese;
    }

    public void setKorean( boolean Korean ) {
        this.Korean = Korean;
    }

    public void setLanguage( float Language ) {
        this.Language = Language;
    }

    public void setIsMisconfiguredSize( boolean IsMisconfiguredSize ) {
        this.IsMisconfiguredSize = IsMisconfiguredSize;
    }

    public void setSIZE_STORED( float SIZE_STORED ) {
        this.SIZE_STORED = SIZE_STORED;
    }

    public void setSIZE_PARTY( float SIZE_PARTY ) {
        this.SIZE_PARTY = SIZE_PARTY;
    }

    public void setBlankPKM( BlankPKM BlankPKMObject ) {
        this.BlankPKMObject = BlankPKMObject;
    }

    public void setPKMType( String PKMType ) {
        this.PKMType = PKMType;
    }

    public void setMaxMoveID( float MaxMoveID ) {
        this.MaxMoveID = MaxMoveID;
    }

    public void setMaxSpeciesID( float MaxSpeciesID ) {
        this.MaxSpeciesID = MaxSpeciesID;
    }

    public void setMaxAbilityID( float MaxAbilityID ) {
        this.MaxAbilityID = MaxAbilityID;
    }

    public void setMaxItemID( float MaxItemID ) {
        this.MaxItemID = MaxItemID;
    }

    public void setMaxBallID( float MaxBallID ) {
        this.MaxBallID = MaxBallID;
    }

    public void setMaxGameID( float MaxGameID ) {
        this.MaxGameID = MaxGameID;
    }

    public void setBoxCount( float BoxCount ) {
        this.BoxCount = BoxCount;
    }

    public void setMaxEV( float MaxEV ) {
        this.MaxEV = MaxEV;
    }

    public void setGeneration( float Generation ) {
        this.Generation = Generation;
    }

    public void setContext( float Context ) {
        this.Context = Context;
    }

    public void setMaxStringLengthTrainer( float MaxStringLengthTrainer ) {
        this.MaxStringLengthTrainer = MaxStringLengthTrainer;
    }

    public void setMaxStringLengthNickname( float MaxStringLengthNickname ) {
        this.MaxStringLengthNickname = MaxStringLengthNickname;
    }

    public void setMaxMoney( float MaxMoney ) {
        this.MaxMoney = MaxMoney;
    }

    public void setHasParty( boolean HasParty ) {
        this.HasParty = HasParty;
    }

    public void setChecksumsValid( boolean ChecksumsValid ) {
        this.ChecksumsValid = ChecksumsValid;
    }

    public void setChecksumInfo( String ChecksumInfo ) {
        this.ChecksumInfo = ChecksumInfo;
    }

    public void setOT( String OT ) {
        this.OT = OT;
    }

    public void setGender( float Gender ) {
        this.Gender = Gender;
    }

    public void setID32( float ID32 ) {
        this.ID32 = ID32;
    }

    public void setTID16( float TID16 ) {
        this.TID16 = TID16;
    }

    public void setSID16( float SID16 ) {
        this.SID16 = SID16;
    }

    public void setPlayedHours( float PlayedHours ) {
        this.PlayedHours = PlayedHours;
    }

    public void setPlayedMinutes( float PlayedMinutes ) {
        this.PlayedMinutes = PlayedMinutes;
    }

    public void setPlayedSeconds( float PlayedSeconds ) {
        this.PlayedSeconds = PlayedSeconds;
    }

    public void setPlayedFrames( float PlayedFrames ) {
        this.PlayedFrames = PlayedFrames;
    }

    public void setBadges( float Badges ) {
        this.Badges = Badges;
    }

    public void setHasPokeDex( boolean HasPokeDex ) {
        this.HasPokeDex = HasPokeDex;
    }

    public void setDaycareSlotCount( float DaycareSlotCount ) {
        this.DaycareSlotCount = DaycareSlotCount;
    }

    public void setIsEggAvailable( boolean IsEggAvailable ) {
        this.IsEggAvailable = IsEggAvailable;
    }

    public void setCurrentBox( float CurrentBox ) {
        this.CurrentBox = CurrentBox;
    }

    public void setDexPIDUnown( float DexPIDUnown ) {
        this.DexPIDUnown = DexPIDUnown;
    }

    public void setDexPIDSpinda( float DexPIDSpinda ) {
        this.DexPIDSpinda = DexPIDSpinda;
    }

    public void setDexUnownForm( float DexUnownForm ) {
        this.DexUnownForm = DexUnownForm;
    }

    public void setPokedexSort( float PokedexSort ) {
        this.PokedexSort = PokedexSort;
    }

    public void setPokedexMode( float PokedexMode ) {
        this.PokedexMode = PokedexMode;
    }

    public void setPokedexNationalMagicRSE( float PokedexNationalMagicRSE ) {
        this.PokedexNationalMagicRSE = PokedexNationalMagicRSE;
    }

    public void setPokedexNationalMagicFRLG( float PokedexNationalMagicFRLG ) {
        this.PokedexNationalMagicFRLG = PokedexNationalMagicFRLG;
    }

    public void setEBerryName( String EBerryName ) {
        this.EBerryName = EBerryName;
    }

    public void setIsEBerryEngima( boolean IsEBerryEngima ) {
        this.IsEBerryEngima = IsEBerryEngima;
    }

    public void setExternalEventFlags( float ExternalEventFlags ) {
        this.ExternalEventFlags = ExternalEventFlags;
    }

    public void setColosseumRaw1( float ColosseumRaw1 ) {
        this.ColosseumRaw1 = ColosseumRaw1;
    }

    public void setColosseumRaw2( float ColosseumRaw2 ) {
        this.ColosseumRaw2 = ColosseumRaw2;
    }

    public void setColosseumCoupons( float ColosseumCoupons ) {
        this.ColosseumCoupons = ColosseumCoupons;
    }

    public void setColosseumPokeCouponTitleGold( boolean ColosseumPokeCouponTitleGold ) {
        this.ColosseumPokeCouponTitleGold = ColosseumPokeCouponTitleGold;
    }

    public void setColosseumPokeCouponTitleSilver( boolean ColosseumPokeCouponTitleSilver ) {
        this.ColosseumPokeCouponTitleSilver = ColosseumPokeCouponTitleSilver;
    }

    public void setColosseumPokeCouponTitleBronze( boolean ColosseumPokeCouponTitleBronze ) {
        this.ColosseumPokeCouponTitleBronze = ColosseumPokeCouponTitleBronze;
    }

    public void setColosseumReceivedAgeto( boolean ColosseumReceivedAgeto ) {
        this.ColosseumReceivedAgeto = ColosseumReceivedAgeto;
    }

    public void setColosseumCouponsTotal( float ColosseumCouponsTotal ) {
        this.ColosseumCouponsTotal = ColosseumCouponsTotal;
    }

    public void setHasUsedRSBOX( boolean HasUsedRSBOX ) {
        this.HasUsedRSBOX = HasUsedRSBOX;
    }

    public void setRSBoxDepositEggsUnlocked( float RSBoxDepositEggsUnlocked ) {
        this.RSBoxDepositEggsUnlocked = RSBoxDepositEggsUnlocked;
    }

    public void setHasReceivedWishmkrJirachi( boolean HasReceivedWishmkrJirachi ) {
        this.HasReceivedWishmkrJirachi = HasReceivedWishmkrJirachi;
    }

    public void setState( State StateObject ) {
        this.StateObject = StateObject;
    }

    public void setMetadata( Metadata MetadataObject ) {
        this.MetadataObject = MetadataObject;
    }

    public void setPlayTimeString( String PlayTimeString ) {
        this.PlayTimeString = PlayTimeString;
    }

    public void setMinGameID( float MinGameID ) {
        this.MinGameID = MinGameID;
    }

    public void setSecondsToStart( float SecondsToStart ) {
        this.SecondsToStart = SecondsToStart;
    }

    public void setSecondsToFame( float SecondsToFame ) {
        this.SecondsToFame = SecondsToFame;
    }

    public void setSlotCount( float SlotCount ) {
        this.SlotCount = SlotCount;
    }

    public void setMaxCoins( float MaxCoins ) {
        this.MaxCoins = MaxCoins;
    }

    public void setTrainerIDDisplayFormat( float TrainerIDDisplayFormat ) {
        this.TrainerIDDisplayFormat = TrainerIDDisplayFormat;
    }

    public void setTrainerTID7( float TrainerTID7 ) {
        this.TrainerTID7 = TrainerTID7;
    }

    public void setTrainerSID7( float TrainerSID7 ) {
        this.TrainerSID7 = TrainerSID7;
    }

    public void setDisplayTID( float DisplayTID ) {
        this.DisplayTID = DisplayTID;
    }

    public void setDisplaySID( float DisplaySID ) {
        this.DisplaySID = DisplaySID;
    }

    public void setParty( float Party ) {
        this.Party = Party;
    }

    public void setSIZE_BOXSLOT( float SIZE_BOXSLOT ) {
        this.SIZE_BOXSLOT = SIZE_BOXSLOT;
    }

    public void setMaxIV( float MaxIV ) {
        this.MaxIV = MaxIV;
    }

    public void setSeenCount( float SeenCount ) {
        this.SeenCount = SeenCount;
    }

    public void setCaughtCount( float CaughtCount ) {
        this.CaughtCount = CaughtCount;
    }

    public void setPercentSeen( float PercentSeen ) {
        this.PercentSeen = PercentSeen;
    }

    public void setPercentCaught( float PercentCaught ) {
        this.PercentCaught = PercentCaught;
    }

    public void setHasBox( boolean HasBox ) {
        this.HasBox = HasBox;
    }

    public void setBoxSlotCount( float BoxSlotCount ) {
        this.BoxSlotCount = BoxSlotCount;
    }

    public void setBoxesUnlocked( float BoxesUnlocked ) {
        this.BoxesUnlocked = BoxesUnlocked;
    }

    public void setBoxFlags( String BoxFlags ) {
        this.BoxFlags = BoxFlags;
    }

    public void setBox( float Box ) {
        this.Box = Box;
    }

    public void setIsStorageFull( boolean IsStorageFull ) {
        this.IsStorageFull = IsStorageFull;
    }
}

class Metadata {
    Footer FooterObject;
    Header HeaderObject;
    private String Handler = null;
    private String FilePath = null;
    private String FileName = null;
    private String FileFolder = null;
    private String BAKSuffix;
    private String BAKName;
    private boolean HasHeader;
    private boolean HasFooter;
    private String Filter;


    // Getter Methods

    public Footer getFooter() {
        return FooterObject;
    }

    public Header getHeader() {
        return HeaderObject;
    }

    public String getHandler() {
        return Handler;
    }

    public String getFilePath() {
        return FilePath;
    }

    public String getFileName() {
        return FileName;
    }

    public String getFileFolder() {
        return FileFolder;
    }

    public String getBAKSuffix() {
        return BAKSuffix;
    }

    public String getBAKName() {
        return BAKName;
    }

    public boolean getHasHeader() {
        return HasHeader;
    }

    public boolean getHasFooter() {
        return HasFooter;
    }

    public String getFilter() {
        return Filter;
    }

    // Setter Methods

    public void setFooter( Footer FooterObject ) {
        this.FooterObject = FooterObject;
    }

    public void setHeader( Header HeaderObject ) {
        this.HeaderObject = HeaderObject;
    }

    public void setHandler( String Handler ) {
        this.Handler = Handler;
    }

    public void setFilePath( String FilePath ) {
        this.FilePath = FilePath;
    }

    public void setFileName( String FileName ) {
        this.FileName = FileName;
    }

    public void setFileFolder( String FileFolder ) {
        this.FileFolder = FileFolder;
    }

    public void setBAKSuffix( String BAKSuffix ) {
        this.BAKSuffix = BAKSuffix;
    }

    public void setBAKName( String BAKName ) {
        this.BAKName = BAKName;
    }

    public void setHasHeader( boolean HasHeader ) {
        this.HasHeader = HasHeader;
    }

    public void setHasFooter( boolean HasFooter ) {
        this.HasFooter = HasFooter;
    }

    public void setFilter( String Filter ) {
        this.Filter = Filter;
    }
}
class Header {
    private String _object = null;
    private float _index;
    private float _length;
    private float Length;
    private boolean IsEmpty;


    // Getter Methods

    public String get_object() {
        return _object;
    }

    public float get_index() {
        return _index;
    }

    public float get_length() {
        return _length;
    }

    public float getLength() {
        return Length;
    }

    public boolean getIsEmpty() {
        return IsEmpty;
    }

    // Setter Methods

    public void set_object( String _object ) {
        this._object = _object;
    }

    public void set_index( float _index ) {
        this._index = _index;
    }

    public void set_length( float _length ) {
        this._length = _length;
    }

    public void setLength( float Length ) {
        this.Length = Length;
    }

    public void setIsEmpty( boolean IsEmpty ) {
        this.IsEmpty = IsEmpty;
    }
}
class Footer {
    private String _object = null;
    private float _index;
    private float _length;
    private float Length;
    private boolean IsEmpty;


    // Getter Methods

    public String get_object() {
        return _object;
    }

    public float get_index() {
        return _index;
    }

    public float get_length() {
        return _length;
    }

    public float getLength() {
        return Length;
    }

    public boolean getIsEmpty() {
        return IsEmpty;
    }

    // Setter Methods

    public void set_object( String _object ) {
        this._object = _object;
    }

    public void set_index( float _index ) {
        this._index = _index;
    }

    public void set_length( float _length ) {
        this._length = _length;
    }

    public void setLength( float Length ) {
        this.Length = Length;
    }

    public void setIsEmpty( boolean IsEmpty ) {
        this.IsEmpty = IsEmpty;
    }
}
class State {
    private boolean Exportable;
    private boolean Edited;


    // Getter Methods

    public boolean getExportable() {
        return Exportable;
    }

    public boolean getEdited() {
        return Edited;
    }

    // Setter Methods

    public void setExportable( boolean Exportable ) {
        this.Exportable = Exportable;
    }

    public void setEdited( boolean Edited ) {
        this.Edited = Edited;
    }
}
class BlankPKM {
    private String Data;
    private float SIZE_PARTY;
    private float SIZE_STORED;
    private float Context;
    PersonalInfo PersonalInfoObject;
    private float TrashCharCountTrainer;
    private float TrashCharCountNickname;
    private float PID;
    private float ID32;
    private float TID16;
    private float SID16;
    private String Nickname;
    private float Language;
    private boolean FlagIsBadEgg;
    private boolean FlagHasSpecies;
    private boolean FlagIsEgg;
    private String OriginalTrainerName;
    private float MarkingValue;
    private float Checksum;
    private float Sanity;
    private float SpeciesInternal;
    private float Species;
    private float SpriteItem;
    private float HeldItem;
    private float EXP;
    private float PPUps;
    private float Move1_PPUps;
    private float Move2_PPUps;
    private float Move3_PPUps;
    private float Move4_PPUps;
    private float OriginalTrainerFriendship;
    private float Move1;
    private float Move2;
    private float Move3;
    private float Move4;
    private float Move1_PP;
    private float Move2_PP;
    private float Move3_PP;
    private float Move4_PP;
    private float EV_HP;
    private float EV_ATK;
    private float EV_DEF;
    private float EV_SPE;
    private float EV_SPA;
    private float EV_SPD;
    private float ContestCool;
    private float ContestBeauty;
    private float ContestCute;
    private float ContestSmart;
    private float ContestTough;
    private float ContestSheen;
    private float PokerusState;
    private float PokerusDays;
    private float PokerusStrain;
    private float MetLocation;
    private float Origins;
    private float MetLevel;
    private float Version;
    private float Ball;
    private float OriginalTrainerGender;
    private float IV32;
    private float IV_HP;
    private float IV_ATK;
    private float IV_DEF;
    private float IV_SPE;
    private float IV_SPA;
    private float IV_SPD;
    private boolean IsEgg;
    private boolean AbilityBit;
    private float RIB0;
    private float RibbonCountG3Cool;
    private float RibbonCountG3Beauty;
    private float RibbonCountG3Cute;
    private float RibbonCountG3Smart;
    private float RibbonCountG3Tough;
    private boolean RibbonChampionG3;
    private boolean RibbonWinning;
    private boolean RibbonVictory;
    private boolean RibbonArtist;
    private boolean RibbonEffort;
    private boolean RibbonChampionBattle;
    private boolean RibbonChampionRegional;
    private boolean RibbonChampionNational;
    private boolean RibbonCountry;
    private boolean RibbonNational;
    private boolean RibbonEarth;
    private boolean RibbonWorld;
    private boolean Unused1;
    private boolean Unused2;
    private boolean Unused3;
    private boolean Unused4;
    private boolean FatefulEncounter;
    private float RibbonCount;
    private float Status_Condition;
    private float Stat_Level;
    private float HeldMailID;
    private float Stat_HPCurrent;
    private float Stat_HPMax;
    private float Stat_ATK;
    private float Stat_DEF;
    private float Stat_SPE;
    private float Stat_SPA;
    private float Stat_SPD;
    private boolean ChecksumValid;
    private float MaxMoveID;
    private float MaxSpeciesID;
    private float MaxAbilityID;
    private float MaxItemID;
    private float MaxBallID;
    private float MaxGameID;
    private float MaxIV;
    private float MaxEV;
    private float MaxStringLengthTrainer;
    private float MaxStringLengthNickname;
    private float PSV;
    private float TSV;
    private boolean Japanese;
    private float Ability;
    private float EncryptionConstant;
    private float Nature;
    private boolean IsNicknamed;
    private float Gender;
    private float Characteristic;
    private float CurrentFriendship;
    private float CurrentHandler;
    private float EggLocation;
    private float MarkingCount;
    private boolean MarkingCircle;
    private boolean MarkingTriangle;
    private boolean MarkingSquare;
    private boolean MarkingHeart;
    private float Form;
    private float AbilityNumber;
    private boolean Valid;
    private String Extension;
    private String EncryptedPartyData;
    private String EncryptedBoxData;
    private String DecryptedPartyData;
    private String DecryptedBoxData;
    private float Format;
    private float TrainerIDDisplayFormat;
    private float StatNature;
    private float TrainerTID7;
    private float TrainerSID7;
    private float DisplayTID;
    private float DisplaySID;
    private boolean Korean;
    private float MetYear;
    private float MetMonth;
    private float MetDay;
    private String HandlingTrainerName;
    private float HandlingTrainerGender;
    private float HandlingTrainerFriendship;
    private String MetDate = null;
    private float EggYear;
    private float EggMonth;
    private float EggDay;
    private String EggMetDate = null;
    private float RelearnMove1;
    private float RelearnMove2;
    private float RelearnMove3;
    private float RelearnMove4;
    private float MinGameID;
    private boolean IsShiny;
    private float ShinyXor;
    private boolean E;
    private boolean FRLG;
    private boolean Pt;
    private boolean HGSS;
    private boolean BW;
    private boolean B2W2;
    private boolean XY;
    private boolean AO;
    private boolean SM;
    private boolean USUM;
    private boolean GO;
    private boolean VC1;
    private boolean VC2;
    private boolean LGPE;
    private boolean SWSH;
    private boolean BDSP;
    private boolean LA;
    private boolean SV;
    private boolean GO_LGPE;
    private boolean GO_HOME;
    private boolean VC;
    private boolean GG;
    private boolean Gen9;
    private boolean Gen8;
    private boolean Gen7;
    private boolean Gen6;
    private boolean Gen5;
    private boolean Gen4;
    private boolean Gen3;
    private boolean Gen2;
    private boolean Gen1;
    private boolean GenU;
    private float Generation;
    private boolean IsPokerusInfected;
    private boolean IsPokerusCured;
    private float CurrentLevel;
    private float IVTotal;
    private float EVTotal;
    private float MaximumIV;
    private float FlawlessIVCount;
    private String FileName;
    private String FileNameWithoutExtension;
    ArrayList<Object> IVs = new ArrayList<Object>();
    ArrayList<Object> Stats = new ArrayList<Object>();
    ArrayList<Object> Moves = new ArrayList<Object>();
    private float MoveCount;
    ArrayList<Object> RelearnMoves = new ArrayList<Object>();
    private float PIDAbility;
    private float HPPower;
    private float HPType;
    private boolean WasEgg;
    private boolean WasTradedEgg;
    private boolean IsTradedEgg;
    private boolean IsUntraded;
    private boolean IsOriginValid;
    private boolean HasOriginalMetLocation;
    private float PotentialRating;
    private boolean PartyStatsPresent;
    private float HPBitValPower;
    private float HPBitValType;


    // Getter Methods

    public String getData() {
        return Data;
    }

    public float getSIZE_PARTY() {
        return SIZE_PARTY;
    }

    public float getSIZE_STORED() {
        return SIZE_STORED;
    }

    public float getContext() {
        return Context;
    }

    public PersonalInfo getPersonalInfo() {
        return PersonalInfoObject;
    }

    public float getTrashCharCountTrainer() {
        return TrashCharCountTrainer;
    }

    public float getTrashCharCountNickname() {
        return TrashCharCountNickname;
    }

    public float getPID() {
        return PID;
    }

    public float getID32() {
        return ID32;
    }

    public float getTID16() {
        return TID16;
    }

    public float getSID16() {
        return SID16;
    }

    public String getNickname() {
        return Nickname;
    }

    public float getLanguage() {
        return Language;
    }

    public boolean getFlagIsBadEgg() {
        return FlagIsBadEgg;
    }

    public boolean getFlagHasSpecies() {
        return FlagHasSpecies;
    }

    public boolean getFlagIsEgg() {
        return FlagIsEgg;
    }

    public String getOriginalTrainerName() {
        return OriginalTrainerName;
    }

    public float getMarkingValue() {
        return MarkingValue;
    }

    public float getChecksum() {
        return Checksum;
    }

    public float getSanity() {
        return Sanity;
    }

    public float getSpeciesInternal() {
        return SpeciesInternal;
    }

    public float getSpecies() {
        return Species;
    }

    public float getSpriteItem() {
        return SpriteItem;
    }

    public float getHeldItem() {
        return HeldItem;
    }

    public float getEXP() {
        return EXP;
    }

    public float getPPUps() {
        return PPUps;
    }

    public float getMove1_PPUps() {
        return Move1_PPUps;
    }

    public float getMove2_PPUps() {
        return Move2_PPUps;
    }

    public float getMove3_PPUps() {
        return Move3_PPUps;
    }

    public float getMove4_PPUps() {
        return Move4_PPUps;
    }

    public float getOriginalTrainerFriendship() {
        return OriginalTrainerFriendship;
    }

    public float getMove1() {
        return Move1;
    }

    public float getMove2() {
        return Move2;
    }

    public float getMove3() {
        return Move3;
    }

    public float getMove4() {
        return Move4;
    }

    public float getMove1_PP() {
        return Move1_PP;
    }

    public float getMove2_PP() {
        return Move2_PP;
    }

    public float getMove3_PP() {
        return Move3_PP;
    }

    public float getMove4_PP() {
        return Move4_PP;
    }

    public float getEV_HP() {
        return EV_HP;
    }

    public float getEV_ATK() {
        return EV_ATK;
    }

    public float getEV_DEF() {
        return EV_DEF;
    }

    public float getEV_SPE() {
        return EV_SPE;
    }

    public float getEV_SPA() {
        return EV_SPA;
    }

    public float getEV_SPD() {
        return EV_SPD;
    }

    public float getContestCool() {
        return ContestCool;
    }

    public float getContestBeauty() {
        return ContestBeauty;
    }

    public float getContestCute() {
        return ContestCute;
    }

    public float getContestSmart() {
        return ContestSmart;
    }

    public float getContestTough() {
        return ContestTough;
    }

    public float getContestSheen() {
        return ContestSheen;
    }

    public float getPokerusState() {
        return PokerusState;
    }

    public float getPokerusDays() {
        return PokerusDays;
    }

    public float getPokerusStrain() {
        return PokerusStrain;
    }

    public float getMetLocation() {
        return MetLocation;
    }

    public float getOrigins() {
        return Origins;
    }

    public float getMetLevel() {
        return MetLevel;
    }

    public float getVersion() {
        return Version;
    }

    public float getBall() {
        return Ball;
    }

    public float getOriginalTrainerGender() {
        return OriginalTrainerGender;
    }

    public float getIV32() {
        return IV32;
    }

    public float getIV_HP() {
        return IV_HP;
    }

    public float getIV_ATK() {
        return IV_ATK;
    }

    public float getIV_DEF() {
        return IV_DEF;
    }

    public float getIV_SPE() {
        return IV_SPE;
    }

    public float getIV_SPA() {
        return IV_SPA;
    }

    public float getIV_SPD() {
        return IV_SPD;
    }

    public boolean getIsEgg() {
        return IsEgg;
    }

    public boolean getAbilityBit() {
        return AbilityBit;
    }

    public float getRIB0() {
        return RIB0;
    }

    public float getRibbonCountG3Cool() {
        return RibbonCountG3Cool;
    }

    public float getRibbonCountG3Beauty() {
        return RibbonCountG3Beauty;
    }

    public float getRibbonCountG3Cute() {
        return RibbonCountG3Cute;
    }

    public float getRibbonCountG3Smart() {
        return RibbonCountG3Smart;
    }

    public float getRibbonCountG3Tough() {
        return RibbonCountG3Tough;
    }

    public boolean getRibbonChampionG3() {
        return RibbonChampionG3;
    }

    public boolean getRibbonWinning() {
        return RibbonWinning;
    }

    public boolean getRibbonVictory() {
        return RibbonVictory;
    }

    public boolean getRibbonArtist() {
        return RibbonArtist;
    }

    public boolean getRibbonEffort() {
        return RibbonEffort;
    }

    public boolean getRibbonChampionBattle() {
        return RibbonChampionBattle;
    }

    public boolean getRibbonChampionRegional() {
        return RibbonChampionRegional;
    }

    public boolean getRibbonChampionNational() {
        return RibbonChampionNational;
    }

    public boolean getRibbonCountry() {
        return RibbonCountry;
    }

    public boolean getRibbonNational() {
        return RibbonNational;
    }

    public boolean getRibbonEarth() {
        return RibbonEarth;
    }

    public boolean getRibbonWorld() {
        return RibbonWorld;
    }

    public boolean getUnused1() {
        return Unused1;
    }

    public boolean getUnused2() {
        return Unused2;
    }

    public boolean getUnused3() {
        return Unused3;
    }

    public boolean getUnused4() {
        return Unused4;
    }

    public boolean getFatefulEncounter() {
        return FatefulEncounter;
    }

    public float getRibbonCount() {
        return RibbonCount;
    }

    public float getStatus_Condition() {
        return Status_Condition;
    }

    public float getStat_Level() {
        return Stat_Level;
    }

    public float getHeldMailID() {
        return HeldMailID;
    }

    public float getStat_HPCurrent() {
        return Stat_HPCurrent;
    }

    public float getStat_HPMax() {
        return Stat_HPMax;
    }

    public float getStat_ATK() {
        return Stat_ATK;
    }

    public float getStat_DEF() {
        return Stat_DEF;
    }

    public float getStat_SPE() {
        return Stat_SPE;
    }

    public float getStat_SPA() {
        return Stat_SPA;
    }

    public float getStat_SPD() {
        return Stat_SPD;
    }

    public boolean getChecksumValid() {
        return ChecksumValid;
    }

    public float getMaxMoveID() {
        return MaxMoveID;
    }

    public float getMaxSpeciesID() {
        return MaxSpeciesID;
    }

    public float getMaxAbilityID() {
        return MaxAbilityID;
    }

    public float getMaxItemID() {
        return MaxItemID;
    }

    public float getMaxBallID() {
        return MaxBallID;
    }

    public float getMaxGameID() {
        return MaxGameID;
    }

    public float getMaxIV() {
        return MaxIV;
    }

    public float getMaxEV() {
        return MaxEV;
    }

    public float getMaxStringLengthTrainer() {
        return MaxStringLengthTrainer;
    }

    public float getMaxStringLengthNickname() {
        return MaxStringLengthNickname;
    }

    public float getPSV() {
        return PSV;
    }

    public float getTSV() {
        return TSV;
    }

    public boolean getJapanese() {
        return Japanese;
    }

    public float getAbility() {
        return Ability;
    }

    public float getEncryptionConstant() {
        return EncryptionConstant;
    }

    public float getNature() {
        return Nature;
    }

    public boolean getIsNicknamed() {
        return IsNicknamed;
    }

    public float getGender() {
        return Gender;
    }

    public float getCharacteristic() {
        return Characteristic;
    }

    public float getCurrentFriendship() {
        return CurrentFriendship;
    }

    public float getCurrentHandler() {
        return CurrentHandler;
    }

    public float getEggLocation() {
        return EggLocation;
    }

    public float getMarkingCount() {
        return MarkingCount;
    }

    public boolean getMarkingCircle() {
        return MarkingCircle;
    }

    public boolean getMarkingTriangle() {
        return MarkingTriangle;
    }

    public boolean getMarkingSquare() {
        return MarkingSquare;
    }

    public boolean getMarkingHeart() {
        return MarkingHeart;
    }

    public float getForm() {
        return Form;
    }

    public float getAbilityNumber() {
        return AbilityNumber;
    }

    public boolean getValid() {
        return Valid;
    }

    public String getExtension() {
        return Extension;
    }

    public String getEncryptedPartyData() {
        return EncryptedPartyData;
    }

    public String getEncryptedBoxData() {
        return EncryptedBoxData;
    }

    public String getDecryptedPartyData() {
        return DecryptedPartyData;
    }

    public String getDecryptedBoxData() {
        return DecryptedBoxData;
    }

    public float getFormat() {
        return Format;
    }

    public float getTrainerIDDisplayFormat() {
        return TrainerIDDisplayFormat;
    }

    public float getStatNature() {
        return StatNature;
    }

    public float getTrainerTID7() {
        return TrainerTID7;
    }

    public float getTrainerSID7() {
        return TrainerSID7;
    }

    public float getDisplayTID() {
        return DisplayTID;
    }

    public float getDisplaySID() {
        return DisplaySID;
    }

    public boolean getKorean() {
        return Korean;
    }

    public float getMetYear() {
        return MetYear;
    }

    public float getMetMonth() {
        return MetMonth;
    }

    public float getMetDay() {
        return MetDay;
    }

    public String getHandlingTrainerName() {
        return HandlingTrainerName;
    }

    public float getHandlingTrainerGender() {
        return HandlingTrainerGender;
    }

    public float getHandlingTrainerFriendship() {
        return HandlingTrainerFriendship;
    }

    public String getMetDate() {
        return MetDate;
    }

    public float getEggYear() {
        return EggYear;
    }

    public float getEggMonth() {
        return EggMonth;
    }

    public float getEggDay() {
        return EggDay;
    }

    public String getEggMetDate() {
        return EggMetDate;
    }

    public float getRelearnMove1() {
        return RelearnMove1;
    }

    public float getRelearnMove2() {
        return RelearnMove2;
    }

    public float getRelearnMove3() {
        return RelearnMove3;
    }

    public float getRelearnMove4() {
        return RelearnMove4;
    }

    public float getMinGameID() {
        return MinGameID;
    }

    public boolean getIsShiny() {
        return IsShiny;
    }

    public float getShinyXor() {
        return ShinyXor;
    }

    public boolean getE() {
        return E;
    }

    public boolean getFRLG() {
        return FRLG;
    }

    public boolean getPt() {
        return Pt;
    }

    public boolean getHGSS() {
        return HGSS;
    }

    public boolean getBW() {
        return BW;
    }

    public boolean getB2W2() {
        return B2W2;
    }

    public boolean getXY() {
        return XY;
    }

    public boolean getAO() {
        return AO;
    }

    public boolean getSM() {
        return SM;
    }

    public boolean getUSUM() {
        return USUM;
    }

    public boolean getGO() {
        return GO;
    }

    public boolean getVC1() {
        return VC1;
    }

    public boolean getVC2() {
        return VC2;
    }

    public boolean getLGPE() {
        return LGPE;
    }

    public boolean getSWSH() {
        return SWSH;
    }

    public boolean getBDSP() {
        return BDSP;
    }

    public boolean getLA() {
        return LA;
    }

    public boolean getSV() {
        return SV;
    }

    public boolean getGO_LGPE() {
        return GO_LGPE;
    }

    public boolean getGO_HOME() {
        return GO_HOME;
    }

    public boolean getVC() {
        return VC;
    }

    public boolean getGG() {
        return GG;
    }

    public boolean getGen9() {
        return Gen9;
    }

    public boolean getGen8() {
        return Gen8;
    }

    public boolean getGen7() {
        return Gen7;
    }

    public boolean getGen6() {
        return Gen6;
    }

    public boolean getGen5() {
        return Gen5;
    }

    public boolean getGen4() {
        return Gen4;
    }

    public boolean getGen3() {
        return Gen3;
    }

    public boolean getGen2() {
        return Gen2;
    }

    public boolean getGen1() {
        return Gen1;
    }

    public boolean getGenU() {
        return GenU;
    }

    public float getGeneration() {
        return Generation;
    }

    public boolean getIsPokerusInfected() {
        return IsPokerusInfected;
    }

    public boolean getIsPokerusCured() {
        return IsPokerusCured;
    }

    public float getCurrentLevel() {
        return CurrentLevel;
    }

    public float getIVTotal() {
        return IVTotal;
    }

    public float getEVTotal() {
        return EVTotal;
    }

    public float getMaximumIV() {
        return MaximumIV;
    }

    public float getFlawlessIVCount() {
        return FlawlessIVCount;
    }

    public String getFileName() {
        return FileName;
    }

    public String getFileNameWithoutExtension() {
        return FileNameWithoutExtension;
    }

    public float getMoveCount() {
        return MoveCount;
    }

    public float getPIDAbility() {
        return PIDAbility;
    }

    public float getHPPower() {
        return HPPower;
    }

    public float getHPType() {
        return HPType;
    }

    public boolean getWasEgg() {
        return WasEgg;
    }

    public boolean getWasTradedEgg() {
        return WasTradedEgg;
    }

    public boolean getIsTradedEgg() {
        return IsTradedEgg;
    }

    public boolean getIsUntraded() {
        return IsUntraded;
    }

    public boolean getIsOriginValid() {
        return IsOriginValid;
    }

    public boolean getHasOriginalMetLocation() {
        return HasOriginalMetLocation;
    }

    public float getPotentialRating() {
        return PotentialRating;
    }

    public boolean getPartyStatsPresent() {
        return PartyStatsPresent;
    }

    public float getHPBitValPower() {
        return HPBitValPower;
    }

    public float getHPBitValType() {
        return HPBitValType;
    }

    // Setter Methods

    public void setData( String Data ) {
        this.Data = Data;
    }

    public void setSIZE_PARTY( float SIZE_PARTY ) {
        this.SIZE_PARTY = SIZE_PARTY;
    }

    public void setSIZE_STORED( float SIZE_STORED ) {
        this.SIZE_STORED = SIZE_STORED;
    }

    public void setContext( float Context ) {
        this.Context = Context;
    }

    public void setPersonalInfo( PersonalInfo PersonalInfoObject ) {
        this.PersonalInfoObject = PersonalInfoObject;
    }

    public void setTrashCharCountTrainer( float TrashCharCountTrainer ) {
        this.TrashCharCountTrainer = TrashCharCountTrainer;
    }

    public void setTrashCharCountNickname( float TrashCharCountNickname ) {
        this.TrashCharCountNickname = TrashCharCountNickname;
    }

    public void setPID( float PID ) {
        this.PID = PID;
    }

    public void setID32( float ID32 ) {
        this.ID32 = ID32;
    }

    public void setTID16( float TID16 ) {
        this.TID16 = TID16;
    }

    public void setSID16( float SID16 ) {
        this.SID16 = SID16;
    }

    public void setNickname( String Nickname ) {
        this.Nickname = Nickname;
    }

    public void setLanguage( float Language ) {
        this.Language = Language;
    }

    public void setFlagIsBadEgg( boolean FlagIsBadEgg ) {
        this.FlagIsBadEgg = FlagIsBadEgg;
    }

    public void setFlagHasSpecies( boolean FlagHasSpecies ) {
        this.FlagHasSpecies = FlagHasSpecies;
    }

    public void setFlagIsEgg( boolean FlagIsEgg ) {
        this.FlagIsEgg = FlagIsEgg;
    }

    public void setOriginalTrainerName( String OriginalTrainerName ) {
        this.OriginalTrainerName = OriginalTrainerName;
    }

    public void setMarkingValue( float MarkingValue ) {
        this.MarkingValue = MarkingValue;
    }

    public void setChecksum( float Checksum ) {
        this.Checksum = Checksum;
    }

    public void setSanity( float Sanity ) {
        this.Sanity = Sanity;
    }

    public void setSpeciesInternal( float SpeciesInternal ) {
        this.SpeciesInternal = SpeciesInternal;
    }

    public void setSpecies( float Species ) {
        this.Species = Species;
    }

    public void setSpriteItem( float SpriteItem ) {
        this.SpriteItem = SpriteItem;
    }

    public void setHeldItem( float HeldItem ) {
        this.HeldItem = HeldItem;
    }

    public void setEXP( float EXP ) {
        this.EXP = EXP;
    }

    public void setPPUps( float PPUps ) {
        this.PPUps = PPUps;
    }

    public void setMove1_PPUps( float Move1_PPUps ) {
        this.Move1_PPUps = Move1_PPUps;
    }

    public void setMove2_PPUps( float Move2_PPUps ) {
        this.Move2_PPUps = Move2_PPUps;
    }

    public void setMove3_PPUps( float Move3_PPUps ) {
        this.Move3_PPUps = Move3_PPUps;
    }

    public void setMove4_PPUps( float Move4_PPUps ) {
        this.Move4_PPUps = Move4_PPUps;
    }

    public void setOriginalTrainerFriendship( float OriginalTrainerFriendship ) {
        this.OriginalTrainerFriendship = OriginalTrainerFriendship;
    }

    public void setMove1( float Move1 ) {
        this.Move1 = Move1;
    }

    public void setMove2( float Move2 ) {
        this.Move2 = Move2;
    }

    public void setMove3( float Move3 ) {
        this.Move3 = Move3;
    }

    public void setMove4( float Move4 ) {
        this.Move4 = Move4;
    }

    public void setMove1_PP( float Move1_PP ) {
        this.Move1_PP = Move1_PP;
    }

    public void setMove2_PP( float Move2_PP ) {
        this.Move2_PP = Move2_PP;
    }

    public void setMove3_PP( float Move3_PP ) {
        this.Move3_PP = Move3_PP;
    }

    public void setMove4_PP( float Move4_PP ) {
        this.Move4_PP = Move4_PP;
    }

    public void setEV_HP( float EV_HP ) {
        this.EV_HP = EV_HP;
    }

    public void setEV_ATK( float EV_ATK ) {
        this.EV_ATK = EV_ATK;
    }

    public void setEV_DEF( float EV_DEF ) {
        this.EV_DEF = EV_DEF;
    }

    public void setEV_SPE( float EV_SPE ) {
        this.EV_SPE = EV_SPE;
    }

    public void setEV_SPA( float EV_SPA ) {
        this.EV_SPA = EV_SPA;
    }

    public void setEV_SPD( float EV_SPD ) {
        this.EV_SPD = EV_SPD;
    }

    public void setContestCool( float ContestCool ) {
        this.ContestCool = ContestCool;
    }

    public void setContestBeauty( float ContestBeauty ) {
        this.ContestBeauty = ContestBeauty;
    }

    public void setContestCute( float ContestCute ) {
        this.ContestCute = ContestCute;
    }

    public void setContestSmart( float ContestSmart ) {
        this.ContestSmart = ContestSmart;
    }

    public void setContestTough( float ContestTough ) {
        this.ContestTough = ContestTough;
    }

    public void setContestSheen( float ContestSheen ) {
        this.ContestSheen = ContestSheen;
    }

    public void setPokerusState( float PokerusState ) {
        this.PokerusState = PokerusState;
    }

    public void setPokerusDays( float PokerusDays ) {
        this.PokerusDays = PokerusDays;
    }

    public void setPokerusStrain( float PokerusStrain ) {
        this.PokerusStrain = PokerusStrain;
    }

    public void setMetLocation( float MetLocation ) {
        this.MetLocation = MetLocation;
    }

    public void setOrigins( float Origins ) {
        this.Origins = Origins;
    }

    public void setMetLevel( float MetLevel ) {
        this.MetLevel = MetLevel;
    }

    public void setVersion( float Version ) {
        this.Version = Version;
    }

    public void setBall( float Ball ) {
        this.Ball = Ball;
    }

    public void setOriginalTrainerGender( float OriginalTrainerGender ) {
        this.OriginalTrainerGender = OriginalTrainerGender;
    }

    public void setIV32( float IV32 ) {
        this.IV32 = IV32;
    }

    public void setIV_HP( float IV_HP ) {
        this.IV_HP = IV_HP;
    }

    public void setIV_ATK( float IV_ATK ) {
        this.IV_ATK = IV_ATK;
    }

    public void setIV_DEF( float IV_DEF ) {
        this.IV_DEF = IV_DEF;
    }

    public void setIV_SPE( float IV_SPE ) {
        this.IV_SPE = IV_SPE;
    }

    public void setIV_SPA( float IV_SPA ) {
        this.IV_SPA = IV_SPA;
    }

    public void setIV_SPD( float IV_SPD ) {
        this.IV_SPD = IV_SPD;
    }

    public void setIsEgg( boolean IsEgg ) {
        this.IsEgg = IsEgg;
    }

    public void setAbilityBit( boolean AbilityBit ) {
        this.AbilityBit = AbilityBit;
    }

    public void setRIB0( float RIB0 ) {
        this.RIB0 = RIB0;
    }

    public void setRibbonCountG3Cool( float RibbonCountG3Cool ) {
        this.RibbonCountG3Cool = RibbonCountG3Cool;
    }

    public void setRibbonCountG3Beauty( float RibbonCountG3Beauty ) {
        this.RibbonCountG3Beauty = RibbonCountG3Beauty;
    }

    public void setRibbonCountG3Cute( float RibbonCountG3Cute ) {
        this.RibbonCountG3Cute = RibbonCountG3Cute;
    }

    public void setRibbonCountG3Smart( float RibbonCountG3Smart ) {
        this.RibbonCountG3Smart = RibbonCountG3Smart;
    }

    public void setRibbonCountG3Tough( float RibbonCountG3Tough ) {
        this.RibbonCountG3Tough = RibbonCountG3Tough;
    }

    public void setRibbonChampionG3( boolean RibbonChampionG3 ) {
        this.RibbonChampionG3 = RibbonChampionG3;
    }

    public void setRibbonWinning( boolean RibbonWinning ) {
        this.RibbonWinning = RibbonWinning;
    }

    public void setRibbonVictory( boolean RibbonVictory ) {
        this.RibbonVictory = RibbonVictory;
    }

    public void setRibbonArtist( boolean RibbonArtist ) {
        this.RibbonArtist = RibbonArtist;
    }

    public void setRibbonEffort( boolean RibbonEffort ) {
        this.RibbonEffort = RibbonEffort;
    }

    public void setRibbonChampionBattle( boolean RibbonChampionBattle ) {
        this.RibbonChampionBattle = RibbonChampionBattle;
    }

    public void setRibbonChampionRegional( boolean RibbonChampionRegional ) {
        this.RibbonChampionRegional = RibbonChampionRegional;
    }

    public void setRibbonChampionNational( boolean RibbonChampionNational ) {
        this.RibbonChampionNational = RibbonChampionNational;
    }

    public void setRibbonCountry( boolean RibbonCountry ) {
        this.RibbonCountry = RibbonCountry;
    }

    public void setRibbonNational( boolean RibbonNational ) {
        this.RibbonNational = RibbonNational;
    }

    public void setRibbonEarth( boolean RibbonEarth ) {
        this.RibbonEarth = RibbonEarth;
    }

    public void setRibbonWorld( boolean RibbonWorld ) {
        this.RibbonWorld = RibbonWorld;
    }

    public void setUnused1( boolean Unused1 ) {
        this.Unused1 = Unused1;
    }

    public void setUnused2( boolean Unused2 ) {
        this.Unused2 = Unused2;
    }

    public void setUnused3( boolean Unused3 ) {
        this.Unused3 = Unused3;
    }

    public void setUnused4( boolean Unused4 ) {
        this.Unused4 = Unused4;
    }

    public void setFatefulEncounter( boolean FatefulEncounter ) {
        this.FatefulEncounter = FatefulEncounter;
    }

    public void setRibbonCount( float RibbonCount ) {
        this.RibbonCount = RibbonCount;
    }

    public void setStatus_Condition( float Status_Condition ) {
        this.Status_Condition = Status_Condition;
    }

    public void setStat_Level( float Stat_Level ) {
        this.Stat_Level = Stat_Level;
    }

    public void setHeldMailID( float HeldMailID ) {
        this.HeldMailID = HeldMailID;
    }

    public void setStat_HPCurrent( float Stat_HPCurrent ) {
        this.Stat_HPCurrent = Stat_HPCurrent;
    }

    public void setStat_HPMax( float Stat_HPMax ) {
        this.Stat_HPMax = Stat_HPMax;
    }

    public void setStat_ATK( float Stat_ATK ) {
        this.Stat_ATK = Stat_ATK;
    }

    public void setStat_DEF( float Stat_DEF ) {
        this.Stat_DEF = Stat_DEF;
    }

    public void setStat_SPE( float Stat_SPE ) {
        this.Stat_SPE = Stat_SPE;
    }

    public void setStat_SPA( float Stat_SPA ) {
        this.Stat_SPA = Stat_SPA;
    }

    public void setStat_SPD( float Stat_SPD ) {
        this.Stat_SPD = Stat_SPD;
    }

    public void setChecksumValid( boolean ChecksumValid ) {
        this.ChecksumValid = ChecksumValid;
    }

    public void setMaxMoveID( float MaxMoveID ) {
        this.MaxMoveID = MaxMoveID;
    }

    public void setMaxSpeciesID( float MaxSpeciesID ) {
        this.MaxSpeciesID = MaxSpeciesID;
    }

    public void setMaxAbilityID( float MaxAbilityID ) {
        this.MaxAbilityID = MaxAbilityID;
    }

    public void setMaxItemID( float MaxItemID ) {
        this.MaxItemID = MaxItemID;
    }

    public void setMaxBallID( float MaxBallID ) {
        this.MaxBallID = MaxBallID;
    }

    public void setMaxGameID( float MaxGameID ) {
        this.MaxGameID = MaxGameID;
    }

    public void setMaxIV( float MaxIV ) {
        this.MaxIV = MaxIV;
    }

    public void setMaxEV( float MaxEV ) {
        this.MaxEV = MaxEV;
    }

    public void setMaxStringLengthTrainer( float MaxStringLengthTrainer ) {
        this.MaxStringLengthTrainer = MaxStringLengthTrainer;
    }

    public void setMaxStringLengthNickname( float MaxStringLengthNickname ) {
        this.MaxStringLengthNickname = MaxStringLengthNickname;
    }

    public void setPSV( float PSV ) {
        this.PSV = PSV;
    }

    public void setTSV( float TSV ) {
        this.TSV = TSV;
    }

    public void setJapanese( boolean Japanese ) {
        this.Japanese = Japanese;
    }

    public void setAbility( float Ability ) {
        this.Ability = Ability;
    }

    public void setEncryptionConstant( float EncryptionConstant ) {
        this.EncryptionConstant = EncryptionConstant;
    }

    public void setNature( float Nature ) {
        this.Nature = Nature;
    }

    public void setIsNicknamed( boolean IsNicknamed ) {
        this.IsNicknamed = IsNicknamed;
    }

    public void setGender( float Gender ) {
        this.Gender = Gender;
    }

    public void setCharacteristic( float Characteristic ) {
        this.Characteristic = Characteristic;
    }

    public void setCurrentFriendship( float CurrentFriendship ) {
        this.CurrentFriendship = CurrentFriendship;
    }

    public void setCurrentHandler( float CurrentHandler ) {
        this.CurrentHandler = CurrentHandler;
    }

    public void setEggLocation( float EggLocation ) {
        this.EggLocation = EggLocation;
    }

    public void setMarkingCount( float MarkingCount ) {
        this.MarkingCount = MarkingCount;
    }

    public void setMarkingCircle( boolean MarkingCircle ) {
        this.MarkingCircle = MarkingCircle;
    }

    public void setMarkingTriangle( boolean MarkingTriangle ) {
        this.MarkingTriangle = MarkingTriangle;
    }

    public void setMarkingSquare( boolean MarkingSquare ) {
        this.MarkingSquare = MarkingSquare;
    }

    public void setMarkingHeart( boolean MarkingHeart ) {
        this.MarkingHeart = MarkingHeart;
    }

    public void setForm( float Form ) {
        this.Form = Form;
    }

    public void setAbilityNumber( float AbilityNumber ) {
        this.AbilityNumber = AbilityNumber;
    }

    public void setValid( boolean Valid ) {
        this.Valid = Valid;
    }

    public void setExtension( String Extension ) {
        this.Extension = Extension;
    }

    public void setEncryptedPartyData( String EncryptedPartyData ) {
        this.EncryptedPartyData = EncryptedPartyData;
    }

    public void setEncryptedBoxData( String EncryptedBoxData ) {
        this.EncryptedBoxData = EncryptedBoxData;
    }

    public void setDecryptedPartyData( String DecryptedPartyData ) {
        this.DecryptedPartyData = DecryptedPartyData;
    }

    public void setDecryptedBoxData( String DecryptedBoxData ) {
        this.DecryptedBoxData = DecryptedBoxData;
    }

    public void setFormat( float Format ) {
        this.Format = Format;
    }

    public void setTrainerIDDisplayFormat( float TrainerIDDisplayFormat ) {
        this.TrainerIDDisplayFormat = TrainerIDDisplayFormat;
    }

    public void setStatNature( float StatNature ) {
        this.StatNature = StatNature;
    }

    public void setTrainerTID7( float TrainerTID7 ) {
        this.TrainerTID7 = TrainerTID7;
    }

    public void setTrainerSID7( float TrainerSID7 ) {
        this.TrainerSID7 = TrainerSID7;
    }

    public void setDisplayTID( float DisplayTID ) {
        this.DisplayTID = DisplayTID;
    }

    public void setDisplaySID( float DisplaySID ) {
        this.DisplaySID = DisplaySID;
    }

    public void setKorean( boolean Korean ) {
        this.Korean = Korean;
    }

    public void setMetYear( float MetYear ) {
        this.MetYear = MetYear;
    }

    public void setMetMonth( float MetMonth ) {
        this.MetMonth = MetMonth;
    }

    public void setMetDay( float MetDay ) {
        this.MetDay = MetDay;
    }

    public void setHandlingTrainerName( String HandlingTrainerName ) {
        this.HandlingTrainerName = HandlingTrainerName;
    }

    public void setHandlingTrainerGender( float HandlingTrainerGender ) {
        this.HandlingTrainerGender = HandlingTrainerGender;
    }

    public void setHandlingTrainerFriendship( float HandlingTrainerFriendship ) {
        this.HandlingTrainerFriendship = HandlingTrainerFriendship;
    }

    public void setMetDate( String MetDate ) {
        this.MetDate = MetDate;
    }

    public void setEggYear( float EggYear ) {
        this.EggYear = EggYear;
    }

    public void setEggMonth( float EggMonth ) {
        this.EggMonth = EggMonth;
    }

    public void setEggDay( float EggDay ) {
        this.EggDay = EggDay;
    }

    public void setEggMetDate( String EggMetDate ) {
        this.EggMetDate = EggMetDate;
    }

    public void setRelearnMove1( float RelearnMove1 ) {
        this.RelearnMove1 = RelearnMove1;
    }

    public void setRelearnMove2( float RelearnMove2 ) {
        this.RelearnMove2 = RelearnMove2;
    }

    public void setRelearnMove3( float RelearnMove3 ) {
        this.RelearnMove3 = RelearnMove3;
    }

    public void setRelearnMove4( float RelearnMove4 ) {
        this.RelearnMove4 = RelearnMove4;
    }

    public void setMinGameID( float MinGameID ) {
        this.MinGameID = MinGameID;
    }

    public void setIsShiny( boolean IsShiny ) {
        this.IsShiny = IsShiny;
    }

    public void setShinyXor( float ShinyXor ) {
        this.ShinyXor = ShinyXor;
    }

    public void setE( boolean E ) {
        this.E = E;
    }

    public void setFRLG( boolean FRLG ) {
        this.FRLG = FRLG;
    }

    public void setPt( boolean Pt ) {
        this.Pt = Pt;
    }

    public void setHGSS( boolean HGSS ) {
        this.HGSS = HGSS;
    }

    public void setBW( boolean BW ) {
        this.BW = BW;
    }

    public void setB2W2( boolean B2W2 ) {
        this.B2W2 = B2W2;
    }

    public void setXY( boolean XY ) {
        this.XY = XY;
    }

    public void setAO( boolean AO ) {
        this.AO = AO;
    }

    public void setSM( boolean SM ) {
        this.SM = SM;
    }

    public void setUSUM( boolean USUM ) {
        this.USUM = USUM;
    }

    public void setGO( boolean GO ) {
        this.GO = GO;
    }

    public void setVC1( boolean VC1 ) {
        this.VC1 = VC1;
    }

    public void setVC2( boolean VC2 ) {
        this.VC2 = VC2;
    }

    public void setLGPE( boolean LGPE ) {
        this.LGPE = LGPE;
    }

    public void setSWSH( boolean SWSH ) {
        this.SWSH = SWSH;
    }

    public void setBDSP( boolean BDSP ) {
        this.BDSP = BDSP;
    }

    public void setLA( boolean LA ) {
        this.LA = LA;
    }

    public void setSV( boolean SV ) {
        this.SV = SV;
    }

    public void setGO_LGPE( boolean GO_LGPE ) {
        this.GO_LGPE = GO_LGPE;
    }

    public void setGO_HOME( boolean GO_HOME ) {
        this.GO_HOME = GO_HOME;
    }

    public void setVC( boolean VC ) {
        this.VC = VC;
    }

    public void setGG( boolean GG ) {
        this.GG = GG;
    }

    public void setGen9( boolean Gen9 ) {
        this.Gen9 = Gen9;
    }

    public void setGen8( boolean Gen8 ) {
        this.Gen8 = Gen8;
    }

    public void setGen7( boolean Gen7 ) {
        this.Gen7 = Gen7;
    }

    public void setGen6( boolean Gen6 ) {
        this.Gen6 = Gen6;
    }

    public void setGen5( boolean Gen5 ) {
        this.Gen5 = Gen5;
    }

    public void setGen4( boolean Gen4 ) {
        this.Gen4 = Gen4;
    }

    public void setGen3( boolean Gen3 ) {
        this.Gen3 = Gen3;
    }

    public void setGen2( boolean Gen2 ) {
        this.Gen2 = Gen2;
    }

    public void setGen1( boolean Gen1 ) {
        this.Gen1 = Gen1;
    }

    public void setGenU( boolean GenU ) {
        this.GenU = GenU;
    }

    public void setGeneration( float Generation ) {
        this.Generation = Generation;
    }

    public void setIsPokerusInfected( boolean IsPokerusInfected ) {
        this.IsPokerusInfected = IsPokerusInfected;
    }

    public void setIsPokerusCured( boolean IsPokerusCured ) {
        this.IsPokerusCured = IsPokerusCured;
    }

    public void setCurrentLevel( float CurrentLevel ) {
        this.CurrentLevel = CurrentLevel;
    }

    public void setIVTotal( float IVTotal ) {
        this.IVTotal = IVTotal;
    }

    public void setEVTotal( float EVTotal ) {
        this.EVTotal = EVTotal;
    }

    public void setMaximumIV( float MaximumIV ) {
        this.MaximumIV = MaximumIV;
    }

    public void setFlawlessIVCount( float FlawlessIVCount ) {
        this.FlawlessIVCount = FlawlessIVCount;
    }

    public void setFileName( String FileName ) {
        this.FileName = FileName;
    }

    public void setFileNameWithoutExtension( String FileNameWithoutExtension ) {
        this.FileNameWithoutExtension = FileNameWithoutExtension;
    }

    public void setMoveCount( float MoveCount ) {
        this.MoveCount = MoveCount;
    }

    public void setPIDAbility( float PIDAbility ) {
        this.PIDAbility = PIDAbility;
    }

    public void setHPPower( float HPPower ) {
        this.HPPower = HPPower;
    }

    public void setHPType( float HPType ) {
        this.HPType = HPType;
    }

    public void setWasEgg( boolean WasEgg ) {
        this.WasEgg = WasEgg;
    }

    public void setWasTradedEgg( boolean WasTradedEgg ) {
        this.WasTradedEgg = WasTradedEgg;
    }

    public void setIsTradedEgg( boolean IsTradedEgg ) {
        this.IsTradedEgg = IsTradedEgg;
    }

    public void setIsUntraded( boolean IsUntraded ) {
        this.IsUntraded = IsUntraded;
    }

    public void setIsOriginValid( boolean IsOriginValid ) {
        this.IsOriginValid = IsOriginValid;
    }

    public void setHasOriginalMetLocation( boolean HasOriginalMetLocation ) {
        this.HasOriginalMetLocation = HasOriginalMetLocation;
    }

    public void setPotentialRating( float PotentialRating ) {
        this.PotentialRating = PotentialRating;
    }

    public void setPartyStatsPresent( boolean PartyStatsPresent ) {
        this.PartyStatsPresent = PartyStatsPresent;
    }

    public void setHPBitValPower( float HPBitValPower ) {
        this.HPBitValPower = HPBitValPower;
    }

    public void setHPBitValType( float HPBitValType ) {
        this.HPBitValType = HPBitValType;
    }
}
class PersonalInfo {
    private float HP;
    private float ATK;
    private float DEF;
    private float SPE;
    private float SPA;
    private float SPD;
    private float Type1;
    private float Type2;
    private float CatchRate;
    private float BaseEXP;
    private float EVYield;
    private float EV_HP;
    private float EV_ATK;
    private float EV_DEF;
    private float EV_SPE;
    private float EV_SPA;
    private float EV_SPD;
    private float Item1;
    private float Item2;
    private float Gender;
    private float HatchCycles;
    private float BaseFriendship;
    private float EXPGrowth;
    private float EggGroup1;
    private float EggGroup2;
    private float Ability1;
    private float Ability2;
    private float EscapeRate;
    private float Color;
    private boolean NoFlip;
    private float AbilityCount;
    private boolean HasSecondAbility;
    ArrayList<Object> TMHM = new ArrayList<Object>();
    ArrayList<Object> TypeTutors = new ArrayList<Object>();
    private float EvoStage;
    private float FormCount;
    private float FormStatsIndex;
    private float Height;
    private float Weight;
    private boolean IsDualGender;
    private boolean Genderless;
    private boolean OnlyFemale;
    private boolean OnlyMale;
    private boolean HasForms;


    // Getter Methods

    public float getHP() {
        return HP;
    }

    public float getATK() {
        return ATK;
    }

    public float getDEF() {
        return DEF;
    }

    public float getSPE() {
        return SPE;
    }

    public float getSPA() {
        return SPA;
    }

    public float getSPD() {
        return SPD;
    }

    public float getType1() {
        return Type1;
    }

    public float getType2() {
        return Type2;
    }

    public float getCatchRate() {
        return CatchRate;
    }

    public float getBaseEXP() {
        return BaseEXP;
    }

    public float getEVYield() {
        return EVYield;
    }

    public float getEV_HP() {
        return EV_HP;
    }

    public float getEV_ATK() {
        return EV_ATK;
    }

    public float getEV_DEF() {
        return EV_DEF;
    }

    public float getEV_SPE() {
        return EV_SPE;
    }

    public float getEV_SPA() {
        return EV_SPA;
    }

    public float getEV_SPD() {
        return EV_SPD;
    }

    public float getItem1() {
        return Item1;
    }

    public float getItem2() {
        return Item2;
    }

    public float getGender() {
        return Gender;
    }

    public float getHatchCycles() {
        return HatchCycles;
    }

    public float getBaseFriendship() {
        return BaseFriendship;
    }

    public float getEXPGrowth() {
        return EXPGrowth;
    }

    public float getEggGroup1() {
        return EggGroup1;
    }

    public float getEggGroup2() {
        return EggGroup2;
    }

    public float getAbility1() {
        return Ability1;
    }

    public float getAbility2() {
        return Ability2;
    }

    public float getEscapeRate() {
        return EscapeRate;
    }

    public float getColor() {
        return Color;
    }

    public boolean getNoFlip() {
        return NoFlip;
    }

    public float getAbilityCount() {
        return AbilityCount;
    }

    public boolean getHasSecondAbility() {
        return HasSecondAbility;
    }

    public float getEvoStage() {
        return EvoStage;
    }

    public float getFormCount() {
        return FormCount;
    }

    public float getFormStatsIndex() {
        return FormStatsIndex;
    }

    public float getHeight() {
        return Height;
    }

    public float getWeight() {
        return Weight;
    }

    public boolean getIsDualGender() {
        return IsDualGender;
    }

    public boolean getGenderless() {
        return Genderless;
    }

    public boolean getOnlyFemale() {
        return OnlyFemale;
    }

    public boolean getOnlyMale() {
        return OnlyMale;
    }

    public boolean getHasForms() {
        return HasForms;
    }

    // Setter Methods

    public void setHP( float HP ) {
        this.HP = HP;
    }

    public void setATK( float ATK ) {
        this.ATK = ATK;
    }

    public void setDEF( float DEF ) {
        this.DEF = DEF;
    }

    public void setSPE( float SPE ) {
        this.SPE = SPE;
    }

    public void setSPA( float SPA ) {
        this.SPA = SPA;
    }

    public void setSPD( float SPD ) {
        this.SPD = SPD;
    }

    public void setType1( float Type1 ) {
        this.Type1 = Type1;
    }

    public void setType2( float Type2 ) {
        this.Type2 = Type2;
    }

    public void setCatchRate( float CatchRate ) {
        this.CatchRate = CatchRate;
    }

    public void setBaseEXP( float BaseEXP ) {
        this.BaseEXP = BaseEXP;
    }

    public void setEVYield( float EVYield ) {
        this.EVYield = EVYield;
    }

    public void setEV_HP( float EV_HP ) {
        this.EV_HP = EV_HP;
    }

    public void setEV_ATK( float EV_ATK ) {
        this.EV_ATK = EV_ATK;
    }

    public void setEV_DEF( float EV_DEF ) {
        this.EV_DEF = EV_DEF;
    }

    public void setEV_SPE( float EV_SPE ) {
        this.EV_SPE = EV_SPE;
    }

    public void setEV_SPA( float EV_SPA ) {
        this.EV_SPA = EV_SPA;
    }

    public void setEV_SPD( float EV_SPD ) {
        this.EV_SPD = EV_SPD;
    }

    public void setItem1( float Item1 ) {
        this.Item1 = Item1;
    }

    public void setItem2( float Item2 ) {
        this.Item2 = Item2;
    }

    public void setGender( float Gender ) {
        this.Gender = Gender;
    }

    public void setHatchCycles( float HatchCycles ) {
        this.HatchCycles = HatchCycles;
    }

    public void setBaseFriendship( float BaseFriendship ) {
        this.BaseFriendship = BaseFriendship;
    }

    public void setEXPGrowth( float EXPGrowth ) {
        this.EXPGrowth = EXPGrowth;
    }

    public void setEggGroup1( float EggGroup1 ) {
        this.EggGroup1 = EggGroup1;
    }

    public void setEggGroup2( float EggGroup2 ) {
        this.EggGroup2 = EggGroup2;
    }

    public void setAbility1( float Ability1 ) {
        this.Ability1 = Ability1;
    }

    public void setAbility2( float Ability2 ) {
        this.Ability2 = Ability2;
    }

    public void setEscapeRate( float EscapeRate ) {
        this.EscapeRate = EscapeRate;
    }

    public void setColor( float Color ) {
        this.Color = Color;
    }

    public void setNoFlip( boolean NoFlip ) {
        this.NoFlip = NoFlip;
    }

    public void setAbilityCount( float AbilityCount ) {
        this.AbilityCount = AbilityCount;
    }

    public void setHasSecondAbility( boolean HasSecondAbility ) {
        this.HasSecondAbility = HasSecondAbility;
    }

    public void setEvoStage( float EvoStage ) {
        this.EvoStage = EvoStage;
    }

    public void setFormCount( float FormCount ) {
        this.FormCount = FormCount;
    }

    public void setFormStatsIndex( float FormStatsIndex ) {
        this.FormStatsIndex = FormStatsIndex;
    }

    public void setHeight( float Height ) {
        this.Height = Height;
    }

    public void setWeight( float Weight ) {
        this.Weight = Weight;
    }

    public void setIsDualGender( boolean IsDualGender ) {
        this.IsDualGender = IsDualGender;
    }

    public void setGenderless( boolean Genderless ) {
        this.Genderless = Genderless;
    }

    public void setOnlyFemale( boolean OnlyFemale ) {
        this.OnlyFemale = OnlyFemale;
    }

    public void setOnlyMale( boolean OnlyMale ) {
        this.OnlyMale = OnlyMale;
    }

    public void setHasForms( boolean HasForms ) {
        this.HasForms = HasForms;
    }
}
class MysteryData {
    private String Data;
    private float Magic;
    private float MapGroup;
    private float MapNumber;
    private float ObjectID;
    private float Checksum;


    // Getter Methods

    public String getData() {
        return Data;
    }

    public float getMagic() {
        return Magic;
    }

    public float getMapGroup() {
        return MapGroup;
    }

    public float getMapNumber() {
        return MapNumber;
    }

    public float getObjectID() {
        return ObjectID;
    }

    public float getChecksum() {
        return Checksum;
    }

    // Setter Methods

    public void setData( String Data ) {
        this.Data = Data;
    }

    public void setMagic( float Magic ) {
        this.Magic = Magic;
    }

    public void setMapGroup( float MapGroup ) {
        this.MapGroup = MapGroup;
    }

    public void setMapNumber( float MapNumber ) {
        this.MapNumber = MapNumber;
    }

    public void setObjectID( float ObjectID ) {
        this.ObjectID = ObjectID;
    }

    public void setChecksum( float Checksum ) {
        this.Checksum = Checksum;
    }
}
class WonderCardExtra {
    private String Data;
    private float Wins;
    private float Losses;
    private float Trades;
    private float Unk;
    private float Checksum;


    // Getter Methods

    public String getData() {
        return Data;
    }

    public float getWins() {
        return Wins;
    }

    public float getLosses() {
        return Losses;
    }

    public float getTrades() {
        return Trades;
    }

    public float getUnk() {
        return Unk;
    }

    public float getChecksum() {
        return Checksum;
    }

    // Setter Methods

    public void setData( String Data ) {
        this.Data = Data;
    }

    public void setWins( float Wins ) {
        this.Wins = Wins;
    }

    public void setLosses( float Losses ) {
        this.Losses = Losses;
    }

    public void setTrades( float Trades ) {
        this.Trades = Trades;
    }

    public void setUnk( float Unk ) {
        this.Unk = Unk;
    }

    public void setChecksum( float Checksum ) {
        this.Checksum = Checksum;
    }
}
class WonderCard {
    private String Data;
    private boolean Japanese;
    private float CardID;
    private float Icon;
    private float Count;
    private float Type;
    private float Color;
    private float ShareState;
    private float Count2;
    private String Title;
    private String Subtitle;
    private float Checksum;


    // Getter Methods

    public String getData() {
        return Data;
    }

    public boolean getJapanese() {
        return Japanese;
    }

    public float getCardID() {
        return CardID;
    }

    public float getIcon() {
        return Icon;
    }

    public float getCount() {
        return Count;
    }

    public float getType() {
        return Type;
    }

    public float getColor() {
        return Color;
    }

    public float getShareState() {
        return ShareState;
    }

    public float getCount2() {
        return Count2;
    }

    public String getTitle() {
        return Title;
    }

    public String getSubtitle() {
        return Subtitle;
    }

    public float getChecksum() {
        return Checksum;
    }

    // Setter Methods

    public void setData( String Data ) {
        this.Data = Data;
    }

    public void setJapanese( boolean Japanese ) {
        this.Japanese = Japanese;
    }

    public void setCardID( float CardID ) {
        this.CardID = CardID;
    }

    public void setIcon( float Icon ) {
        this.Icon = Icon;
    }

    public void setCount( float Count ) {
        this.Count = Count;
    }

    public void setType( float Type ) {
        this.Type = Type;
    }

    public void setColor( float Color ) {
        this.Color = Color;
    }

    public void setShareState( float ShareState ) {
        this.ShareState = ShareState;
    }

    public void setCount2( float Count2 ) {
        this.Count2 = Count2;
    }

    public void setTitle( String Title ) {
        this.Title = Title;
    }

    public void setSubtitle( String Subtitle ) {
        this.Subtitle = Subtitle;
    }

    public void setChecksum( float Checksum ) {
        this.Checksum = Checksum;
    }
}
class WonderNews {
    private String Data;
    private boolean Japanese;
    private float NewsID;
    private float Flag;
    private float Color;
    private String Title;
    private float Checksum;


    // Getter Methods

    public String getData() {
        return Data;
    }

    public boolean getJapanese() {
        return Japanese;
    }

    public float getNewsID() {
        return NewsID;
    }

    public float getFlag() {
        return Flag;
    }

    public float getColor() {
        return Color;
    }

    public String getTitle() {
        return Title;
    }

    public float getChecksum() {
        return Checksum;
    }

    // Setter Methods

    public void setData( String Data ) {
        this.Data = Data;
    }

    public void setJapanese( boolean Japanese ) {
        this.Japanese = Japanese;
    }

    public void setNewsID( float NewsID ) {
        this.NewsID = NewsID;
    }

    public void setFlag( float Flag ) {
        this.Flag = Flag;
    }

    public void setColor( float Color ) {
        this.Color = Color;
    }

    public void setTitle( String Title ) {
        this.Title = Title;
    }

    public void setChecksum( float Checksum ) {
        this.Checksum = Checksum;
    }
}
class Personal {
    ArrayList<Object> Table = new ArrayList<Object>();
    private float MaxSpeciesID;


    // Getter Methods

    public float getMaxSpeciesID() {
        return MaxSpeciesID;
    }

    // Setter Methods

    public void setMaxSpeciesID( float MaxSpeciesID ) {
        this.MaxSpeciesID = MaxSpeciesID;
    }
}
class _personal {
    ArrayList<Object> Table = new ArrayList<Object>();
    private float MaxSpeciesID;


    // Getter Methods

    public float getMaxSpeciesID() {
        return MaxSpeciesID;
    }

    // Setter Methods

    public void setMaxSpeciesID( float MaxSpeciesID ) {
        this.MaxSpeciesID = MaxSpeciesID;
    }
}