package com.crashlytics.android.answers;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

class AnswersAttributes
{
  final Map attributes;
  final AnswersEventValidator validator;
  
  public AnswersAttributes(AnswersEventValidator paramAnswersEventValidator)
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.attributes = localConcurrentHashMap;
    this.validator = paramAnswersEventValidator;
  }
  
  void put(String paramString, Number paramNumber)
  {
    Object localObject = this.validator;
    String str = "key";
    boolean bool = ((AnswersEventValidator)localObject).isNull(paramString, str);
    if (!bool)
    {
      localObject = this.validator;
      str = "value";
      bool = ((AnswersEventValidator)localObject).isNull(paramNumber, str);
      if (!bool) {
        break label47;
      }
    }
    for (;;)
    {
      return;
      label47:
      localObject = this.validator.limitStringLength(paramString);
      putAttribute((String)localObject, paramNumber);
    }
  }
  
  void put(String paramString1, String paramString2)
  {
    Object localObject = this.validator;
    String str = "key";
    boolean bool = ((AnswersEventValidator)localObject).isNull(paramString1, str);
    if (!bool)
    {
      localObject = this.validator;
      str = "value";
      bool = ((AnswersEventValidator)localObject).isNull(paramString2, str);
      if (!bool) {
        break label47;
      }
    }
    for (;;)
    {
      return;
      label47:
      localObject = this.validator.limitStringLength(paramString1);
      str = this.validator.limitStringLength(paramString2);
      putAttribute((String)localObject, str);
    }
  }
  
  void putAttribute(String paramString, Object paramObject)
  {
    Object localObject = this.validator;
    Map localMap = this.attributes;
    boolean bool = ((AnswersEventValidator)localObject).isFullMap(localMap, paramString);
    if (!bool)
    {
      localObject = this.attributes;
      ((Map)localObject).put(paramString, paramObject);
    }
  }
  
  public String toString()
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    Map localMap = this.attributes;
    localJSONObject.<init>(localMap);
    return localJSONObject.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\AnswersAttributes.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */