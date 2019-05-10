package android.support.v4.g;

class c$a
  implements c.c
{
  static final a a;
  static final a b;
  private final boolean c;
  
  static
  {
    a locala = new android/support/v4/g/c$a;
    locala.<init>(true);
    a = locala;
    locala = new android/support/v4/g/c$a;
    locala.<init>(false);
    b = locala;
  }
  
  private c$a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public int a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = paramInt1 + paramInt2;
    boolean bool = false;
    for (;;)
    {
      if (paramInt1 < j)
      {
        int k = c.a(Character.getDirectionality(paramCharSequence.charAt(paramInt1)));
        switch (k)
        {
        default: 
          paramInt1 += 1;
          break;
        case 0: 
          bool = this.c;
          if (bool) {
            i = 0;
          }
          break;
        }
      }
    }
    for (;;)
    {
      return i;
      bool = i;
      break;
      bool = this.c;
      if (bool)
      {
        bool = i;
        break;
        if (bool)
        {
          bool = this.c;
          if (!bool) {
            i = 0;
          }
        }
        else
        {
          i = 2;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\g\c$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */