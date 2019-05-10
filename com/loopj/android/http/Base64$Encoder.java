package com.loopj.android.http;

class Base64$Encoder
  extends Base64.Coder
{
  private static final byte[] ENCODE;
  private static final byte[] ENCODE_WEBSAFE;
  public static final int LINE_GROUPS = 19;
  private final byte[] alphabet;
  private int count;
  public final boolean do_cr;
  public final boolean do_newline;
  public final boolean do_padding;
  private final byte[] tail;
  int tailLen;
  
  static
  {
    int i = 64;
    byte[] arrayOfByte = new byte[i];
    byte[] tmp8_7 = arrayOfByte;
    byte[] tmp9_8 = tmp8_7;
    byte[] tmp9_8 = tmp8_7;
    tmp9_8[0] = 65;
    tmp9_8[1] = 66;
    byte[] tmp18_9 = tmp9_8;
    byte[] tmp18_9 = tmp9_8;
    tmp18_9[2] = 67;
    tmp18_9[3] = 68;
    byte[] tmp27_18 = tmp18_9;
    byte[] tmp27_18 = tmp18_9;
    tmp27_18[4] = 69;
    tmp27_18[5] = 70;
    byte[] tmp36_27 = tmp27_18;
    byte[] tmp36_27 = tmp27_18;
    tmp36_27[6] = 71;
    tmp36_27[7] = 72;
    byte[] tmp47_36 = tmp36_27;
    byte[] tmp47_36 = tmp36_27;
    tmp47_36[8] = 73;
    tmp47_36[9] = 74;
    byte[] tmp58_47 = tmp47_36;
    byte[] tmp58_47 = tmp47_36;
    tmp58_47[10] = 75;
    tmp58_47[11] = 76;
    byte[] tmp69_58 = tmp58_47;
    byte[] tmp69_58 = tmp58_47;
    tmp69_58[12] = 77;
    tmp69_58[13] = 78;
    byte[] tmp80_69 = tmp69_58;
    byte[] tmp80_69 = tmp69_58;
    tmp80_69[14] = 79;
    tmp80_69[15] = 80;
    byte[] tmp91_80 = tmp80_69;
    byte[] tmp91_80 = tmp80_69;
    tmp91_80[16] = 81;
    tmp91_80[17] = 82;
    byte[] tmp102_91 = tmp91_80;
    byte[] tmp102_91 = tmp91_80;
    tmp102_91[18] = 83;
    tmp102_91[19] = 84;
    byte[] tmp113_102 = tmp102_91;
    byte[] tmp113_102 = tmp102_91;
    tmp113_102[20] = 85;
    tmp113_102[21] = 86;
    byte[] tmp124_113 = tmp113_102;
    byte[] tmp124_113 = tmp113_102;
    tmp124_113[22] = 87;
    tmp124_113[23] = 88;
    byte[] tmp135_124 = tmp124_113;
    byte[] tmp135_124 = tmp124_113;
    tmp135_124[24] = 89;
    tmp135_124[25] = 90;
    byte[] tmp146_135 = tmp135_124;
    byte[] tmp146_135 = tmp135_124;
    tmp146_135[26] = 97;
    tmp146_135[27] = 98;
    byte[] tmp157_146 = tmp146_135;
    byte[] tmp157_146 = tmp146_135;
    tmp157_146[28] = 99;
    tmp157_146[29] = 100;
    byte[] tmp168_157 = tmp157_146;
    byte[] tmp168_157 = tmp157_146;
    tmp168_157[30] = 101;
    tmp168_157[31] = 102;
    byte[] tmp179_168 = tmp168_157;
    byte[] tmp179_168 = tmp168_157;
    tmp179_168[32] = 103;
    tmp179_168[33] = 104;
    byte[] tmp190_179 = tmp179_168;
    byte[] tmp190_179 = tmp179_168;
    tmp190_179[34] = 105;
    tmp190_179[35] = 106;
    byte[] tmp201_190 = tmp190_179;
    byte[] tmp201_190 = tmp190_179;
    tmp201_190[36] = 107;
    tmp201_190[37] = 108;
    byte[] tmp212_201 = tmp201_190;
    byte[] tmp212_201 = tmp201_190;
    tmp212_201[38] = 109;
    tmp212_201[39] = 110;
    byte[] tmp223_212 = tmp212_201;
    byte[] tmp223_212 = tmp212_201;
    tmp223_212[40] = 111;
    tmp223_212[41] = 112;
    byte[] tmp234_223 = tmp223_212;
    byte[] tmp234_223 = tmp223_212;
    tmp234_223[42] = 113;
    tmp234_223[43] = 114;
    byte[] tmp245_234 = tmp234_223;
    byte[] tmp245_234 = tmp234_223;
    tmp245_234[44] = 115;
    tmp245_234[45] = 116;
    byte[] tmp256_245 = tmp245_234;
    byte[] tmp256_245 = tmp245_234;
    tmp256_245[46] = 117;
    tmp256_245[47] = 118;
    byte[] tmp267_256 = tmp256_245;
    byte[] tmp267_256 = tmp256_245;
    tmp267_256[48] = 119;
    tmp267_256[49] = 120;
    byte[] tmp278_267 = tmp267_256;
    byte[] tmp278_267 = tmp267_256;
    tmp278_267[50] = 121;
    tmp278_267[51] = 122;
    byte[] tmp289_278 = tmp278_267;
    byte[] tmp289_278 = tmp278_267;
    tmp289_278[52] = 48;
    tmp289_278[53] = 49;
    byte[] tmp300_289 = tmp289_278;
    byte[] tmp300_289 = tmp289_278;
    tmp300_289[54] = 50;
    tmp300_289[55] = 51;
    byte[] tmp311_300 = tmp300_289;
    byte[] tmp311_300 = tmp300_289;
    tmp311_300[56] = 52;
    tmp311_300[57] = 53;
    byte[] tmp322_311 = tmp311_300;
    byte[] tmp322_311 = tmp311_300;
    tmp322_311[58] = 54;
    tmp322_311[59] = 55;
    byte[] tmp333_322 = tmp322_311;
    byte[] tmp333_322 = tmp322_311;
    tmp333_322[60] = 56;
    tmp333_322[61] = 57;
    tmp333_322[62] = 43;
    tmp333_322[63] = 47;
    ENCODE = arrayOfByte;
    arrayOfByte = new byte[i];
    byte[] tmp363_362 = arrayOfByte;
    byte[] tmp364_363 = tmp363_362;
    byte[] tmp364_363 = tmp363_362;
    tmp364_363[0] = 65;
    tmp364_363[1] = 66;
    byte[] tmp373_364 = tmp364_363;
    byte[] tmp373_364 = tmp364_363;
    tmp373_364[2] = 67;
    tmp373_364[3] = 68;
    byte[] tmp382_373 = tmp373_364;
    byte[] tmp382_373 = tmp373_364;
    tmp382_373[4] = 69;
    tmp382_373[5] = 70;
    byte[] tmp391_382 = tmp382_373;
    byte[] tmp391_382 = tmp382_373;
    tmp391_382[6] = 71;
    tmp391_382[7] = 72;
    byte[] tmp402_391 = tmp391_382;
    byte[] tmp402_391 = tmp391_382;
    tmp402_391[8] = 73;
    tmp402_391[9] = 74;
    byte[] tmp413_402 = tmp402_391;
    byte[] tmp413_402 = tmp402_391;
    tmp413_402[10] = 75;
    tmp413_402[11] = 76;
    byte[] tmp424_413 = tmp413_402;
    byte[] tmp424_413 = tmp413_402;
    tmp424_413[12] = 77;
    tmp424_413[13] = 78;
    byte[] tmp435_424 = tmp424_413;
    byte[] tmp435_424 = tmp424_413;
    tmp435_424[14] = 79;
    tmp435_424[15] = 80;
    byte[] tmp446_435 = tmp435_424;
    byte[] tmp446_435 = tmp435_424;
    tmp446_435[16] = 81;
    tmp446_435[17] = 82;
    byte[] tmp457_446 = tmp446_435;
    byte[] tmp457_446 = tmp446_435;
    tmp457_446[18] = 83;
    tmp457_446[19] = 84;
    byte[] tmp468_457 = tmp457_446;
    byte[] tmp468_457 = tmp457_446;
    tmp468_457[20] = 85;
    tmp468_457[21] = 86;
    byte[] tmp479_468 = tmp468_457;
    byte[] tmp479_468 = tmp468_457;
    tmp479_468[22] = 87;
    tmp479_468[23] = 88;
    byte[] tmp490_479 = tmp479_468;
    byte[] tmp490_479 = tmp479_468;
    tmp490_479[24] = 89;
    tmp490_479[25] = 90;
    byte[] tmp501_490 = tmp490_479;
    byte[] tmp501_490 = tmp490_479;
    tmp501_490[26] = 97;
    tmp501_490[27] = 98;
    byte[] tmp512_501 = tmp501_490;
    byte[] tmp512_501 = tmp501_490;
    tmp512_501[28] = 99;
    tmp512_501[29] = 100;
    byte[] tmp523_512 = tmp512_501;
    byte[] tmp523_512 = tmp512_501;
    tmp523_512[30] = 101;
    tmp523_512[31] = 102;
    byte[] tmp534_523 = tmp523_512;
    byte[] tmp534_523 = tmp523_512;
    tmp534_523[32] = 103;
    tmp534_523[33] = 104;
    byte[] tmp545_534 = tmp534_523;
    byte[] tmp545_534 = tmp534_523;
    tmp545_534[34] = 105;
    tmp545_534[35] = 106;
    byte[] tmp556_545 = tmp545_534;
    byte[] tmp556_545 = tmp545_534;
    tmp556_545[36] = 107;
    tmp556_545[37] = 108;
    byte[] tmp567_556 = tmp556_545;
    byte[] tmp567_556 = tmp556_545;
    tmp567_556[38] = 109;
    tmp567_556[39] = 110;
    byte[] tmp578_567 = tmp567_556;
    byte[] tmp578_567 = tmp567_556;
    tmp578_567[40] = 111;
    tmp578_567[41] = 112;
    byte[] tmp589_578 = tmp578_567;
    byte[] tmp589_578 = tmp578_567;
    tmp589_578[42] = 113;
    tmp589_578[43] = 114;
    byte[] tmp600_589 = tmp589_578;
    byte[] tmp600_589 = tmp589_578;
    tmp600_589[44] = 115;
    tmp600_589[45] = 116;
    byte[] tmp611_600 = tmp600_589;
    byte[] tmp611_600 = tmp600_589;
    tmp611_600[46] = 117;
    tmp611_600[47] = 118;
    byte[] tmp622_611 = tmp611_600;
    byte[] tmp622_611 = tmp611_600;
    tmp622_611[48] = 119;
    tmp622_611[49] = 120;
    byte[] tmp633_622 = tmp622_611;
    byte[] tmp633_622 = tmp622_611;
    tmp633_622[50] = 121;
    tmp633_622[51] = 122;
    byte[] tmp644_633 = tmp633_622;
    byte[] tmp644_633 = tmp633_622;
    tmp644_633[52] = 48;
    tmp644_633[53] = 49;
    byte[] tmp655_644 = tmp644_633;
    byte[] tmp655_644 = tmp644_633;
    tmp655_644[54] = 50;
    tmp655_644[55] = 51;
    byte[] tmp666_655 = tmp655_644;
    byte[] tmp666_655 = tmp655_644;
    tmp666_655[56] = 52;
    tmp666_655[57] = 53;
    byte[] tmp677_666 = tmp666_655;
    byte[] tmp677_666 = tmp666_655;
    tmp677_666[58] = 54;
    tmp677_666[59] = 55;
    byte[] tmp688_677 = tmp677_666;
    byte[] tmp688_677 = tmp677_666;
    tmp688_677[60] = 56;
    tmp688_677[61] = 57;
    tmp688_677[62] = 45;
    tmp688_677[63] = 95;
    ENCODE_WEBSAFE = arrayOfByte;
  }
  
  public Base64$Encoder(int paramInt, byte[] paramArrayOfByte)
  {
    this.output = paramArrayOfByte;
    int j = paramInt & 0x1;
    label43:
    label59:
    byte[] arrayOfByte;
    if (j == 0)
    {
      j = i;
      this.do_padding = j;
      j = paramInt & 0x2;
      if (j != 0) {
        break label133;
      }
      j = i;
      this.do_newline = j;
      j = paramInt & 0x4;
      if (j == 0) {
        break label142;
      }
      this.do_cr = i;
      j = paramInt & 0x8;
      if (j != 0) {
        break label147;
      }
      arrayOfByte = ENCODE;
      label80:
      this.alphabet = arrayOfByte;
      arrayOfByte = new byte[2];
      this.tail = arrayOfByte;
      this.tailLen = 0;
      boolean bool = this.do_newline;
      if (!bool) {
        break label155;
      }
    }
    label133:
    label142:
    label147:
    label155:
    for (int k = 19;; k = -1)
    {
      this.count = k;
      return;
      k = 0;
      arrayOfByte = null;
      break;
      k = 0;
      arrayOfByte = null;
      break label43;
      i = 0;
      break label59;
      arrayOfByte = ENCODE_WEBSAFE;
      break label80;
    }
  }
  
  public int maxOutputSize(int paramInt)
  {
    return paramInt * 8 / 5 + 10;
  }
  
  public boolean process(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    byte[] arrayOfByte1 = this.alphabet;
    byte[] arrayOfByte2 = this.output;
    int i = 0;
    float f = 0.0F;
    int n = this.count;
    int i6 = paramInt2 + paramInt1;
    int i7 = -1;
    int i8 = this.tailLen;
    label71:
    int i9;
    int i10;
    int i1;
    switch (i8)
    {
    default: 
      i8 = paramInt1;
      i9 = -1;
      if (i7 != i9)
      {
        i10 = i7 >> 18 & 0x3F;
        i10 = arrayOfByte1[i10];
        arrayOfByte2[0] = i10;
        i10 = i7 >> 12 & 0x3F;
        i10 = arrayOfByte1[i10];
        arrayOfByte2[1] = i10;
        i9 = 3;
        i10 = i7 >> 6 & 0x3F;
        i10 = arrayOfByte1[i10];
        arrayOfByte2[2] = i10;
        i = 4;
        f = 5.6E-45F;
        i7 &= 0x3F;
        i7 = arrayOfByte1[i7];
        arrayOfByte2[i9] = i7;
        n += -1;
        if (n == 0)
        {
          boolean bool4 = this.do_cr;
          if (!bool4) {
            break label1634;
          }
          i1 = 5;
          i7 = 13;
          arrayOfByte2[i] = i7;
        }
      }
      break;
    }
    for (;;)
    {
      i = i1 + 1;
      i7 = 10;
      arrayOfByte2[i1] = i7;
      i1 = 19;
      i10 = i1;
      i9 = i;
      label246:
      label1070:
      label1115:
      int m;
      for (;;)
      {
        i1 = i8 + 3;
        int i2;
        if (i1 <= i6)
        {
          i1 = (paramArrayOfByte[i8] & 0xFF) << 16;
          i = i8 + 1;
          i = (paramArrayOfByte[i] & 0xFF) << 8;
          i1 |= i;
          i = i8 + 2;
          i = paramArrayOfByte[i] & 0xFF;
          i1 |= i;
          i = i1 >> 18 & 0x3F;
          i = arrayOfByte1[i];
          arrayOfByte2[i9] = i;
          i = i9 + 1;
          i7 = i1 >> 12 & 0x3F;
          i7 = arrayOfByte1[i7];
          arrayOfByte2[i] = i7;
          i = i9 + 2;
          i7 = i1 >> 6 & 0x3F;
          i7 = arrayOfByte1[i7];
          arrayOfByte2[i] = i7;
          i = i9 + 3;
          i1 &= 0x3F;
          i1 = arrayOfByte1[i1];
          arrayOfByte2[i] = i1;
          i8 += 3;
          i = i9 + 4;
          i1 = i10 + -1;
          if (i1 != 0) {
            break label1623;
          }
          boolean bool5 = this.do_cr;
          if (!bool5) {
            break label1616;
          }
          i2 = i + 1;
          i7 = 13;
          arrayOfByte2[i] = i7;
        }
        for (;;)
        {
          i = i2 + 1;
          i7 = 10;
          arrayOfByte2[i2] = i7;
          i2 = 19;
          i10 = i2;
          i9 = i;
          break label246;
          i8 = paramInt1;
          break label71;
          i8 = paramInt1 + 2;
          if (i8 > i6) {
            break;
          }
          byte[] arrayOfByte3 = this.tail;
          i7 = (arrayOfByte3[0] & 0xFF) << 16;
          i8 = paramInt1 + 1;
          i9 = (paramArrayOfByte[paramInt1] & 0xFF) << 8;
          i7 |= i9;
          paramInt1 = i8 + 1;
          i8 = paramArrayOfByte[i8] & 0xFF;
          i7 |= i8;
          byte[] arrayOfByte4 = null;
          this.tailLen = 0;
          i8 = paramInt1;
          break label71;
          i8 = paramInt1 + 1;
          if (i8 > i6) {
            break;
          }
          arrayOfByte3 = this.tail;
          i7 = (arrayOfByte3[0] & 0xFF) << 16;
          arrayOfByte4 = this.tail;
          i8 = (arrayOfByte4[1] & 0xFF) << 8;
          i7 |= i8;
          i8 = paramInt1 + 1;
          i9 = paramArrayOfByte[paramInt1] & 0xFF;
          i7 |= i9;
          i9 = 0;
          this.tailLen = 0;
          break label71;
          byte[] arrayOfByte5;
          int i3;
          if (paramBoolean)
          {
            i2 = this.tailLen;
            i2 = i8 - i2;
            i = i6 + -1;
            if (i2 == i)
            {
              i7 = 0;
              arrayOfByte3 = null;
              i2 = this.tailLen;
              if (i2 > 0)
              {
                arrayOfByte5 = this.tail;
                i = 1;
                f = Float.MIN_VALUE;
                i2 = arrayOfByte5[0];
              }
              for (;;)
              {
                i7 = (i2 & 0xFF) << 4;
                i2 = this.tailLen - i;
                this.tailLen = i2;
                i = i9 + 1;
                i2 = i7 >> 6 & 0x3F;
                i2 = arrayOfByte1[i2];
                arrayOfByte2[i9] = i2;
                i2 = i + 1;
                i7 &= 0x3F;
                i7 = arrayOfByte1[i7];
                arrayOfByte2[i] = i7;
                boolean bool1 = this.do_padding;
                if (bool1)
                {
                  int j = i2 + 1;
                  arrayOfByte2[i2] = 61;
                  i2 = j + 1;
                  i7 = 61;
                  arrayOfByte2[j] = i7;
                }
                boolean bool2 = this.do_newline;
                if (bool2)
                {
                  bool2 = this.do_cr;
                  if (bool2)
                  {
                    k = i2 + 1;
                    i7 = 13;
                    arrayOfByte2[i2] = i7;
                    i2 = k;
                  }
                  k = i2 + 1;
                  i7 = 10;
                  arrayOfByte2[i2] = i7;
                  i2 = k;
                }
                i9 = i2;
                this.op = i9;
                this.count = i10;
                return true;
                i2 = i8 + 1;
                i2 = paramArrayOfByte[i8];
                k = 0;
                f = 0.0F;
              }
            }
            i2 = this.tailLen;
            i2 = i8 - i2;
            int k = i6 + -2;
            if (i2 == k)
            {
              i7 = 0;
              arrayOfByte3 = null;
              i2 = this.tailLen;
              k = 1;
              f = Float.MIN_VALUE;
              if (i2 > k)
              {
                arrayOfByte5 = this.tail;
                k = 1;
                f = Float.MIN_VALUE;
                i2 = arrayOfByte5[0];
                i7 = i8;
                i8 = (i2 & 0xFF) << 10;
                i2 = this.tailLen;
                if (i2 <= 0) {
                  break label1354;
                }
                arrayOfByte5 = this.tail;
                i7 = k + 1;
                i2 = arrayOfByte5[k];
                k = i7;
                i2 = (i2 & 0xFF) << 2 | i8;
                k = this.tailLen - k;
                this.tailLen = k;
                k = i9 + 1;
                i7 = i2 >> 12 & 0x3F;
                i7 = arrayOfByte1[i7];
                arrayOfByte2[i9] = i7;
                i7 = k + 1;
                i8 = i2 >> 6 & 0x3F;
                i8 = arrayOfByte1[i8];
                arrayOfByte2[k] = i8;
                k = i7 + 1;
                i2 &= 0x3F;
                i2 = arrayOfByte1[i2];
                arrayOfByte2[i7] = i2;
                boolean bool6 = this.do_padding;
                if (!bool6) {
                  break label1609;
                }
                i3 = k + 1;
                i7 = 61;
                arrayOfByte2[k] = i7;
              }
            }
          }
          for (;;)
          {
            boolean bool3 = this.do_newline;
            if (bool3)
            {
              bool3 = this.do_cr;
              if (bool3)
              {
                m = i3 + 1;
                i7 = 13;
                arrayOfByte2[i3] = i7;
                i3 = m;
              }
              m = i3 + 1;
              i7 = 10;
              arrayOfByte2[i3] = i7;
              i3 = m;
            }
            i9 = i3;
            break;
            m = i8 + 1;
            i3 = paramArrayOfByte[i8];
            i7 = m;
            m = 0;
            f = 0.0F;
            break label1070;
            label1354:
            i3 = i7 + 1;
            i3 = paramArrayOfByte[i7];
            break label1115;
            boolean bool7 = this.do_newline;
            if ((!bool7) || (i9 <= 0)) {
              break;
            }
            int i4 = 19;
            if (i10 == i4) {
              break;
            }
            boolean bool8 = this.do_cr;
            if (bool8)
            {
              i5 = i9 + 1;
              m = 13;
              f = 1.8E-44F;
              arrayOfByte2[i9] = m;
            }
            for (;;)
            {
              i9 = i5 + 1;
              m = 10;
              f = 1.4E-44F;
              arrayOfByte2[i5] = m;
              break;
              i5 = i6 + -1;
              if (i8 == i5)
              {
                arrayOfByte5 = this.tail;
                m = this.tailLen;
                i7 = m + 1;
                this.tailLen = i7;
                i7 = paramArrayOfByte[i8];
                arrayOfByte5[m] = i7;
                break;
              }
              i5 = i6 + -2;
              if (i8 != i5) {
                break;
              }
              arrayOfByte5 = this.tail;
              m = this.tailLen;
              i7 = m + 1;
              this.tailLen = i7;
              i7 = paramArrayOfByte[i8];
              arrayOfByte5[m] = i7;
              arrayOfByte5 = this.tail;
              m = this.tailLen;
              i7 = m + 1;
              this.tailLen = i7;
              i7 = i8 + 1;
              i7 = paramArrayOfByte[i7];
              arrayOfByte5[m] = i7;
              break;
              i5 = i9;
            }
            label1609:
            i5 = m;
          }
          label1616:
          i5 = m;
        }
        label1623:
        i10 = i5;
        i9 = m;
      }
      label1634:
      int i5 = m;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\Base64$Encoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */