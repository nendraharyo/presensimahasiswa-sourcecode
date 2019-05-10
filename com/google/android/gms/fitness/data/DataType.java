package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzmr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class DataType
  implements SafeParcelable
{
  public static final DataType AGGREGATE_ACTIVITY_SUMMARY;
  public static final DataType AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY;
  public static final DataType AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY;
  public static final DataType AGGREGATE_CALORIES_CONSUMED;
  public static final DataType AGGREGATE_CALORIES_EXPENDED;
  public static final DataType AGGREGATE_DISTANCE_DELTA;
  public static final DataType AGGREGATE_HEART_RATE_SUMMARY;
  public static final Set AGGREGATE_INPUT_TYPES;
  public static final DataType AGGREGATE_LOCATION_BOUNDING_BOX;
  public static final DataType AGGREGATE_NUTRITION_SUMMARY;
  public static final DataType AGGREGATE_POWER_SUMMARY;
  public static final DataType AGGREGATE_SPEED_SUMMARY;
  public static final DataType AGGREGATE_STEP_COUNT_DELTA;
  public static final DataType AGGREGATE_WEIGHT_SUMMARY;
  public static final Parcelable.Creator CREATOR;
  public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.data_type/";
  public static final DataType TYPE_ACTIVITY_SAMPLE;
  public static final DataType TYPE_ACTIVITY_SEGMENT;
  public static final DataType TYPE_BASAL_METABOLIC_RATE;
  public static final DataType TYPE_BODY_FAT_PERCENTAGE;
  public static final DataType TYPE_CALORIES_CONSUMED;
  public static final DataType TYPE_CALORIES_EXPENDED;
  public static final DataType TYPE_CYCLING_PEDALING_CADENCE;
  public static final DataType TYPE_CYCLING_PEDALING_CUMULATIVE;
  public static final DataType TYPE_CYCLING_WHEEL_REVOLUTION;
  public static final DataType TYPE_CYCLING_WHEEL_RPM;
  public static final DataType TYPE_DISTANCE_CUMULATIVE;
  public static final DataType TYPE_DISTANCE_DELTA;
  public static final DataType TYPE_HEART_RATE_BPM;
  public static final DataType TYPE_HEIGHT;
  public static final DataType TYPE_LOCATION_SAMPLE;
  public static final DataType TYPE_LOCATION_TRACK;
  public static final DataType TYPE_NUTRITION;
  public static final DataType TYPE_POWER_SAMPLE;
  public static final DataType TYPE_SPEED;
  public static final DataType TYPE_STEP_COUNT_CADENCE;
  public static final DataType TYPE_STEP_COUNT_CUMULATIVE;
  public static final DataType TYPE_STEP_COUNT_DELTA;
  public static final DataType TYPE_WEIGHT;
  public static final DataType TYPE_WORKOUT_EXERCISE;
  public static final DataType zzawA;
  public static final DataType zzawB;
  private static final Map zzawC;
  public static final DataType[] zzawD;
  public static final DataType zzawv;
  public static final DataType zzaww;
  public static final DataType zzawx;
  public static final DataType zzawy;
  public static final DataType zzawz;
  private final String mName;
  private final int mVersionCode;
  private final List zzawE;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject1 = new com/google/android/gms/fitness/data/DataType;
    Object localObject2 = new Field[m];
    Field localField1 = Field.FIELD_STEPS;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.step_count.delta", (Field[])localObject2);
    TYPE_STEP_COUNT_DELTA = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_STEPS;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.step_count.cumulative", (Field[])localObject2);
    TYPE_STEP_COUNT_CUMULATIVE = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_RPM;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.step_count.cadence", (Field[])localObject2);
    TYPE_STEP_COUNT_CADENCE = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_ACTIVITY;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.activity.segment", (Field[])localObject2);
    TYPE_ACTIVITY_SEGMENT = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[i];
    localField1 = Field.FIELD_ACTIVITY;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_CONFIDENCE;
    localObject2[m] = localField1;
    localField1 = Field.zzawQ;
    localObject2[k] = localField1;
    localField1 = Field.zzawT;
    localObject2[j] = localField1;
    ((DataType)localObject1).<init>("com.google.floor_change", (Field[])localObject2);
    zzawv = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_CALORIES;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.calories.consumed", (Field[])localObject2);
    TYPE_CALORIES_CONSUMED = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_CALORIES;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.calories.expended", (Field[])localObject2);
    TYPE_CALORIES_EXPENDED = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_CALORIES;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.calories.bmr", (Field[])localObject2);
    TYPE_BASAL_METABOLIC_RATE = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_WATTS;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.power.sample", (Field[])localObject2);
    TYPE_POWER_SAMPLE = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[k];
    localField1 = Field.FIELD_ACTIVITY;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_CONFIDENCE;
    localObject2[m] = localField1;
    ((DataType)localObject1).<init>("com.google.activity.sample", (Field[])localObject2);
    TYPE_ACTIVITY_SAMPLE = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[j];
    localField1 = Field.zzawW;
    localObject2[0] = localField1;
    localField1 = Field.zzawX;
    localObject2[m] = localField1;
    localField1 = Field.zzawY;
    localObject2[k] = localField1;
    ((DataType)localObject1).<init>("com.google.accelerometer", (Field[])localObject2);
    zzaww = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_BPM;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.heart_rate.bpm", (Field[])localObject2);
    TYPE_HEART_RATE_BPM = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[i];
    localField1 = Field.FIELD_LATITUDE;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_LONGITUDE;
    localObject2[m] = localField1;
    localField1 = Field.FIELD_ACCURACY;
    localObject2[k] = localField1;
    localField1 = Field.FIELD_ALTITUDE;
    localObject2[j] = localField1;
    ((DataType)localObject1).<init>("com.google.location.sample", (Field[])localObject2);
    TYPE_LOCATION_SAMPLE = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[i];
    localField1 = Field.FIELD_LATITUDE;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_LONGITUDE;
    localObject2[m] = localField1;
    localField1 = Field.FIELD_ACCURACY;
    localObject2[k] = localField1;
    localField1 = Field.FIELD_ALTITUDE;
    localObject2[j] = localField1;
    ((DataType)localObject1).<init>("com.google.location.track", (Field[])localObject2);
    TYPE_LOCATION_TRACK = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_DISTANCE;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.distance.delta", (Field[])localObject2);
    TYPE_DISTANCE_DELTA = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_DISTANCE;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.distance.cumulative", (Field[])localObject2);
    TYPE_DISTANCE_CUMULATIVE = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_SPEED;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.speed", (Field[])localObject2);
    TYPE_SPEED = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_REVOLUTIONS;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.cycling.wheel_revolution.cumulative", (Field[])localObject2);
    TYPE_CYCLING_WHEEL_REVOLUTION = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_RPM;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.cycling.wheel_revolution.rpm", (Field[])localObject2);
    TYPE_CYCLING_WHEEL_RPM = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_REVOLUTIONS;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.cycling.pedaling.cumulative", (Field[])localObject2);
    TYPE_CYCLING_PEDALING_CUMULATIVE = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_RPM;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.cycling.pedaling.cadence", (Field[])localObject2);
    TYPE_CYCLING_PEDALING_CADENCE = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_HEIGHT;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.height", (Field[])localObject2);
    TYPE_HEIGHT = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_WEIGHT;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.weight", (Field[])localObject2);
    TYPE_WEIGHT = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_PERCENTAGE;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.body.fat.percentage", (Field[])localObject2);
    TYPE_BODY_FAT_PERCENTAGE = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_CIRCUMFERENCE;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.body.waist.circumference", (Field[])localObject2);
    zzawx = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[m];
    localField1 = Field.FIELD_CIRCUMFERENCE;
    localObject2[0] = localField1;
    ((DataType)localObject1).<init>("com.google.body.hip.circumference", (Field[])localObject2);
    zzawy = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[j];
    localField1 = Field.FIELD_NUTRIENTS;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_MEAL_TYPE;
    localObject2[m] = localField1;
    localField1 = Field.FIELD_FOOD_ITEM;
    localObject2[k] = localField1;
    ((DataType)localObject1).<init>("com.google.nutrition", (Field[])localObject2);
    TYPE_NUTRITION = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[5];
    localField1 = Field.FIELD_EXERCISE;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_REPETITIONS;
    localObject2[m] = localField1;
    localField1 = Field.FIELD_DURATION;
    localObject2[k] = localField1;
    localField1 = Field.FIELD_RESISTANCE_TYPE;
    localObject2[j] = localField1;
    localField1 = Field.FIELD_RESISTANCE;
    localObject2[i] = localField1;
    ((DataType)localObject1).<init>("com.google.activity.exercise", (Field[])localObject2);
    TYPE_WORKOUT_EXERCISE = (DataType)localObject1;
    localObject1 = new DataType[14];
    DataType localDataType = TYPE_STEP_COUNT_DELTA;
    localObject1[0] = localDataType;
    localDataType = TYPE_DISTANCE_DELTA;
    localObject1[m] = localDataType;
    localDataType = TYPE_ACTIVITY_SEGMENT;
    localObject1[k] = localDataType;
    localDataType = zzawv;
    localObject1[j] = localDataType;
    localDataType = TYPE_SPEED;
    localObject1[i] = localDataType;
    localObject2 = TYPE_HEART_RATE_BPM;
    localObject1[5] = localObject2;
    localObject2 = TYPE_WEIGHT;
    localObject1[6] = localObject2;
    localObject2 = TYPE_LOCATION_SAMPLE;
    localObject1[7] = localObject2;
    localObject2 = TYPE_CALORIES_CONSUMED;
    localObject1[8] = localObject2;
    localObject2 = TYPE_CALORIES_EXPENDED;
    localObject1[9] = localObject2;
    localObject2 = TYPE_BODY_FAT_PERCENTAGE;
    localObject1[10] = localObject2;
    localObject2 = zzawy;
    localObject1[11] = localObject2;
    localObject2 = zzawx;
    localObject1[12] = localObject2;
    localObject2 = TYPE_NUTRITION;
    localObject1[13] = localObject2;
    AGGREGATE_INPUT_TYPES = zzmr.zzc((Object[])localObject1);
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[j];
    localField1 = Field.FIELD_ACTIVITY;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_DURATION;
    localObject2[m] = localField1;
    localField1 = Field.FIELD_NUM_SEGMENTS;
    localObject2[k] = localField1;
    ((DataType)localObject1).<init>("com.google.activity.summary", (Field[])localObject2);
    AGGREGATE_ACTIVITY_SUMMARY = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[6];
    localField1 = Field.zzawO;
    localObject2[0] = localField1;
    localField1 = Field.zzawP;
    localObject2[m] = localField1;
    localField1 = Field.zzawR;
    localObject2[k] = localField1;
    localField1 = Field.zzawS;
    localObject2[j] = localField1;
    localField1 = Field.zzawU;
    localObject2[i] = localField1;
    Field localField2 = Field.zzawV;
    localObject2[5] = localField2;
    ((DataType)localObject1).<init>("com.google.floor_change.summary", (Field[])localObject2);
    zzawz = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[j];
    localField1 = Field.FIELD_AVERAGE;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_MAX;
    localObject2[m] = localField1;
    localField1 = Field.FIELD_MIN;
    localObject2[k] = localField1;
    ((DataType)localObject1).<init>("com.google.calories.bmr.summary", (Field[])localObject2);
    AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY = (DataType)localObject1;
    AGGREGATE_STEP_COUNT_DELTA = TYPE_STEP_COUNT_DELTA;
    AGGREGATE_DISTANCE_DELTA = TYPE_DISTANCE_DELTA;
    AGGREGATE_CALORIES_CONSUMED = TYPE_CALORIES_CONSUMED;
    AGGREGATE_CALORIES_EXPENDED = TYPE_CALORIES_EXPENDED;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[j];
    localField1 = Field.FIELD_AVERAGE;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_MAX;
    localObject2[m] = localField1;
    localField1 = Field.FIELD_MIN;
    localObject2[k] = localField1;
    ((DataType)localObject1).<init>("com.google.heart_rate.summary", (Field[])localObject2);
    AGGREGATE_HEART_RATE_SUMMARY = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[i];
    localField1 = Field.FIELD_LOW_LATITUDE;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_LOW_LONGITUDE;
    localObject2[m] = localField1;
    localField1 = Field.FIELD_HIGH_LATITUDE;
    localObject2[k] = localField1;
    localField1 = Field.FIELD_HIGH_LONGITUDE;
    localObject2[j] = localField1;
    ((DataType)localObject1).<init>("com.google.location.bounding_box", (Field[])localObject2);
    AGGREGATE_LOCATION_BOUNDING_BOX = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[j];
    localField1 = Field.FIELD_AVERAGE;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_MAX;
    localObject2[m] = localField1;
    localField1 = Field.FIELD_MIN;
    localObject2[k] = localField1;
    ((DataType)localObject1).<init>("com.google.power.summary", (Field[])localObject2);
    AGGREGATE_POWER_SUMMARY = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[j];
    localField1 = Field.FIELD_AVERAGE;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_MAX;
    localObject2[m] = localField1;
    localField1 = Field.FIELD_MIN;
    localObject2[k] = localField1;
    ((DataType)localObject1).<init>("com.google.speed.summary", (Field[])localObject2);
    AGGREGATE_SPEED_SUMMARY = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[j];
    localField1 = Field.FIELD_AVERAGE;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_MAX;
    localObject2[m] = localField1;
    localField1 = Field.FIELD_MIN;
    localObject2[k] = localField1;
    ((DataType)localObject1).<init>("com.google.body.fat.percentage.summary", (Field[])localObject2);
    AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[j];
    localField1 = Field.FIELD_AVERAGE;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_MAX;
    localObject2[m] = localField1;
    localField1 = Field.FIELD_MIN;
    localObject2[k] = localField1;
    ((DataType)localObject1).<init>("com.google.body.hip.circumference.summary", (Field[])localObject2);
    zzawA = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[j];
    localField1 = Field.FIELD_AVERAGE;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_MAX;
    localObject2[m] = localField1;
    localField1 = Field.FIELD_MIN;
    localObject2[k] = localField1;
    ((DataType)localObject1).<init>("com.google.body.waist.circumference.summary", (Field[])localObject2);
    zzawB = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[j];
    localField1 = Field.FIELD_AVERAGE;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_MAX;
    localObject2[m] = localField1;
    localField1 = Field.FIELD_MIN;
    localObject2[k] = localField1;
    ((DataType)localObject1).<init>("com.google.weight.summary", (Field[])localObject2);
    AGGREGATE_WEIGHT_SUMMARY = (DataType)localObject1;
    localObject1 = new com/google/android/gms/fitness/data/DataType;
    localObject2 = new Field[k];
    localField1 = Field.FIELD_NUTRIENTS;
    localObject2[0] = localField1;
    localField1 = Field.FIELD_MEAL_TYPE;
    localObject2[m] = localField1;
    ((DataType)localObject1).<init>("com.google.nutrition.summary", (Field[])localObject2);
    AGGREGATE_NUTRITION_SUMMARY = (DataType)localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    zzawC = (Map)localObject1;
    localObject1 = zzawC;
    localDataType = TYPE_ACTIVITY_SEGMENT;
    localObject2 = Collections.singletonList(AGGREGATE_ACTIVITY_SUMMARY);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = zzawC;
    localDataType = TYPE_BASAL_METABOLIC_RATE;
    localObject2 = Collections.singletonList(AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = zzawC;
    localDataType = TYPE_BODY_FAT_PERCENTAGE;
    localObject2 = Collections.singletonList(AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = zzawC;
    localDataType = zzawy;
    localObject2 = Collections.singletonList(zzawA);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = zzawC;
    localDataType = zzawx;
    localObject2 = Collections.singletonList(zzawB);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = zzawC;
    localDataType = TYPE_CALORIES_CONSUMED;
    localObject2 = Collections.singletonList(AGGREGATE_CALORIES_CONSUMED);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = zzawC;
    localDataType = TYPE_CALORIES_EXPENDED;
    localObject2 = Collections.singletonList(AGGREGATE_CALORIES_EXPENDED);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = zzawC;
    localDataType = TYPE_DISTANCE_DELTA;
    localObject2 = Collections.singletonList(AGGREGATE_DISTANCE_DELTA);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = zzawC;
    localDataType = zzawv;
    localObject2 = Collections.singletonList(zzawz);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = zzawC;
    localDataType = TYPE_LOCATION_SAMPLE;
    localObject2 = Collections.singletonList(AGGREGATE_LOCATION_BOUNDING_BOX);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = zzawC;
    localDataType = TYPE_NUTRITION;
    localObject2 = Collections.singletonList(AGGREGATE_NUTRITION_SUMMARY);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = zzawC;
    localDataType = TYPE_POWER_SAMPLE;
    localObject2 = Collections.singletonList(AGGREGATE_POWER_SUMMARY);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = zzawC;
    localDataType = TYPE_HEART_RATE_BPM;
    localObject2 = Collections.singletonList(AGGREGATE_HEART_RATE_SUMMARY);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = zzawC;
    localDataType = TYPE_SPEED;
    localObject2 = Collections.singletonList(AGGREGATE_SPEED_SUMMARY);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = zzawC;
    localDataType = TYPE_STEP_COUNT_DELTA;
    localObject2 = Collections.singletonList(AGGREGATE_STEP_COUNT_DELTA);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = zzawC;
    localDataType = TYPE_WEIGHT;
    localObject2 = Collections.singletonList(AGGREGATE_WEIGHT_SUMMARY);
    ((Map)localObject1).put(localDataType, localObject2);
    localObject1 = new DataType[40];
    localDataType = zzaww;
    localObject1[0] = localDataType;
    localDataType = TYPE_WORKOUT_EXERCISE;
    localObject1[m] = localDataType;
    localDataType = TYPE_ACTIVITY_SAMPLE;
    localObject1[k] = localDataType;
    localDataType = TYPE_ACTIVITY_SEGMENT;
    localObject1[j] = localDataType;
    localDataType = AGGREGATE_ACTIVITY_SUMMARY;
    localObject1[i] = localDataType;
    localObject2 = TYPE_BODY_FAT_PERCENTAGE;
    localObject1[5] = localObject2;
    localObject2 = AGGREGATE_BODY_FAT_PERCENTAGE_SUMMARY;
    localObject1[6] = localObject2;
    localObject2 = zzawy;
    localObject1[7] = localObject2;
    localObject2 = zzawA;
    localObject1[8] = localObject2;
    localObject2 = zzawx;
    localObject1[9] = localObject2;
    localObject2 = zzawB;
    localObject1[10] = localObject2;
    localObject2 = TYPE_BASAL_METABOLIC_RATE;
    localObject1[11] = localObject2;
    localObject2 = AGGREGATE_BASAL_METABOLIC_RATE_SUMMARY;
    localObject1[12] = localObject2;
    localObject2 = TYPE_CALORIES_CONSUMED;
    localObject1[13] = localObject2;
    localObject2 = TYPE_CALORIES_EXPENDED;
    localObject1[14] = localObject2;
    localObject2 = TYPE_CYCLING_PEDALING_CADENCE;
    localObject1[15] = localObject2;
    localObject2 = TYPE_CYCLING_PEDALING_CUMULATIVE;
    localObject1[16] = localObject2;
    localObject2 = TYPE_CYCLING_WHEEL_REVOLUTION;
    localObject1[17] = localObject2;
    localObject2 = TYPE_CYCLING_WHEEL_RPM;
    localObject1[18] = localObject2;
    localObject2 = TYPE_DISTANCE_CUMULATIVE;
    localObject1[19] = localObject2;
    localObject2 = TYPE_DISTANCE_DELTA;
    localObject1[20] = localObject2;
    localObject2 = zzawv;
    localObject1[21] = localObject2;
    localObject2 = zzawz;
    localObject1[22] = localObject2;
    localObject2 = TYPE_HEART_RATE_BPM;
    localObject1[23] = localObject2;
    localObject2 = AGGREGATE_HEART_RATE_SUMMARY;
    localObject1[24] = localObject2;
    localObject2 = TYPE_HEIGHT;
    localObject1[25] = localObject2;
    localObject2 = AGGREGATE_LOCATION_BOUNDING_BOX;
    localObject1[26] = localObject2;
    localObject2 = TYPE_LOCATION_SAMPLE;
    localObject1[27] = localObject2;
    localObject2 = TYPE_LOCATION_TRACK;
    localObject1[28] = localObject2;
    localObject2 = TYPE_NUTRITION;
    localObject1[29] = localObject2;
    localObject2 = AGGREGATE_NUTRITION_SUMMARY;
    localObject1[30] = localObject2;
    localObject2 = TYPE_POWER_SAMPLE;
    localObject1[31] = localObject2;
    localObject2 = AGGREGATE_POWER_SUMMARY;
    localObject1[32] = localObject2;
    localObject2 = TYPE_SPEED;
    localObject1[33] = localObject2;
    localObject2 = AGGREGATE_SPEED_SUMMARY;
    localObject1[34] = localObject2;
    localObject2 = TYPE_STEP_COUNT_CADENCE;
    localObject1[35] = localObject2;
    localObject2 = TYPE_STEP_COUNT_CUMULATIVE;
    localObject1[36] = localObject2;
    localObject2 = TYPE_STEP_COUNT_DELTA;
    localObject1[37] = localObject2;
    localObject2 = TYPE_WEIGHT;
    localObject1[38] = localObject2;
    localObject2 = AGGREGATE_WEIGHT_SUMMARY;
    localObject1[39] = localObject2;
    zzawD = (DataType[])localObject1;
    localObject1 = new com/google/android/gms/fitness/data/zzg;
    ((zzg)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  DataType(int paramInt, String paramString, List paramList)
  {
    this.mVersionCode = paramInt;
    this.mName = paramString;
    List localList = Collections.unmodifiableList(paramList);
    this.zzawE = localList;
  }
  
  public DataType(String paramString, Field... paramVarArgs)
  {
    this(1, paramString, localArrayList);
  }
  
  public static List getAggregatesForInput(DataType paramDataType)
  {
    List localList = (List)zzawC.get(paramDataType);
    if (localList == null) {}
    for (localList = Collections.emptyList();; localList = Collections.unmodifiableList(localList)) {
      return localList;
    }
  }
  
  public static String getMimeType(DataType paramDataType)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("vnd.google.fitness.data_type/");
    String str = paramDataType.getName();
    return str;
  }
  
  private boolean zza(DataType paramDataType)
  {
    Object localObject1 = this.mName;
    Object localObject2 = paramDataType.mName;
    boolean bool = ((String)localObject1).equals(localObject2);
    if (bool)
    {
      localObject1 = this.zzawE;
      localObject2 = paramDataType.zzawE;
      bool = ((List)localObject1).equals(localObject2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      bool = paramObject instanceof DataType;
      if (!bool) {
        break label33;
      }
      paramObject = (DataType)paramObject;
      bool = zza((DataType)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public List getFields()
  {
    return this.zzawE;
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
  
  public int indexOf(Field paramField)
  {
    Object localObject = this.zzawE;
    int i = ((List)localObject).indexOf(paramField);
    if (i < 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramField;
      arrayOfObject[1] = this;
      String str = String.format("%s not a field of %s", arrayOfObject);
      ((IllegalArgumentException)localObject).<init>(str);
      throw ((Throwable)localObject);
    }
    return i;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.mName;
    arrayOfObject[0] = localObject;
    localObject = this.zzawE;
    arrayOfObject[1] = localObject;
    return String.format("DataType{%s%s}", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
  
  public String zzuo()
  {
    String str1 = this.mName;
    String str2 = "com.google.";
    boolean bool = str1.startsWith(str2);
    int i;
    if (bool)
    {
      str1 = this.mName;
      i = 11;
    }
    for (str1 = str1.substring(i);; str1 = this.mName) {
      return str1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\DataType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */