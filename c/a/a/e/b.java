package c.a.a.e;

import android.graphics.Matrix;

public class b
{
  public static Matrix a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>();
    a(localMatrix, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
    return localMatrix;
  }
  
  public static Matrix a(float[] paramArrayOfFloat)
  {
    float f1 = paramArrayOfFloat[0];
    float f2 = paramArrayOfFloat[1];
    float f3 = paramArrayOfFloat[2];
    float f4 = paramArrayOfFloat[3];
    float f5 = paramArrayOfFloat[4];
    float f6 = paramArrayOfFloat[5];
    return a(f1, f2, f3, f4, f5, f6);
  }
  
  public static void a(Matrix paramMatrix, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    float[] arrayOfFloat = new float[9];
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat3;
    arrayOfFloat[2] = paramFloat5;
    arrayOfFloat[3] = paramFloat2;
    arrayOfFloat[4] = paramFloat4;
    arrayOfFloat[5] = paramFloat6;
    arrayOfFloat[6] = 0.0F;
    arrayOfFloat[7] = 0.0F;
    arrayOfFloat[8] = 1.0F;
    paramMatrix.setValues(arrayOfFloat);
  }
  
  public static void a(Matrix paramMatrix, float[] paramArrayOfFloat)
  {
    float f1 = paramArrayOfFloat[0];
    float f2 = paramArrayOfFloat[1];
    float f3 = paramArrayOfFloat[2];
    float f4 = paramArrayOfFloat[3];
    float f5 = paramArrayOfFloat[4];
    float f6 = paramArrayOfFloat[5];
    a(paramMatrix, f1, f2, f3, f4, f5, f6);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\c\a\a\e\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */