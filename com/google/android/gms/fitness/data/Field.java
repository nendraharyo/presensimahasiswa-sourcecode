package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class Field
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final Field FIELD_ACCURACY;
  public static final Field FIELD_ACTIVITY = zzdo("activity");
  public static final Field FIELD_ALTITUDE;
  public static final Field FIELD_AVERAGE;
  public static final Field FIELD_BPM;
  public static final Field FIELD_CALORIES;
  public static final Field FIELD_CIRCUMFERENCE;
  public static final Field FIELD_CONFIDENCE = zzdp("confidence");
  public static final Field FIELD_DISTANCE;
  public static final Field FIELD_DURATION;
  public static final Field FIELD_EXERCISE;
  public static final Field FIELD_FOOD_ITEM;
  public static final Field FIELD_HEIGHT;
  public static final Field FIELD_HIGH_LATITUDE;
  public static final Field FIELD_HIGH_LONGITUDE;
  public static final Field FIELD_LATITUDE;
  public static final Field FIELD_LONGITUDE;
  public static final Field FIELD_LOW_LATITUDE;
  public static final Field FIELD_LOW_LONGITUDE;
  public static final Field FIELD_MAX;
  public static final Field FIELD_MEAL_TYPE;
  public static final Field FIELD_MIN;
  public static final Field FIELD_NUM_SEGMENTS;
  public static final Field FIELD_NUTRIENTS;
  public static final Field FIELD_PERCENTAGE;
  public static final Field FIELD_REPETITIONS;
  public static final Field FIELD_RESISTANCE;
  public static final Field FIELD_RESISTANCE_TYPE;
  public static final Field FIELD_REVOLUTIONS;
  public static final Field FIELD_RPM;
  public static final Field FIELD_SPEED;
  public static final Field FIELD_STEPS;
  public static final Field FIELD_WATTS;
  public static final Field FIELD_WEIGHT;
  public static final int FORMAT_FLOAT = 2;
  public static final int FORMAT_INT32 = 1;
  public static final int FORMAT_MAP = 4;
  public static final int FORMAT_STRING = 3;
  public static final int MEAL_TYPE_BREAKFAST = 1;
  public static final int MEAL_TYPE_DINNER = 3;
  public static final int MEAL_TYPE_LUNCH = 2;
  public static final int MEAL_TYPE_SNACK = 4;
  public static final int MEAL_TYPE_UNKNOWN = 0;
  public static final String NUTRIENT_CALCIUM = "calcium";
  public static final String NUTRIENT_CALORIES = "calories";
  public static final String NUTRIENT_CHOLESTEROL = "cholesterol";
  public static final String NUTRIENT_DIETARY_FIBER = "dietary_fiber";
  public static final String NUTRIENT_IRON = "iron";
  public static final String NUTRIENT_MONOUNSATURATED_FAT = "fat.monounsaturated";
  public static final String NUTRIENT_POLYUNSATURATED_FAT = "fat.polyunsaturated";
  public static final String NUTRIENT_POTASSIUM = "potassium";
  public static final String NUTRIENT_PROTEIN = "protein";
  public static final String NUTRIENT_SATURATED_FAT = "fat.saturated";
  public static final String NUTRIENT_SODIUM = "sodium";
  public static final String NUTRIENT_SUGAR = "sugar";
  public static final String NUTRIENT_TOTAL_CARBS = "carbs.total";
  public static final String NUTRIENT_TOTAL_FAT = "fat.total";
  public static final String NUTRIENT_TRANS_FAT = "fat.trans";
  public static final String NUTRIENT_UNSATURATED_FAT = "fat.unsaturated";
  public static final String NUTRIENT_VITAMIN_A = "vitamin_a";
  public static final String NUTRIENT_VITAMIN_C = "vitamin_c";
  public static final int RESISTANCE_TYPE_BARBELL = 1;
  public static final int RESISTANCE_TYPE_BODY = 6;
  public static final int RESISTANCE_TYPE_CABLE = 2;
  public static final int RESISTANCE_TYPE_DUMBBELL = 3;
  public static final int RESISTANCE_TYPE_KETTLEBELL = 4;
  public static final int RESISTANCE_TYPE_MACHINE = 5;
  public static final int RESISTANCE_TYPE_UNKNOWN;
  public static final Field zzawM = zzds("activity_confidence");
  public static final Field zzawN;
  public static final Field zzawO;
  public static final Field zzawP;
  public static final Field zzawQ;
  public static final Field zzawR;
  public static final Field zzawS;
  public static final Field zzawT;
  public static final Field zzawU;
  public static final Field zzawV;
  public static final Field zzawW;
  public static final Field zzawX;
  public static final Field zzawY;
  private final String mName;
  private final int mVersionCode;
  private final int zzawZ;
  private final Boolean zzaxa;
  
  static
  {
    FIELD_STEPS = zzdo("steps");
    FIELD_DURATION = zzdo("duration");
    zzawN = zzds("activity_duration");
    zzawO = zzds("activity_duration.ascending");
    zzawP = zzds("activity_duration.descending");
    FIELD_BPM = zzdp("bpm");
    FIELD_LATITUDE = zzdp("latitude");
    FIELD_LONGITUDE = zzdp("longitude");
    FIELD_ACCURACY = zzdp("accuracy");
    FIELD_ALTITUDE = zzdq("altitude");
    FIELD_DISTANCE = zzdp("distance");
    FIELD_HEIGHT = zzdp("height");
    FIELD_WEIGHT = zzdp("weight");
    FIELD_CIRCUMFERENCE = zzdp("circumference");
    FIELD_PERCENTAGE = zzdp("percentage");
    FIELD_SPEED = zzdp("speed");
    FIELD_RPM = zzdp("rpm");
    FIELD_REVOLUTIONS = zzdo("revolutions");
    FIELD_CALORIES = zzdp("calories");
    FIELD_WATTS = zzdp("watts");
    FIELD_MEAL_TYPE = zzdo("meal_type");
    FIELD_FOOD_ITEM = zzdr("food_item");
    FIELD_NUTRIENTS = zzds("nutrients");
    zzawQ = zzdp("elevation.change");
    zzawR = zzds("elevation.gain");
    zzawS = zzds("elevation.loss");
    zzawT = zzdp("floors");
    zzawU = zzds("floor.gain");
    zzawV = zzds("floor.loss");
    FIELD_EXERCISE = zzdr("exercise");
    FIELD_REPETITIONS = zzdo("repetitions");
    FIELD_RESISTANCE = zzdp("resistance");
    FIELD_RESISTANCE_TYPE = zzdo("resistance_type");
    FIELD_NUM_SEGMENTS = zzdo("num_segments");
    FIELD_AVERAGE = zzdp("average");
    FIELD_MAX = zzdp("max");
    FIELD_MIN = zzdp("min");
    FIELD_LOW_LATITUDE = zzdp("low_latitude");
    FIELD_LOW_LONGITUDE = zzdp("low_longitude");
    FIELD_HIGH_LATITUDE = zzdp("high_latitude");
    FIELD_HIGH_LONGITUDE = zzdp("high_longitude");
    zzawW = zzdp("x");
    zzawX = zzdp("y");
    zzawY = zzdp("z");
    zzj localzzj = new com/google/android/gms/fitness/data/zzj;
    localzzj.<init>();
    CREATOR = localzzj;
  }
  
  Field(int paramInt1, String paramString, int paramInt2, Boolean paramBoolean)
  {
    this.mVersionCode = paramInt1;
    String str = (String)zzx.zzz(paramString);
    this.mName = str;
    this.zzawZ = paramInt2;
    this.zzaxa = paramBoolean;
  }
  
  private Field(String paramString, int paramInt)
  {
    this(2, paramString, paramInt, null);
  }
  
  private Field(String paramString, int paramInt, Boolean paramBoolean)
  {
    this(2, paramString, paramInt, paramBoolean);
  }
  
  public static Field zza(String paramString, int paramInt, Boolean paramBoolean)
  {
    int i = -1;
    int j = paramString.hashCode();
    Field localField;
    switch (j)
    {
    default: 
      switch (i)
      {
      default: 
        localField = new com/google/android/gms/fitness/data/Field;
        localField.<init>(paramString, paramInt, paramBoolean);
      }
      break;
    }
    for (;;)
    {
      return localField;
      String str = "accuracy";
      boolean bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 0;
      localField = null;
      break;
      str = "activity";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 1;
      break;
      str = "activity_duration";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 2;
      break;
      str = "activity_duration.ascending";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 3;
      break;
      str = "activity_duration.descending";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 4;
      break;
      str = "altitude";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 5;
      break;
      str = "average";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 6;
      break;
      str = "bpm";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 7;
      break;
      str = "calories";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 8;
      break;
      str = "circumference";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 9;
      break;
      str = "confidence";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 10;
      break;
      str = "distance";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 11;
      break;
      str = "duration";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 12;
      break;
      str = "elevation.change";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 13;
      break;
      str = "elevation.gain";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 14;
      break;
      str = "elevation.loss";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 15;
      break;
      str = "exercise";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 16;
      break;
      str = "floor.gain";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 17;
      break;
      str = "floor.loss";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 18;
      break;
      str = "floors";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 19;
      break;
      str = "food_item";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 20;
      break;
      str = "height";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 21;
      break;
      str = "high_latitude";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 22;
      break;
      str = "high_longitude";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 23;
      break;
      str = "latitude";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 24;
      break;
      str = "longitude";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 25;
      break;
      str = "low_latitude";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 26;
      break;
      str = "low_longitude";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 27;
      break;
      str = "max";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 28;
      break;
      str = "meal_type";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 29;
      break;
      str = "min";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 30;
      break;
      str = "num_segments";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 31;
      break;
      str = "nutrients";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 32;
      break;
      str = "percentage";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 33;
      break;
      str = "repetitions";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 34;
      break;
      str = "resistance";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 35;
      break;
      str = "resistance_type";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 36;
      break;
      str = "revolutions";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 37;
      break;
      str = "rpm";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 38;
      break;
      str = "speed";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 39;
      break;
      str = "steps";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 40;
      break;
      str = "watts";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 41;
      break;
      str = "weight";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 42;
      break;
      str = "x";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 43;
      break;
      str = "y";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 44;
      break;
      str = "z";
      bool = paramString.equals(str);
      if (!bool) {
        break;
      }
      i = 45;
      break;
      localField = FIELD_ACCURACY;
      continue;
      localField = FIELD_ACTIVITY;
      continue;
      localField = zzawN;
      continue;
      localField = zzawO;
      continue;
      localField = zzawP;
      continue;
      localField = FIELD_ALTITUDE;
      continue;
      localField = FIELD_AVERAGE;
      continue;
      localField = FIELD_BPM;
      continue;
      localField = FIELD_CALORIES;
      continue;
      localField = FIELD_CIRCUMFERENCE;
      continue;
      localField = FIELD_CONFIDENCE;
      continue;
      localField = FIELD_DISTANCE;
      continue;
      localField = FIELD_DURATION;
      continue;
      localField = zzawQ;
      continue;
      localField = zzawR;
      continue;
      localField = zzawS;
      continue;
      localField = FIELD_EXERCISE;
      continue;
      localField = zzawU;
      continue;
      localField = zzawV;
      continue;
      localField = zzawT;
      continue;
      localField = FIELD_FOOD_ITEM;
      continue;
      localField = FIELD_HEIGHT;
      continue;
      localField = FIELD_HIGH_LATITUDE;
      continue;
      localField = FIELD_HIGH_LONGITUDE;
      continue;
      localField = FIELD_LATITUDE;
      continue;
      localField = FIELD_LONGITUDE;
      continue;
      localField = FIELD_LOW_LATITUDE;
      continue;
      localField = FIELD_LOW_LONGITUDE;
      continue;
      localField = FIELD_MAX;
      continue;
      localField = FIELD_MEAL_TYPE;
      continue;
      localField = FIELD_MIN;
      continue;
      localField = FIELD_NUM_SEGMENTS;
      continue;
      localField = FIELD_NUTRIENTS;
      continue;
      localField = FIELD_PERCENTAGE;
      continue;
      localField = FIELD_REPETITIONS;
      continue;
      localField = FIELD_RESISTANCE;
      continue;
      localField = FIELD_RESISTANCE_TYPE;
      continue;
      localField = FIELD_REVOLUTIONS;
      continue;
      localField = FIELD_RPM;
      continue;
      localField = FIELD_SPEED;
      continue;
      localField = FIELD_STEPS;
      continue;
      localField = FIELD_WATTS;
      continue;
      localField = FIELD_WEIGHT;
      continue;
      localField = zzawW;
      continue;
      localField = zzawX;
      continue;
      localField = zzawY;
    }
  }
  
  private boolean zza(Field paramField)
  {
    String str1 = this.mName;
    String str2 = paramField.mName;
    boolean bool = str1.equals(str2);
    int i;
    if (bool)
    {
      i = this.zzawZ;
      int k = paramField.zzawZ;
      if (i == k) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      str1 = null;
    }
  }
  
  private static Field zzdo(String paramString)
  {
    Field localField = new com/google/android/gms/fitness/data/Field;
    localField.<init>(paramString, 1);
    return localField;
  }
  
  private static Field zzdp(String paramString)
  {
    Field localField = new com/google/android/gms/fitness/data/Field;
    localField.<init>(paramString, 2);
    return localField;
  }
  
  private static Field zzdq(String paramString)
  {
    Field localField = new com/google/android/gms/fitness/data/Field;
    Boolean localBoolean = Boolean.valueOf(true);
    localField.<init>(paramString, 2, localBoolean);
    return localField;
  }
  
  private static Field zzdr(String paramString)
  {
    Field localField = new com/google/android/gms/fitness/data/Field;
    localField.<init>(paramString, 3);
    return localField;
  }
  
  private static Field zzds(String paramString)
  {
    Field localField = new com/google/android/gms/fitness/data/Field;
    localField.<init>(paramString, 4);
    return localField;
  }
  
  public static Field zzn(String paramString, int paramInt)
  {
    return zza(paramString, paramInt, null);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      bool = paramObject instanceof Field;
      if (!bool) {
        break label33;
      }
      paramObject = (Field)paramObject;
      bool = zza((Field)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int getFormat()
  {
    return this.zzawZ;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    return this.mName.hashCode();
  }
  
  public Boolean isOptional()
  {
    return this.zzaxa;
  }
  
  public String toString()
  {
    int i = 1;
    String str1 = "%s(%s)";
    Object[] arrayOfObject = new Object[2];
    String str2 = null;
    String str3 = this.mName;
    arrayOfObject[0] = str3;
    int j = this.zzawZ;
    if (j == i) {}
    for (str2 = "i";; str2 = "f")
    {
      arrayOfObject[i] = str2;
      return String.format(str1, arrayOfObject);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\Field.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */