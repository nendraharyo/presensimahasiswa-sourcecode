package com.crashlytics.android.answers;

import java.math.BigDecimal;
import java.util.Currency;

public class StartCheckoutEvent
  extends PredefinedEvent
{
  static final String CURRENCY_ATTRIBUTE = "currency";
  static final String ITEM_COUNT_ATTRIBUTE = "itemCount";
  static final BigDecimal MICRO_CONSTANT = BigDecimal.valueOf(1000000L);
  static final String TOTAL_PRICE_ATTRIBUTE = "totalPrice";
  static final String TYPE = "startCheckout";
  
  String getPredefinedType()
  {
    return "startCheckout";
  }
  
  long priceToMicros(BigDecimal paramBigDecimal)
  {
    return MICRO_CONSTANT.multiply(paramBigDecimal).longValue();
  }
  
  public StartCheckoutEvent putCurrency(Currency paramCurrency)
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
  
  public StartCheckoutEvent putItemCount(int paramInt)
  {
    AnswersAttributes localAnswersAttributes = this.predefinedAttributes;
    Integer localInteger = Integer.valueOf(paramInt);
    localAnswersAttributes.put("itemCount", localInteger);
    return this;
  }
  
  public StartCheckoutEvent putTotalPrice(BigDecimal paramBigDecimal)
  {
    Object localObject = this.validator;
    String str = "totalPrice";
    boolean bool = ((AnswersEventValidator)localObject).isNull(paramBigDecimal, str);
    if (!bool)
    {
      localObject = this.predefinedAttributes;
      str = "totalPrice";
      long l = priceToMicros(paramBigDecimal);
      Long localLong = Long.valueOf(l);
      ((AnswersAttributes)localObject).put(str, localLong);
    }
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\StartCheckoutEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */