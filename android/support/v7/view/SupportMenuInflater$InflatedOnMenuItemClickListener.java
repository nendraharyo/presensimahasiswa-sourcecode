package android.support.v7.view;

import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

class SupportMenuInflater$InflatedOnMenuItemClickListener
  implements MenuItem.OnMenuItemClickListener
{
  private static final Class[] PARAM_TYPES;
  private Method mMethod;
  private Object mRealOwner;
  
  static
  {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = MenuItem.class;
    PARAM_TYPES = arrayOfClass;
  }
  
  public SupportMenuInflater$InflatedOnMenuItemClickListener(Object paramObject, String paramString)
  {
    this.mRealOwner = paramObject;
    Object localObject1 = paramObject.getClass();
    try
    {
      Object localObject2 = PARAM_TYPES;
      localObject2 = ((Class)localObject1).getMethod(paramString, (Class[])localObject2);
      this.mMethod = ((Method)localObject2);
      return;
    }
    catch (Exception localException)
    {
      InflateException localInflateException = new android/view/InflateException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder = localStringBuilder.append("Couldn't resolve menu item onClick handler ").append(paramString).append(" in class ");
      localObject1 = ((Class)localObject1).getName();
      localObject1 = (String)localObject1;
      localInflateException.<init>((String)localObject1);
      localInflateException.initCause(localException);
      throw localInflateException;
    }
  }
  
  /* Error */
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 35	android/support/v7/view/SupportMenuInflater$InflatedOnMenuItemClickListener:mMethod	Ljava/lang/reflect/Method;
    //   6: astore_3
    //   7: aload_3
    //   8: invokevirtual 69	java/lang/reflect/Method:getReturnType	()Ljava/lang/Class;
    //   11: astore_3
    //   12: getstatic 75	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   15: astore 4
    //   17: aload_3
    //   18: aload 4
    //   20: if_acmpne +60 -> 80
    //   23: aload_0
    //   24: getfield 35	android/support/v7/view/SupportMenuInflater$InflatedOnMenuItemClickListener:mMethod	Ljava/lang/reflect/Method;
    //   27: astore 5
    //   29: aload_0
    //   30: getfield 25	android/support/v7/view/SupportMenuInflater$InflatedOnMenuItemClickListener:mRealOwner	Ljava/lang/Object;
    //   33: astore_3
    //   34: iconst_1
    //   35: istore 6
    //   37: iload 6
    //   39: anewarray 4	java/lang/Object
    //   42: astore 4
    //   44: iconst_0
    //   45: istore 7
    //   47: aconst_null
    //   48: astore 8
    //   50: aload 4
    //   52: iconst_0
    //   53: aload_1
    //   54: aastore
    //   55: aload 5
    //   57: aload_3
    //   58: aload 4
    //   60: invokevirtual 79	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   63: astore 5
    //   65: aload 5
    //   67: checkcast 71	java/lang/Boolean
    //   70: astore 5
    //   72: aload 5
    //   74: invokevirtual 83	java/lang/Boolean:booleanValue	()Z
    //   77: istore_2
    //   78: iload_2
    //   79: ireturn
    //   80: aload_0
    //   81: getfield 35	android/support/v7/view/SupportMenuInflater$InflatedOnMenuItemClickListener:mMethod	Ljava/lang/reflect/Method;
    //   84: astore_3
    //   85: aload_0
    //   86: getfield 25	android/support/v7/view/SupportMenuInflater$InflatedOnMenuItemClickListener:mRealOwner	Ljava/lang/Object;
    //   89: astore 4
    //   91: iconst_1
    //   92: istore 7
    //   94: iload 7
    //   96: anewarray 4	java/lang/Object
    //   99: astore 8
    //   101: aload 8
    //   103: iconst_0
    //   104: aload_1
    //   105: aastore
    //   106: aload_3
    //   107: aload 4
    //   109: aload 8
    //   111: invokevirtual 79	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   114: pop
    //   115: goto -37 -> 78
    //   118: astore 5
    //   120: new 85	java/lang/RuntimeException
    //   123: astore_3
    //   124: aload_3
    //   125: aload 5
    //   127: invokespecial 88	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   130: aload_3
    //   131: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	this	InflatedOnMenuItemClickListener
    //   0	132	1	paramMenuItem	MenuItem
    //   1	78	2	bool	boolean
    //   6	125	3	localObject1	Object
    //   15	93	4	localObject2	Object
    //   27	46	5	localObject3	Object
    //   118	8	5	localException	Exception
    //   35	3	6	i	int
    //   45	50	7	j	int
    //   48	62	8	arrayOfObject	Object[]
    // Exception table:
    //   from	to	target	type
    //   2	6	118	java/lang/Exception
    //   7	11	118	java/lang/Exception
    //   12	15	118	java/lang/Exception
    //   23	27	118	java/lang/Exception
    //   29	33	118	java/lang/Exception
    //   37	42	118	java/lang/Exception
    //   53	55	118	java/lang/Exception
    //   58	63	118	java/lang/Exception
    //   65	70	118	java/lang/Exception
    //   72	77	118	java/lang/Exception
    //   80	84	118	java/lang/Exception
    //   85	89	118	java/lang/Exception
    //   94	99	118	java/lang/Exception
    //   104	106	118	java/lang/Exception
    //   109	115	118	java/lang/Exception
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\SupportMenuInflater$InflatedOnMenuItemClickListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */