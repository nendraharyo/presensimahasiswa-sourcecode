package com.crashlytics.android.answers;

import java.math.BigDecimal;
import java.util.Currency;

public class PurchaseEvent
  extends PredefinedEvent
{
  static final String CURRENCY_ATTRIBUTE = "currency";
  static final String ITEM_ID_ATTRIBUTE = "itemId";
  static final String ITEM_NAME_ATTRIBUTE = "itemName";
  static final String ITEM_PRICE_ATTRIBUTE = "itemPrice";
  static final String ITEM_TYPE_ATTRIBUTE = "itemType";
  static final BigDecimal MICRO_CONSTANT = BigDecimal.valueOf(1000000L);
  static final String SUCCESS_ATTRIBUTE = "success";
  static final String TYPE = "purchase";
  
  String getPredefinedType()
  {
    return "purchase";
  }
  
  long priceToMicros(BigDecimal paramBigDecimal)
  {
    return MICRO_CONSTANT.multiply(paramBigDecimal).longValue();
  }
  
  public PurchaseEvent putCurrency(Currency paramCurrency)
  {
    Object localObject = this.validator;
    String str1 = "currency";
    boolean bool = ((AnswersEventValidator)localObject).isNull(paramCurrency, str1);
    if (!bool)
    {
      localObject = this.predefinedAttributes;
      str1 = "currency";
      String str2 = paramCurrency.getCurrencyCode();
      ((AnswersAttributes)localObject).put(str1, str2);
    }
    return this;
  }
  
  public PurchaseEvent putItemId(String paramString)
  {
    this.predefinedAttributes.put("itemId", paramString);
    return this;
  }
  
  public PurchaseEvent putItemName(String paramString)
  {
    this.predefinedAttributes.put("itemName", paramString);
    return this;
  }
  
  public PurchaseEvent putItemPrice(BigDecimal paramBigDecimal)
  {
    Object localObject = this.validator;
    String str = "itemPrice";
    boolean bool = ((AnswersEventValidator)localObject).isNull(paramBigDecimal, str);
    if (!bool)
    {
      localObject = this.predefinedAttributes;
      str = "itemPrice";
      long l = priceToMicros(paramBigDecimal);
      Long localLong = Long.valueOf(l);
      ((AnswersAttributes)localObject).put(str, localLong);
    }
    return this;
  }
  
  public PurchaseEvent putItemType(String paramString)
  {
    this.predefinedAttributes.put("itemType", paramString);
    return this;
  }
  
  public PurchaseEvent putSuccess(boolean paramBoolean)
  {
    AnswersAttributes localAnswersAttributes = this.predefinedAttributes;
    String str = Boolean.toString(paramBoolean);
    localAnswersAttributes.put("success", str);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\PurchaseEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */