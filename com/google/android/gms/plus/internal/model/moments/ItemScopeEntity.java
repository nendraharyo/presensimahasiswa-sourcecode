package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.moments.ItemScope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ItemScopeEntity
  extends FastSafeParcelableJsonResponse
  implements ItemScope
{
  public static final zza CREATOR;
  private static final HashMap zzbeM;
  String mName;
  final int mVersionCode;
  String zzF;
  String zzJN;
  double zzaNF;
  double zzaNG;
  String zzaxl;
  final Set zzbeN;
  ItemScopeEntity zzbeO;
  List zzbeP;
  ItemScopeEntity zzbeQ;
  String zzbeR;
  String zzbeS;
  String zzbeT;
  List zzbeU;
  int zzbeV;
  List zzbeW;
  ItemScopeEntity zzbeX;
  List zzbeY;
  String zzbeZ;
  String zzbfA;
  String zzbfB;
  String zzbfC;
  ItemScopeEntity zzbfD;
  String zzbfE;
  String zzbfF;
  String zzbfG;
  String zzbfH;
  String zzbfa;
  ItemScopeEntity zzbfb;
  String zzbfc;
  String zzbfd;
  List zzbfe;
  String zzbff;
  String zzbfg;
  String zzbfh;
  String zzbfi;
  String zzbfj;
  String zzbfk;
  String zzbfl;
  String zzbfm;
  ItemScopeEntity zzbfn;
  String zzbfo;
  String zzbfp;
  String zzbfq;
  ItemScopeEntity zzbfr;
  ItemScopeEntity zzbfs;
  ItemScopeEntity zzbft;
  List zzbfu;
  String zzbfv;
  String zzbfw;
  String zzbfx;
  String zzbfy;
  ItemScopeEntity zzbfz;
  String zztZ;
  String zzyv;
  
  static
  {
    Object localObject = new com/google/android/gms/plus/internal/model/moments/zza;
    ((zza)localObject).<init>();
    CREATOR = (zza)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    zzbeM = (HashMap)localObject;
    localObject = zzbeM;
    FastJsonResponse.Field localField = FastJsonResponse.Field.zza("about", 2, ItemScopeEntity.class);
    ((HashMap)localObject).put("about", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzm("additionalName", 3);
    ((HashMap)localObject).put("additionalName", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("address", 4, ItemScopeEntity.class);
    ((HashMap)localObject).put("address", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("addressCountry", 5);
    ((HashMap)localObject).put("addressCountry", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("addressLocality", 6);
    ((HashMap)localObject).put("addressLocality", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("addressRegion", 7);
    ((HashMap)localObject).put("addressRegion", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzb("associated_media", 8, ItemScopeEntity.class);
    ((HashMap)localObject).put("associated_media", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzi("attendeeCount", 9);
    ((HashMap)localObject).put("attendeeCount", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzb("attendees", 10, ItemScopeEntity.class);
    ((HashMap)localObject).put("attendees", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("audio", 11, ItemScopeEntity.class);
    ((HashMap)localObject).put("audio", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzb("author", 12, ItemScopeEntity.class);
    ((HashMap)localObject).put("author", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("bestRating", 13);
    ((HashMap)localObject).put("bestRating", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("birthDate", 14);
    ((HashMap)localObject).put("birthDate", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("byArtist", 15, ItemScopeEntity.class);
    ((HashMap)localObject).put("byArtist", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("caption", 16);
    ((HashMap)localObject).put("caption", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("contentSize", 17);
    ((HashMap)localObject).put("contentSize", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("contentUrl", 18);
    ((HashMap)localObject).put("contentUrl", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzb("contributor", 19, ItemScopeEntity.class);
    ((HashMap)localObject).put("contributor", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("dateCreated", 20);
    ((HashMap)localObject).put("dateCreated", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("dateModified", 21);
    ((HashMap)localObject).put("dateModified", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("datePublished", 22);
    ((HashMap)localObject).put("datePublished", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("description", 23);
    ((HashMap)localObject).put("description", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("duration", 24);
    ((HashMap)localObject).put("duration", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("embedUrl", 25);
    ((HashMap)localObject).put("embedUrl", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("endDate", 26);
    ((HashMap)localObject).put("endDate", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("familyName", 27);
    ((HashMap)localObject).put("familyName", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("gender", 28);
    ((HashMap)localObject).put("gender", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("geo", 29, ItemScopeEntity.class);
    ((HashMap)localObject).put("geo", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("givenName", 30);
    ((HashMap)localObject).put("givenName", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("height", 31);
    ((HashMap)localObject).put("height", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("id", 32);
    ((HashMap)localObject).put("id", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("image", 33);
    ((HashMap)localObject).put("image", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("inAlbum", 34, ItemScopeEntity.class);
    ((HashMap)localObject).put("inAlbum", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzj("latitude", 36);
    ((HashMap)localObject).put("latitude", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("location", 37, ItemScopeEntity.class);
    ((HashMap)localObject).put("location", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzj("longitude", 38);
    ((HashMap)localObject).put("longitude", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("name", 39);
    ((HashMap)localObject).put("name", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("partOfTVSeries", 40, ItemScopeEntity.class);
    ((HashMap)localObject).put("partOfTVSeries", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzb("performers", 41, ItemScopeEntity.class);
    ((HashMap)localObject).put("performers", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("playerType", 42);
    ((HashMap)localObject).put("playerType", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("postOfficeBoxNumber", 43);
    ((HashMap)localObject).put("postOfficeBoxNumber", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("postalCode", 44);
    ((HashMap)localObject).put("postalCode", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("ratingValue", 45);
    ((HashMap)localObject).put("ratingValue", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("reviewRating", 46, ItemScopeEntity.class);
    ((HashMap)localObject).put("reviewRating", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("startDate", 47);
    ((HashMap)localObject).put("startDate", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("streetAddress", 48);
    ((HashMap)localObject).put("streetAddress", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("text", 49);
    ((HashMap)localObject).put("text", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("thumbnail", 50, ItemScopeEntity.class);
    ((HashMap)localObject).put("thumbnail", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("thumbnailUrl", 51);
    ((HashMap)localObject).put("thumbnailUrl", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("tickerSymbol", 52);
    ((HashMap)localObject).put("tickerSymbol", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("type", 53);
    ((HashMap)localObject).put("type", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("url", 54);
    ((HashMap)localObject).put("url", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("width", 55);
    ((HashMap)localObject).put("width", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("worstRating", 56);
    ((HashMap)localObject).put("worstRating", localField);
  }
  
  public ItemScopeEntity()
  {
    this.mVersionCode = 1;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzbeN = localHashSet;
  }
  
  ItemScopeEntity(Set paramSet, int paramInt1, ItemScopeEntity paramItemScopeEntity1, List paramList1, ItemScopeEntity paramItemScopeEntity2, String paramString1, String paramString2, String paramString3, List paramList2, int paramInt2, List paramList3, ItemScopeEntity paramItemScopeEntity3, List paramList4, String paramString4, String paramString5, ItemScopeEntity paramItemScopeEntity4, String paramString6, String paramString7, String paramString8, List paramList5, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, ItemScopeEntity paramItemScopeEntity5, String paramString18, String paramString19, String paramString20, String paramString21, ItemScopeEntity paramItemScopeEntity6, double paramDouble1, ItemScopeEntity paramItemScopeEntity7, double paramDouble2, String paramString22, ItemScopeEntity paramItemScopeEntity8, List paramList6, String paramString23, String paramString24, String paramString25, String paramString26, ItemScopeEntity paramItemScopeEntity9, String paramString27, String paramString28, String paramString29, ItemScopeEntity paramItemScopeEntity10, String paramString30, String paramString31, String paramString32, String paramString33, String paramString34, String paramString35)
  {
    this.zzbeN = paramSet;
    this.mVersionCode = paramInt1;
    this.zzbeO = paramItemScopeEntity1;
    this.zzbeP = paramList1;
    this.zzbeQ = paramItemScopeEntity2;
    this.zzbeR = paramString1;
    this.zzbeS = paramString2;
    this.zzbeT = paramString3;
    this.zzbeU = paramList2;
    this.zzbeV = paramInt2;
    this.zzbeW = paramList3;
    this.zzbeX = paramItemScopeEntity3;
    this.zzbeY = paramList4;
    this.zzbeZ = paramString4;
    this.zzbfa = paramString5;
    this.zzbfb = paramItemScopeEntity4;
    this.zzbfc = paramString6;
    this.zzbfd = paramString7;
    this.zztZ = paramString8;
    this.zzbfe = paramList5;
    this.zzbff = paramString9;
    this.zzbfg = paramString10;
    this.zzbfh = paramString11;
    this.zzaxl = paramString12;
    this.zzbfi = paramString13;
    this.zzbfj = paramString14;
    this.zzbfk = paramString15;
    this.zzbfl = paramString16;
    this.zzbfm = paramString17;
    this.zzbfn = paramItemScopeEntity5;
    this.zzbfo = paramString18;
    this.zzbfp = paramString19;
    this.zzyv = paramString20;
    this.zzbfq = paramString21;
    this.zzbfr = paramItemScopeEntity6;
    this.zzaNF = paramDouble1;
    this.zzbfs = paramItemScopeEntity7;
    this.zzaNG = paramDouble2;
    this.mName = paramString22;
    this.zzbft = paramItemScopeEntity8;
    this.zzbfu = paramList6;
    this.zzbfv = paramString23;
    this.zzbfw = paramString24;
    this.zzbfx = paramString25;
    this.zzbfy = paramString26;
    this.zzbfz = paramItemScopeEntity9;
    this.zzbfA = paramString27;
    this.zzbfB = paramString28;
    this.zzbfC = paramString29;
    this.zzbfD = paramItemScopeEntity10;
    this.zzbfE = paramString30;
    this.zzbfF = paramString31;
    this.zzJN = paramString32;
    this.zzF = paramString33;
    this.zzbfG = paramString34;
    this.zzbfH = paramString35;
  }
  
  public ItemScopeEntity(Set paramSet, ItemScopeEntity paramItemScopeEntity1, List paramList1, ItemScopeEntity paramItemScopeEntity2, String paramString1, String paramString2, String paramString3, List paramList2, int paramInt, List paramList3, ItemScopeEntity paramItemScopeEntity3, List paramList4, String paramString4, String paramString5, ItemScopeEntity paramItemScopeEntity4, String paramString6, String paramString7, String paramString8, List paramList5, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, ItemScopeEntity paramItemScopeEntity5, String paramString18, String paramString19, String paramString20, String paramString21, ItemScopeEntity paramItemScopeEntity6, double paramDouble1, ItemScopeEntity paramItemScopeEntity7, double paramDouble2, String paramString22, ItemScopeEntity paramItemScopeEntity8, List paramList6, String paramString23, String paramString24, String paramString25, String paramString26, ItemScopeEntity paramItemScopeEntity9, String paramString27, String paramString28, String paramString29, ItemScopeEntity paramItemScopeEntity10, String paramString30, String paramString31, String paramString32, String paramString33, String paramString34, String paramString35)
  {
    this.zzbeN = paramSet;
    this.mVersionCode = 1;
    this.zzbeO = paramItemScopeEntity1;
    this.zzbeP = paramList1;
    this.zzbeQ = paramItemScopeEntity2;
    this.zzbeR = paramString1;
    this.zzbeS = paramString2;
    this.zzbeT = paramString3;
    this.zzbeU = paramList2;
    this.zzbeV = paramInt;
    this.zzbeW = paramList3;
    this.zzbeX = paramItemScopeEntity3;
    this.zzbeY = paramList4;
    this.zzbeZ = paramString4;
    this.zzbfa = paramString5;
    this.zzbfb = paramItemScopeEntity4;
    this.zzbfc = paramString6;
    this.zzbfd = paramString7;
    this.zztZ = paramString8;
    this.zzbfe = paramList5;
    this.zzbff = paramString9;
    this.zzbfg = paramString10;
    this.zzbfh = paramString11;
    this.zzaxl = paramString12;
    this.zzbfi = paramString13;
    this.zzbfj = paramString14;
    this.zzbfk = paramString15;
    this.zzbfl = paramString16;
    this.zzbfm = paramString17;
    this.zzbfn = paramItemScopeEntity5;
    this.zzbfo = paramString18;
    this.zzbfp = paramString19;
    this.zzyv = paramString20;
    this.zzbfq = paramString21;
    this.zzbfr = paramItemScopeEntity6;
    this.zzaNF = paramDouble1;
    this.zzbfs = paramItemScopeEntity7;
    this.zzaNG = paramDouble2;
    this.mName = paramString22;
    this.zzbft = paramItemScopeEntity8;
    this.zzbfu = paramList6;
    this.zzbfv = paramString23;
    this.zzbfw = paramString24;
    this.zzbfx = paramString25;
    this.zzbfy = paramString26;
    this.zzbfz = paramItemScopeEntity9;
    this.zzbfA = paramString27;
    this.zzbfB = paramString28;
    this.zzbfC = paramString29;
    this.zzbfD = paramItemScopeEntity10;
    this.zzbfE = paramString30;
    this.zzbfF = paramString31;
    this.zzJN = paramString32;
    this.zzF = paramString33;
    this.zzbfG = paramString34;
    this.zzbfH = paramString35;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof ItemScopeEntity;
    Object localObject1;
    if (!bool2)
    {
      bool2 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool2;
      if (this == paramObject)
      {
        bool2 = bool1;
      }
      else
      {
        paramObject = (ItemScopeEntity)paramObject;
        localObject1 = zzbeM.values();
        Iterator localIterator = ((Collection)localObject1).iterator();
        label144:
        do
        {
          do
          {
            bool2 = localIterator.hasNext();
            if (!bool2) {
              break label163;
            }
            localObject1 = (FastJsonResponse.Field)localIterator.next();
            boolean bool3 = zza((FastJsonResponse.Field)localObject1);
            if (!bool3) {
              break label144;
            }
            bool3 = ((ItemScopeEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
            if (!bool3) {
              break;
            }
            Object localObject2 = zzb((FastJsonResponse.Field)localObject1);
            localObject1 = ((ItemScopeEntity)paramObject).zzb((FastJsonResponse.Field)localObject1);
            bool2 = localObject2.equals(localObject1);
          } while (bool2);
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = ((ItemScopeEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
        } while (!bool2);
        bool2 = false;
        localObject1 = null;
        continue;
        label163:
        bool2 = bool1;
      }
    }
  }
  
  public ItemScope getAbout()
  {
    return this.zzbeO;
  }
  
  public List getAdditionalName()
  {
    return this.zzbeP;
  }
  
  public ItemScope getAddress()
  {
    return this.zzbeQ;
  }
  
  public String getAddressCountry()
  {
    return this.zzbeR;
  }
  
  public String getAddressLocality()
  {
    return this.zzbeS;
  }
  
  public String getAddressRegion()
  {
    return this.zzbeT;
  }
  
  public List getAssociated_media()
  {
    return (ArrayList)this.zzbeU;
  }
  
  public int getAttendeeCount()
  {
    return this.zzbeV;
  }
  
  public List getAttendees()
  {
    return (ArrayList)this.zzbeW;
  }
  
  public ItemScope getAudio()
  {
    return this.zzbeX;
  }
  
  public List getAuthor()
  {
    return (ArrayList)this.zzbeY;
  }
  
  public String getBestRating()
  {
    return this.zzbeZ;
  }
  
  public String getBirthDate()
  {
    return this.zzbfa;
  }
  
  public ItemScope getByArtist()
  {
    return this.zzbfb;
  }
  
  public String getCaption()
  {
    return this.zzbfc;
  }
  
  public String getContentSize()
  {
    return this.zzbfd;
  }
  
  public String getContentUrl()
  {
    return this.zztZ;
  }
  
  public List getContributor()
  {
    return (ArrayList)this.zzbfe;
  }
  
  public String getDateCreated()
  {
    return this.zzbff;
  }
  
  public String getDateModified()
  {
    return this.zzbfg;
  }
  
  public String getDatePublished()
  {
    return this.zzbfh;
  }
  
  public String getDescription()
  {
    return this.zzaxl;
  }
  
  public String getDuration()
  {
    return this.zzbfi;
  }
  
  public String getEmbedUrl()
  {
    return this.zzbfj;
  }
  
  public String getEndDate()
  {
    return this.zzbfk;
  }
  
  public String getFamilyName()
  {
    return this.zzbfl;
  }
  
  public String getGender()
  {
    return this.zzbfm;
  }
  
  public ItemScope getGeo()
  {
    return this.zzbfn;
  }
  
  public String getGivenName()
  {
    return this.zzbfo;
  }
  
  public String getHeight()
  {
    return this.zzbfp;
  }
  
  public String getId()
  {
    return this.zzyv;
  }
  
  public String getImage()
  {
    return this.zzbfq;
  }
  
  public ItemScope getInAlbum()
  {
    return this.zzbfr;
  }
  
  public double getLatitude()
  {
    return this.zzaNF;
  }
  
  public ItemScope getLocation()
  {
    return this.zzbfs;
  }
  
  public double getLongitude()
  {
    return this.zzaNG;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public ItemScope getPartOfTVSeries()
  {
    return this.zzbft;
  }
  
  public List getPerformers()
  {
    return (ArrayList)this.zzbfu;
  }
  
  public String getPlayerType()
  {
    return this.zzbfv;
  }
  
  public String getPostOfficeBoxNumber()
  {
    return this.zzbfw;
  }
  
  public String getPostalCode()
  {
    return this.zzbfx;
  }
  
  public String getRatingValue()
  {
    return this.zzbfy;
  }
  
  public ItemScope getReviewRating()
  {
    return this.zzbfz;
  }
  
  public String getStartDate()
  {
    return this.zzbfA;
  }
  
  public String getStreetAddress()
  {
    return this.zzbfB;
  }
  
  public String getText()
  {
    return this.zzbfC;
  }
  
  public ItemScope getThumbnail()
  {
    return this.zzbfD;
  }
  
  public String getThumbnailUrl()
  {
    return this.zzbfE;
  }
  
  public String getTickerSymbol()
  {
    return this.zzbfF;
  }
  
  public String getType()
  {
    return this.zzJN;
  }
  
  public String getUrl()
  {
    return this.zzF;
  }
  
  public String getWidth()
  {
    return this.zzbfG;
  }
  
  public String getWorstRating()
  {
    return this.zzbfH;
  }
  
  public boolean hasAbout()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(2);
    return localSet.contains(localInteger);
  }
  
  public boolean hasAdditionalName()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(3);
    return localSet.contains(localInteger);
  }
  
  public boolean hasAddress()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(4);
    return localSet.contains(localInteger);
  }
  
  public boolean hasAddressCountry()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(5);
    return localSet.contains(localInteger);
  }
  
  public boolean hasAddressLocality()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(6);
    return localSet.contains(localInteger);
  }
  
  public boolean hasAddressRegion()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(7);
    return localSet.contains(localInteger);
  }
  
  public boolean hasAssociated_media()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(8);
    return localSet.contains(localInteger);
  }
  
  public boolean hasAttendeeCount()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(9);
    return localSet.contains(localInteger);
  }
  
  public boolean hasAttendees()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(10);
    return localSet.contains(localInteger);
  }
  
  public boolean hasAudio()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(11);
    return localSet.contains(localInteger);
  }
  
  public boolean hasAuthor()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(12);
    return localSet.contains(localInteger);
  }
  
  public boolean hasBestRating()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(13);
    return localSet.contains(localInteger);
  }
  
  public boolean hasBirthDate()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(14);
    return localSet.contains(localInteger);
  }
  
  public boolean hasByArtist()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(15);
    return localSet.contains(localInteger);
  }
  
  public boolean hasCaption()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(16);
    return localSet.contains(localInteger);
  }
  
  public boolean hasContentSize()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(17);
    return localSet.contains(localInteger);
  }
  
  public boolean hasContentUrl()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(18);
    return localSet.contains(localInteger);
  }
  
  public boolean hasContributor()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(19);
    return localSet.contains(localInteger);
  }
  
  public boolean hasDateCreated()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(20);
    return localSet.contains(localInteger);
  }
  
  public boolean hasDateModified()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(21);
    return localSet.contains(localInteger);
  }
  
  public boolean hasDatePublished()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(22);
    return localSet.contains(localInteger);
  }
  
  public boolean hasDescription()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(23);
    return localSet.contains(localInteger);
  }
  
  public boolean hasDuration()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(24);
    return localSet.contains(localInteger);
  }
  
  public boolean hasEmbedUrl()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(25);
    return localSet.contains(localInteger);
  }
  
  public boolean hasEndDate()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(26);
    return localSet.contains(localInteger);
  }
  
  public boolean hasFamilyName()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(27);
    return localSet.contains(localInteger);
  }
  
  public boolean hasGender()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(28);
    return localSet.contains(localInteger);
  }
  
  public boolean hasGeo()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(29);
    return localSet.contains(localInteger);
  }
  
  public boolean hasGivenName()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(30);
    return localSet.contains(localInteger);
  }
  
  public boolean hasHeight()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(31);
    return localSet.contains(localInteger);
  }
  
  public boolean hasId()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(32);
    return localSet.contains(localInteger);
  }
  
  public boolean hasImage()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(33);
    return localSet.contains(localInteger);
  }
  
  public boolean hasInAlbum()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(34);
    return localSet.contains(localInteger);
  }
  
  public boolean hasLatitude()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(36);
    return localSet.contains(localInteger);
  }
  
  public boolean hasLocation()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(37);
    return localSet.contains(localInteger);
  }
  
  public boolean hasLongitude()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(38);
    return localSet.contains(localInteger);
  }
  
  public boolean hasName()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(39);
    return localSet.contains(localInteger);
  }
  
  public boolean hasPartOfTVSeries()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(40);
    return localSet.contains(localInteger);
  }
  
  public boolean hasPerformers()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(41);
    return localSet.contains(localInteger);
  }
  
  public boolean hasPlayerType()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(42);
    return localSet.contains(localInteger);
  }
  
  public boolean hasPostOfficeBoxNumber()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(43);
    return localSet.contains(localInteger);
  }
  
  public boolean hasPostalCode()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(44);
    return localSet.contains(localInteger);
  }
  
  public boolean hasRatingValue()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(45);
    return localSet.contains(localInteger);
  }
  
  public boolean hasReviewRating()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(46);
    return localSet.contains(localInteger);
  }
  
  public boolean hasStartDate()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(47);
    return localSet.contains(localInteger);
  }
  
  public boolean hasStreetAddress()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(48);
    return localSet.contains(localInteger);
  }
  
  public boolean hasText()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(49);
    return localSet.contains(localInteger);
  }
  
  public boolean hasThumbnail()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(50);
    return localSet.contains(localInteger);
  }
  
  public boolean hasThumbnailUrl()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(51);
    return localSet.contains(localInteger);
  }
  
  public boolean hasTickerSymbol()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(52);
    return localSet.contains(localInteger);
  }
  
  public boolean hasType()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(53);
    return localSet.contains(localInteger);
  }
  
  public boolean hasUrl()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(54);
    return localSet.contains(localInteger);
  }
  
  public boolean hasWidth()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(55);
    return localSet.contains(localInteger);
  }
  
  public boolean hasWorstRating()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(56);
    return localSet.contains(localInteger);
  }
  
  public int hashCode()
  {
    boolean bool1 = false;
    Object localObject = null;
    Iterator localIterator = zzbeM.values().iterator();
    int j = 0;
    bool1 = localIterator.hasNext();
    if (bool1)
    {
      localObject = (FastJsonResponse.Field)localIterator.next();
      boolean bool2 = zza((FastJsonResponse.Field)localObject);
      if (!bool2) {
        break label88;
      }
      int k = ((FastJsonResponse.Field)localObject).zzrs();
      j += k;
      localObject = zzb((FastJsonResponse.Field)localObject);
    }
    label88:
    for (int i = localObject.hashCode() + j;; i = j)
    {
      j = i;
      break;
      return j;
    }
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public HashMap zzFl()
  {
    return zzbeM;
  }
  
  public ItemScopeEntity zzFm()
  {
    return this;
  }
  
  protected boolean zza(FastJsonResponse.Field paramField)
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(paramField.zzrs());
    return localSet.contains(localInteger);
  }
  
  protected Object zzb(FastJsonResponse.Field paramField)
  {
    int i = paramField.zzrs();
    Object localObject1;
    switch (i)
    {
    case 35: 
    default: 
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unknown safe parcelable id=");
      int j = paramField.zzrs();
      localObject2 = j;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 2: 
      localObject1 = this.zzbeO;
    }
    for (;;)
    {
      return localObject1;
      localObject1 = this.zzbeP;
      continue;
      localObject1 = this.zzbeQ;
      continue;
      localObject1 = this.zzbeR;
      continue;
      localObject1 = this.zzbeS;
      continue;
      localObject1 = this.zzbeT;
      continue;
      localObject1 = this.zzbeU;
      continue;
      i = this.zzbeV;
      localObject1 = Integer.valueOf(i);
      continue;
      localObject1 = this.zzbeW;
      continue;
      localObject1 = this.zzbeX;
      continue;
      localObject1 = this.zzbeY;
      continue;
      localObject1 = this.zzbeZ;
      continue;
      localObject1 = this.zzbfa;
      continue;
      localObject1 = this.zzbfb;
      continue;
      localObject1 = this.zzbfc;
      continue;
      localObject1 = this.zzbfd;
      continue;
      localObject1 = this.zztZ;
      continue;
      localObject1 = this.zzbfe;
      continue;
      localObject1 = this.zzbff;
      continue;
      localObject1 = this.zzbfg;
      continue;
      localObject1 = this.zzbfh;
      continue;
      localObject1 = this.zzaxl;
      continue;
      localObject1 = this.zzbfi;
      continue;
      localObject1 = this.zzbfj;
      continue;
      localObject1 = this.zzbfk;
      continue;
      localObject1 = this.zzbfl;
      continue;
      localObject1 = this.zzbfm;
      continue;
      localObject1 = this.zzbfn;
      continue;
      localObject1 = this.zzbfo;
      continue;
      localObject1 = this.zzbfp;
      continue;
      localObject1 = this.zzyv;
      continue;
      localObject1 = this.zzbfq;
      continue;
      localObject1 = this.zzbfr;
      continue;
      double d = this.zzaNF;
      localObject1 = Double.valueOf(d);
      continue;
      localObject1 = this.zzbfs;
      continue;
      d = this.zzaNG;
      localObject1 = Double.valueOf(d);
      continue;
      localObject1 = this.mName;
      continue;
      localObject1 = this.zzbft;
      continue;
      localObject1 = this.zzbfu;
      continue;
      localObject1 = this.zzbfv;
      continue;
      localObject1 = this.zzbfw;
      continue;
      localObject1 = this.zzbfx;
      continue;
      localObject1 = this.zzbfy;
      continue;
      localObject1 = this.zzbfz;
      continue;
      localObject1 = this.zzbfA;
      continue;
      localObject1 = this.zzbfB;
      continue;
      localObject1 = this.zzbfC;
      continue;
      localObject1 = this.zzbfD;
      continue;
      localObject1 = this.zzbfE;
      continue;
      localObject1 = this.zzbfF;
      continue;
      localObject1 = this.zzJN;
      continue;
      localObject1 = this.zzF;
      continue;
      localObject1 = this.zzbfG;
      continue;
      localObject1 = this.zzbfH;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\moments\ItemScopeEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */