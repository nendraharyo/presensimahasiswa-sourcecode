package org.apache.http.impl.auth;

class NTLMEngineImpl$Type3Message
  extends NTLMEngineImpl.NTLMMessage
{
  protected byte[] domainBytes;
  protected byte[] hostBytes;
  protected byte[] lmResp;
  protected byte[] ntResp;
  protected byte[] sessionKey;
  protected int type2Flags;
  protected byte[] userBytes;
  
  /* Error */
  NTLMEngineImpl$Type3Message(String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte1, int paramInt, String paramString5, byte[] paramArrayOfByte2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 17	org/apache/http/impl/auth/NTLMEngineImpl$NTLMMessage:<init>	()V
    //   4: aload_0
    //   5: iload 6
    //   7: putfield 19	org/apache/http/impl/auth/NTLMEngineImpl$Type3Message:type2Flags	I
    //   10: aload_2
    //   11: invokestatic 25	org/apache/http/impl/auth/NTLMEngineImpl:access$1400	(Ljava/lang/String;)Ljava/lang/String;
    //   14: astore 9
    //   16: aload_1
    //   17: invokestatic 28	org/apache/http/impl/auth/NTLMEngineImpl:access$1500	(Ljava/lang/String;)Ljava/lang/String;
    //   20: astore 10
    //   22: new 30	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen
    //   25: astore 11
    //   27: aload_3
    //   28: astore 12
    //   30: aload 4
    //   32: astore 13
    //   34: aload 11
    //   36: aload 10
    //   38: aload_3
    //   39: aload 4
    //   41: aload 5
    //   43: aload 7
    //   45: aload 8
    //   47: invokespecial 33	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;[B)V
    //   50: ldc 34
    //   52: iload 6
    //   54: iand
    //   55: istore 14
    //   57: iload 14
    //   59: ifeq +192 -> 251
    //   62: aload 8
    //   64: ifnull +187 -> 251
    //   67: aload 7
    //   69: ifnull +182 -> 251
    //   72: aload 11
    //   74: invokevirtual 39	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getNTLMv2Response	()[B
    //   77: astore 12
    //   79: aload_0
    //   80: aload 12
    //   82: putfield 41	org/apache/http/impl/auth/NTLMEngineImpl$Type3Message:ntResp	[B
    //   85: aload 11
    //   87: invokevirtual 44	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getLMv2Response	()[B
    //   90: astore 12
    //   92: aload_0
    //   93: aload 12
    //   95: putfield 46	org/apache/http/impl/auth/NTLMEngineImpl$Type3Message:lmResp	[B
    //   98: iload 6
    //   100: sipush 128
    //   103: iand
    //   104: istore 14
    //   106: iload 14
    //   108: ifeq +133 -> 241
    //   111: aload 11
    //   113: invokevirtual 49	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getLanManagerSessionKey	()[B
    //   116: astore 12
    //   118: iload 6
    //   120: bipush 16
    //   122: iand
    //   123: istore 15
    //   125: iload 15
    //   127: ifeq +322 -> 449
    //   130: ldc 50
    //   132: iload 6
    //   134: iand
    //   135: istore 15
    //   137: iload 15
    //   139: ifeq +301 -> 440
    //   142: aload 11
    //   144: invokevirtual 54	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getSecondaryKey	()[B
    //   147: aload 12
    //   149: invokestatic 58	org/apache/http/impl/auth/NTLMEngineImpl:RC4	([B[B)[B
    //   152: astore 11
    //   154: aload_0
    //   155: aload 11
    //   157: putfield 60	org/apache/http/impl/auth/NTLMEngineImpl$Type3Message:sessionKey	[B
    //   160: aload 9
    //   162: ifnull +298 -> 460
    //   165: ldc 62
    //   167: astore 11
    //   169: aload 9
    //   171: aload 11
    //   173: invokevirtual 68	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   176: astore 11
    //   178: aload_0
    //   179: aload 11
    //   181: putfield 70	org/apache/http/impl/auth/NTLMEngineImpl$Type3Message:hostBytes	[B
    //   184: aload 10
    //   186: ifnull +280 -> 466
    //   189: getstatic 76	java/util/Locale:ENGLISH	Ljava/util/Locale;
    //   192: astore 11
    //   194: aload 10
    //   196: aload 11
    //   198: invokevirtual 80	java/lang/String:toUpperCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   201: astore 11
    //   203: ldc 62
    //   205: astore 10
    //   207: aload 11
    //   209: aload 10
    //   211: invokevirtual 68	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   214: astore 11
    //   216: aload_0
    //   217: aload 11
    //   219: putfield 82	org/apache/http/impl/auth/NTLMEngineImpl$Type3Message:domainBytes	[B
    //   222: ldc 62
    //   224: astore 11
    //   226: aload_3
    //   227: aload 11
    //   229: invokevirtual 68	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   232: astore 11
    //   234: aload_0
    //   235: aload 11
    //   237: putfield 84	org/apache/http/impl/auth/NTLMEngineImpl$Type3Message:userBytes	[B
    //   240: return
    //   241: aload 11
    //   243: invokevirtual 87	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getNTLMv2UserSessionKey	()[B
    //   246: astore 12
    //   248: goto -130 -> 118
    //   251: ldc 88
    //   253: iload 6
    //   255: iand
    //   256: istore 14
    //   258: iload 14
    //   260: ifeq +62 -> 322
    //   263: aload 11
    //   265: invokevirtual 92	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getNTLM2SessionResponse	()[B
    //   268: astore 12
    //   270: aload_0
    //   271: aload 12
    //   273: putfield 41	org/apache/http/impl/auth/NTLMEngineImpl$Type3Message:ntResp	[B
    //   276: aload 11
    //   278: invokevirtual 95	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getLM2SessionResponse	()[B
    //   281: astore 12
    //   283: aload_0
    //   284: aload 12
    //   286: putfield 46	org/apache/http/impl/auth/NTLMEngineImpl$Type3Message:lmResp	[B
    //   289: iload 6
    //   291: sipush 128
    //   294: iand
    //   295: istore 14
    //   297: iload 14
    //   299: ifeq +13 -> 312
    //   302: aload 11
    //   304: invokevirtual 49	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getLanManagerSessionKey	()[B
    //   307: astore 12
    //   309: goto -191 -> 118
    //   312: aload 11
    //   314: invokevirtual 98	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getNTLM2SessionResponseUserSessionKey	()[B
    //   317: astore 12
    //   319: goto -201 -> 118
    //   322: aload 11
    //   324: invokevirtual 101	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getNTLMResponse	()[B
    //   327: astore 12
    //   329: aload_0
    //   330: aload 12
    //   332: putfield 41	org/apache/http/impl/auth/NTLMEngineImpl$Type3Message:ntResp	[B
    //   335: aload 11
    //   337: invokevirtual 104	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getLMResponse	()[B
    //   340: astore 12
    //   342: aload_0
    //   343: aload 12
    //   345: putfield 46	org/apache/http/impl/auth/NTLMEngineImpl$Type3Message:lmResp	[B
    //   348: iload 6
    //   350: sipush 128
    //   353: iand
    //   354: istore 14
    //   356: iload 14
    //   358: ifeq +13 -> 371
    //   361: aload 11
    //   363: invokevirtual 49	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getLanManagerSessionKey	()[B
    //   366: astore 12
    //   368: goto -250 -> 118
    //   371: aload 11
    //   373: invokevirtual 107	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getNTLMUserSessionKey	()[B
    //   376: astore 12
    //   378: goto -260 -> 118
    //   381: astore 12
    //   383: iconst_0
    //   384: newarray <illegal type>
    //   386: astore 12
    //   388: aload_0
    //   389: aload 12
    //   391: putfield 41	org/apache/http/impl/auth/NTLMEngineImpl$Type3Message:ntResp	[B
    //   394: aload 11
    //   396: invokevirtual 104	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getLMResponse	()[B
    //   399: astore 12
    //   401: aload_0
    //   402: aload 12
    //   404: putfield 46	org/apache/http/impl/auth/NTLMEngineImpl$Type3Message:lmResp	[B
    //   407: iload 6
    //   409: sipush 128
    //   412: iand
    //   413: istore 14
    //   415: iload 14
    //   417: ifeq +13 -> 430
    //   420: aload 11
    //   422: invokevirtual 49	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getLanManagerSessionKey	()[B
    //   425: astore 12
    //   427: goto -309 -> 118
    //   430: aload 11
    //   432: invokevirtual 110	org/apache/http/impl/auth/NTLMEngineImpl$CipherGen:getLMUserSessionKey	()[B
    //   435: astore 12
    //   437: goto -319 -> 118
    //   440: aload_0
    //   441: aload 12
    //   443: putfield 60	org/apache/http/impl/auth/NTLMEngineImpl$Type3Message:sessionKey	[B
    //   446: goto -286 -> 160
    //   449: aconst_null
    //   450: astore 11
    //   452: aload_0
    //   453: aconst_null
    //   454: putfield 60	org/apache/http/impl/auth/NTLMEngineImpl$Type3Message:sessionKey	[B
    //   457: goto -297 -> 160
    //   460: aconst_null
    //   461: astore 11
    //   463: goto -285 -> 178
    //   466: aconst_null
    //   467: astore 11
    //   469: goto -253 -> 216
    //   472: astore 11
    //   474: new 112	org/apache/http/impl/auth/NTLMEngineException
    //   477: astore 10
    //   479: new 114	java/lang/StringBuilder
    //   482: astore 12
    //   484: aload 12
    //   486: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   489: aload 12
    //   491: ldc 117
    //   493: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   496: astore 12
    //   498: aload 11
    //   500: invokevirtual 127	java/io/UnsupportedEncodingException:getMessage	()Ljava/lang/String;
    //   503: astore 13
    //   505: aload 12
    //   507: aload 13
    //   509: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   515: astore 12
    //   517: aload 10
    //   519: aload 12
    //   521: aload 11
    //   523: invokespecial 133	org/apache/http/impl/auth/NTLMEngineException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   526: aload 10
    //   528: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	529	0	this	Type3Message
    //   0	529	1	paramString1	String
    //   0	529	2	paramString2	String
    //   0	529	3	paramString3	String
    //   0	529	4	paramString4	String
    //   0	529	5	paramArrayOfByte1	byte[]
    //   0	529	6	paramInt	int
    //   0	529	7	paramString5	String
    //   0	529	8	paramArrayOfByte2	byte[]
    //   14	156	9	str1	String
    //   20	507	10	localObject1	Object
    //   25	443	11	localObject2	Object
    //   472	50	11	localUnsupportedEncodingException	java.io.UnsupportedEncodingException
    //   28	349	12	localObject3	Object
    //   381	1	12	localNTLMEngineException	NTLMEngineException
    //   386	134	12	localObject4	Object
    //   32	476	13	str2	String
    //   55	361	14	i	int
    //   123	15	15	j	int
    // Exception table:
    //   from	to	target	type
    //   72	77	381	org/apache/http/impl/auth/NTLMEngineException
    //   80	85	381	org/apache/http/impl/auth/NTLMEngineException
    //   85	90	381	org/apache/http/impl/auth/NTLMEngineException
    //   93	98	381	org/apache/http/impl/auth/NTLMEngineException
    //   111	116	381	org/apache/http/impl/auth/NTLMEngineException
    //   241	246	381	org/apache/http/impl/auth/NTLMEngineException
    //   263	268	381	org/apache/http/impl/auth/NTLMEngineException
    //   271	276	381	org/apache/http/impl/auth/NTLMEngineException
    //   276	281	381	org/apache/http/impl/auth/NTLMEngineException
    //   284	289	381	org/apache/http/impl/auth/NTLMEngineException
    //   302	307	381	org/apache/http/impl/auth/NTLMEngineException
    //   312	317	381	org/apache/http/impl/auth/NTLMEngineException
    //   322	327	381	org/apache/http/impl/auth/NTLMEngineException
    //   330	335	381	org/apache/http/impl/auth/NTLMEngineException
    //   335	340	381	org/apache/http/impl/auth/NTLMEngineException
    //   343	348	381	org/apache/http/impl/auth/NTLMEngineException
    //   361	366	381	org/apache/http/impl/auth/NTLMEngineException
    //   371	376	381	org/apache/http/impl/auth/NTLMEngineException
    //   171	176	472	java/io/UnsupportedEncodingException
    //   179	184	472	java/io/UnsupportedEncodingException
    //   189	192	472	java/io/UnsupportedEncodingException
    //   196	201	472	java/io/UnsupportedEncodingException
    //   209	214	472	java/io/UnsupportedEncodingException
    //   217	222	472	java/io/UnsupportedEncodingException
    //   227	232	472	java/io/UnsupportedEncodingException
    //   235	240	472	java/io/UnsupportedEncodingException
  }
  
  String getResponse()
  {
    int i = 0;
    byte[] arrayOfByte1 = null;
    int j = this.ntResp.length;
    int k = this.lmResp.length;
    byte[] arrayOfByte2 = this.domainBytes;
    int m;
    byte[] arrayOfByte3;
    int n;
    if (arrayOfByte2 != null)
    {
      arrayOfByte2 = this.domainBytes;
      m = arrayOfByte2.length;
      arrayOfByte3 = this.hostBytes;
      if (arrayOfByte3 == null) {
        break label551;
      }
      arrayOfByte3 = this.hostBytes;
      n = arrayOfByte3.length;
    }
    for (;;)
    {
      byte[] arrayOfByte4 = this.userBytes;
      int i1 = arrayOfByte4.length;
      byte[] arrayOfByte5 = this.sessionKey;
      if (arrayOfByte5 != null)
      {
        arrayOfByte1 = this.sessionKey;
        i = arrayOfByte1.length;
      }
      int i2 = k + 72;
      int i3 = i2 + j;
      int i4 = i3 + m;
      int i5 = i4 + i1;
      int i6 = i5 + n;
      int i7 = i6 + i;
      int i8 = 3;
      prepareResponse(i7, i8);
      addUShort(k);
      addUShort(k);
      k = 72;
      addULong(k);
      addUShort(j);
      addUShort(j);
      addULong(i2);
      addUShort(m);
      addUShort(m);
      addULong(i3);
      addUShort(i1);
      addUShort(i1);
      addULong(i4);
      addUShort(n);
      addUShort(n);
      addULong(i5);
      addUShort(i);
      addUShort(i);
      addULong(i6);
      m = this.type2Flags & 0x80;
      i = this.type2Flags & 0x200;
      m |= i;
      i = this.type2Flags & 0x80000;
      m = m | i | 0x2000000;
      i = this.type2Flags & 0x8000;
      m |= i;
      i = this.type2Flags & 0x20;
      m |= i;
      i = this.type2Flags & 0x10;
      m |= i;
      i = this.type2Flags & 0x20000000;
      m |= i;
      i = this.type2Flags & -1 << -1;
      m |= i;
      i = this.type2Flags & 0x40000000;
      m |= i;
      i = this.type2Flags;
      n = 8388608;
      i &= n;
      m |= i;
      i = this.type2Flags & 0x1;
      m |= i;
      i = this.type2Flags & 0x4;
      m |= i;
      addULong(m);
      addUShort(261);
      addULong(2600);
      m = 3840;
      addUShort(m);
      arrayOfByte2 = this.lmResp;
      addBytes(arrayOfByte2);
      arrayOfByte2 = this.ntResp;
      addBytes(arrayOfByte2);
      arrayOfByte2 = this.domainBytes;
      addBytes(arrayOfByte2);
      arrayOfByte2 = this.userBytes;
      addBytes(arrayOfByte2);
      arrayOfByte2 = this.hostBytes;
      addBytes(arrayOfByte2);
      arrayOfByte2 = this.sessionKey;
      if (arrayOfByte2 != null)
      {
        arrayOfByte2 = this.sessionKey;
        addBytes(arrayOfByte2);
      }
      return super.getResponse();
      m = 0;
      arrayOfByte2 = null;
      break;
      label551:
      n = 0;
      arrayOfByte3 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\NTLMEngineImpl$Type3Message.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */