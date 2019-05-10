package com.sun.pdfview.decode;

public class CCITTFaxDecoder
{
  static short[] additionalMakeup;
  static short[] black;
  static byte[] flipTable;
  static short[] initBlack;
  static int[] table1;
  static int[] table2;
  static short[] twoBitBlack;
  static byte[] twoDCodes;
  static short[] white;
  private boolean align = false;
  private int bitPointer;
  private int bytePointer;
  private int changingElemSize = 0;
  private int[] currChangingElems;
  private byte[] data;
  private boolean fillBits = false;
  private int fillOrder;
  private int lastChangingElement = 0;
  private int[] prevChangingElems;
  private int w;
  
  static
  {
    int i = 456;
    int j = 424;
    int k = 390;
    int m = 358;
    int n = 326;
    Object localObject = new int[9];
    localObject[1] = 1;
    localObject[2] = 3;
    localObject[3] = 7;
    localObject[4] = 15;
    localObject[5] = 31;
    localObject[6] = 63;
    localObject[7] = 127;
    localObject[8] = 255;
    table1 = (int[])localObject;
    localObject = new int[9];
    localObject[1] = 128;
    localObject[2] = 192;
    localObject[3] = 224;
    localObject[4] = 240;
    localObject[5] = 248;
    localObject[6] = 252;
    localObject[7] = 254;
    localObject[8] = 255;
    table2 = (int[])localObject;
    localObject = new byte['Ā'];
    localObject[1] = -128;
    localObject[2] = 64;
    localObject[3] = -64;
    localObject[4] = 32;
    localObject[5] = -96;
    localObject[6] = 96;
    localObject[7] = -32;
    localObject[8] = 16;
    localObject[9] = -112;
    localObject[10] = 80;
    localObject[11] = -48;
    localObject[12] = 48;
    localObject[13] = -80;
    localObject[14] = 112;
    localObject[15] = -16;
    localObject[16] = 8;
    localObject[17] = -120;
    localObject[18] = 72;
    localObject[19] = -56;
    localObject[20] = 40;
    localObject[21] = -88;
    localObject[22] = 104;
    localObject[23] = -24;
    localObject[24] = 24;
    localObject[25] = -104;
    localObject[26] = 88;
    localObject[27] = -40;
    localObject[28] = 56;
    localObject[29] = -72;
    localObject[30] = 120;
    localObject[31] = -8;
    localObject[32] = 4;
    localObject[33] = -124;
    localObject[34] = 68;
    localObject[35] = -60;
    localObject[36] = 36;
    localObject[37] = -92;
    localObject[38] = 100;
    localObject[39] = -28;
    localObject[40] = 20;
    localObject[41] = -108;
    localObject[42] = 84;
    localObject[43] = -44;
    localObject[44] = 52;
    localObject[45] = -76;
    localObject[46] = 116;
    localObject[47] = -12;
    localObject[48] = 12;
    localObject[49] = -116;
    localObject[50] = 76;
    localObject[51] = -52;
    localObject[52] = 44;
    localObject[53] = -84;
    localObject[54] = 108;
    localObject[55] = -20;
    localObject[56] = 28;
    localObject[57] = -100;
    localObject[58] = 92;
    localObject[59] = -36;
    localObject[60] = 60;
    localObject[61] = -68;
    localObject[62] = 124;
    localObject[63] = -4;
    localObject[64] = 2;
    localObject[65] = -126;
    localObject[66] = 66;
    localObject[67] = -62;
    localObject[68] = 34;
    localObject[69] = -94;
    localObject[70] = 98;
    localObject[71] = -30;
    localObject[72] = 18;
    localObject[73] = -110;
    localObject[74] = 82;
    localObject[75] = -46;
    localObject[76] = 50;
    localObject[77] = -78;
    localObject[78] = 114;
    localObject[79] = -14;
    localObject[80] = 10;
    localObject[81] = -118;
    localObject[82] = 74;
    localObject[83] = -54;
    localObject[84] = 42;
    localObject[85] = -86;
    localObject[86] = 106;
    localObject[87] = -22;
    localObject[88] = 26;
    localObject[89] = -102;
    localObject[90] = 90;
    localObject[91] = -38;
    localObject[92] = 58;
    localObject[93] = -70;
    localObject[94] = 122;
    localObject[95] = -6;
    localObject[96] = 6;
    localObject[97] = -122;
    localObject[98] = 70;
    localObject[99] = -58;
    localObject[100] = 38;
    localObject[101] = -90;
    localObject[102] = 102;
    localObject[103] = -26;
    localObject[104] = 22;
    localObject[105] = -106;
    localObject[106] = 86;
    localObject[107] = -42;
    localObject[108] = 54;
    localObject[109] = -74;
    localObject[110] = 118;
    localObject[111] = -10;
    localObject[112] = 14;
    localObject[113] = -114;
    localObject[114] = 78;
    localObject[115] = -50;
    localObject[116] = 46;
    localObject[117] = -82;
    localObject[118] = 110;
    localObject[119] = -18;
    localObject[120] = 30;
    localObject[121] = -98;
    localObject[122] = 94;
    localObject[123] = -34;
    localObject[124] = 62;
    localObject[125] = -66;
    localObject[126] = 126;
    localObject[127] = -2;
    localObject[''] = 1;
    localObject[''] = -127;
    localObject[''] = 65;
    localObject[''] = -63;
    localObject[''] = 33;
    localObject[''] = -95;
    localObject[''] = 97;
    localObject[''] = -31;
    localObject[''] = 17;
    localObject[''] = -111;
    localObject[''] = 81;
    localObject[''] = -47;
    localObject[''] = 49;
    localObject[''] = -79;
    localObject[''] = 113;
    localObject[''] = -15;
    localObject[''] = 9;
    localObject[''] = -119;
    localObject[''] = 73;
    localObject[''] = -55;
    localObject[''] = 41;
    localObject[''] = -87;
    localObject[''] = 105;
    localObject[''] = -23;
    localObject[''] = 25;
    localObject[''] = -103;
    localObject[''] = 89;
    localObject[''] = -39;
    localObject[''] = 57;
    localObject[''] = -71;
    localObject[''] = 121;
    localObject[''] = -7;
    localObject[' '] = 5;
    localObject['¡'] = -123;
    localObject['¢'] = 69;
    localObject['£'] = -59;
    localObject['¤'] = 37;
    localObject['¥'] = -91;
    localObject['¦'] = 101;
    localObject['§'] = -27;
    localObject['¨'] = 21;
    localObject['©'] = -107;
    localObject['ª'] = 85;
    localObject['«'] = -43;
    localObject['¬'] = 53;
    localObject['­'] = -75;
    localObject['®'] = 117;
    localObject['¯'] = -11;
    localObject['°'] = 13;
    localObject['±'] = -115;
    localObject['²'] = 77;
    localObject['³'] = -51;
    localObject['´'] = 45;
    localObject['µ'] = -83;
    localObject['¶'] = 109;
    localObject['·'] = -19;
    localObject['¸'] = 29;
    localObject['¹'] = -99;
    localObject['º'] = 93;
    localObject['»'] = -35;
    localObject['¼'] = 61;
    localObject['½'] = -67;
    localObject['¾'] = 125;
    localObject['¿'] = -3;
    localObject['À'] = 3;
    localObject['Á'] = -125;
    localObject['Â'] = 67;
    localObject['Ã'] = -61;
    localObject['Ä'] = 35;
    localObject['Å'] = -93;
    localObject['Æ'] = 99;
    localObject['Ç'] = -29;
    localObject['È'] = 19;
    localObject['É'] = -109;
    localObject['Ê'] = 83;
    localObject['Ë'] = -45;
    localObject['Ì'] = 51;
    localObject['Í'] = -77;
    localObject['Î'] = 115;
    localObject['Ï'] = -13;
    localObject['Ð'] = 11;
    localObject['Ñ'] = -117;
    localObject['Ò'] = 75;
    localObject['Ó'] = -53;
    localObject['Ô'] = 43;
    localObject['Õ'] = -85;
    localObject['Ö'] = 107;
    localObject['×'] = -21;
    localObject['Ø'] = 27;
    localObject['Ù'] = -101;
    localObject['Ú'] = 91;
    localObject['Û'] = -37;
    localObject['Ü'] = 59;
    localObject['Ý'] = -69;
    localObject['Þ'] = 123;
    localObject['ß'] = -5;
    localObject['à'] = 7;
    localObject['á'] = -121;
    localObject['â'] = 71;
    localObject['ã'] = -57;
    localObject['ä'] = 39;
    localObject['å'] = -89;
    localObject['æ'] = 103;
    localObject['ç'] = -25;
    localObject['è'] = 23;
    localObject['é'] = -105;
    localObject['ê'] = 87;
    localObject['ë'] = -41;
    localObject['ì'] = 55;
    localObject['í'] = -73;
    localObject['î'] = 119;
    localObject['ï'] = -9;
    localObject['ð'] = 15;
    localObject['ñ'] = -113;
    localObject['ò'] = 79;
    localObject['ó'] = -49;
    localObject['ô'] = 47;
    localObject['õ'] = -81;
    localObject['ö'] = 111;
    localObject['÷'] = -17;
    localObject['ø'] = 31;
    localObject['ù'] = -97;
    localObject['ú'] = 95;
    localObject['û'] = -33;
    localObject['ü'] = 63;
    localObject['ý'] = -65;
    localObject['þ'] = 127;
    localObject['ÿ'] = -1;
    flipTable = (byte[])localObject;
    localObject = new short['Ѐ'];
    Object tmp2075_2073 = localObject;
    Object tmp2076_2075 = tmp2075_2073;
    Object tmp2076_2075 = tmp2075_2073;
    tmp2076_2075[0] = 'ᤞ';
    tmp2076_2075[1] = 'ᤀ';
    Object tmp2087_2076 = tmp2076_2075;
    Object tmp2087_2076 = tmp2076_2075;
    tmp2087_2076[2] = 'ᤀ';
    tmp2087_2076[3] = 'ᤀ';
    Object tmp2098_2087 = tmp2087_2076;
    Object tmp2098_2087 = tmp2087_2076;
    tmp2098_2087[4] = 'ಙ';
    tmp2098_2087[5] = 'ಙ';
    Object tmp2109_2098 = tmp2098_2087;
    Object tmp2109_2098 = tmp2098_2087;
    tmp2109_2098[6] = 'ಙ';
    tmp2109_2098[7] = 'ಙ';
    Object tmp2122_2109 = tmp2109_2098;
    Object tmp2122_2109 = tmp2109_2098;
    tmp2122_2109[8] = 'ΰ';
    tmp2122_2109[9] = 'ΰ';
    Object tmp2135_2122 = tmp2122_2109;
    Object tmp2135_2122 = tmp2122_2109;
    tmp2135_2122[10] = 'ΰ';
    tmp2135_2122[11] = 'ΰ';
    Object tmp2148_2135 = tmp2135_2122;
    Object tmp2148_2135 = tmp2135_2122;
    tmp2148_2135[12] = 'ϐ';
    tmp2148_2135[13] = 'ϐ';
    Object tmp2161_2148 = tmp2148_2135;
    Object tmp2161_2148 = tmp2148_2135;
    tmp2161_2148[14] = 'ϐ';
    tmp2161_2148[15] = 'ϐ';
    Object tmp2174_2161 = tmp2161_2148;
    Object tmp2174_2161 = tmp2161_2148;
    tmp2174_2161[16] = 'ְ';
    tmp2174_2161[17] = 'ְ';
    Object tmp2187_2174 = tmp2174_2161;
    Object tmp2187_2174 = tmp2174_2161;
    tmp2187_2174[18] = 'ְ';
    tmp2187_2174[19] = 'ְ';
    Object tmp2200_2187 = tmp2187_2174;
    Object tmp2200_2187 = tmp2187_2174;
    tmp2200_2187[20] = 'א';
    tmp2200_2187[21] = 'א';
    Object tmp2213_2200 = tmp2200_2187;
    Object tmp2213_2200 = tmp2200_2187;
    tmp2213_2200[22] = 'א';
    tmp2213_2200[23] = 'א';
    Object tmp2226_2213 = tmp2213_2200;
    Object tmp2226_2213 = tmp2213_2200;
    tmp2226_2213[24] = 'ˎ';
    tmp2226_2213[25] = 'ˎ';
    Object tmp2239_2226 = tmp2226_2213;
    Object tmp2239_2226 = tmp2226_2213;
    tmp2239_2226[26] = 'ˎ';
    tmp2239_2226[27] = 'ˎ';
    Object tmp2252_2239 = tmp2239_2226;
    Object tmp2252_2239 = tmp2239_2226;
    tmp2252_2239[28] = 'ˎ';
    tmp2252_2239[29] = 'ˎ';
    Object tmp2265_2252 = tmp2252_2239;
    Object tmp2265_2252 = tmp2252_2239;
    tmp2265_2252[30] = 'ˎ';
    tmp2265_2252[31] = 'ˎ';
    Object tmp2278_2265 = tmp2265_2252;
    Object tmp2278_2265 = tmp2265_2252;
    tmp2278_2265[32] = 'ˮ';
    tmp2278_2265[33] = 'ˮ';
    Object tmp2291_2278 = tmp2278_2265;
    Object tmp2291_2278 = tmp2278_2265;
    tmp2291_2278[34] = 'ˮ';
    tmp2291_2278[35] = 'ˮ';
    Object tmp2304_2291 = tmp2291_2278;
    Object tmp2304_2291 = tmp2291_2278;
    tmp2304_2291[36] = 'ˮ';
    tmp2304_2291[37] = 'ˮ';
    Object tmp2317_2304 = tmp2304_2291;
    Object tmp2317_2304 = tmp2304_2291;
    tmp2317_2304[38] = 'ˮ';
    tmp2317_2304[39] = 'ˮ';
    Object tmp2330_2317 = tmp2317_2304;
    Object tmp2330_2317 = tmp2317_2304;
    tmp2330_2317[40] = 'װ';
    tmp2330_2317[41] = 'װ';
    Object tmp2343_2330 = tmp2330_2317;
    Object tmp2343_2330 = tmp2330_2317;
    tmp2343_2330[42] = 'װ';
    tmp2343_2330[43] = 'װ';
    Object tmp2356_2343 = tmp2343_2330;
    Object tmp2356_2343 = tmp2343_2330;
    tmp2356_2343[44] = 'ؐ';
    tmp2356_2343[45] = 'ؐ';
    Object tmp2369_2356 = tmp2356_2343;
    Object tmp2369_2356 = tmp2356_2343;
    tmp2369_2356[46] = 'ؐ';
    tmp2369_2356[47] = 'ؐ';
    Object tmp2382_2369 = tmp2369_2356;
    Object tmp2382_2369 = tmp2369_2356;
    tmp2382_2369[48] = 'Ƭ';
    tmp2382_2369[49] = 'Ƭ';
    Object tmp2395_2382 = tmp2382_2369;
    Object tmp2395_2382 = tmp2382_2369;
    tmp2395_2382[50] = 'Ƭ';
    tmp2395_2382[51] = 'Ƭ';
    Object tmp2408_2395 = tmp2395_2382;
    Object tmp2408_2395 = tmp2395_2382;
    tmp2408_2395[52] = 'Ƭ';
    tmp2408_2395[53] = 'Ƭ';
    Object tmp2421_2408 = tmp2408_2395;
    Object tmp2421_2408 = tmp2408_2395;
    tmp2421_2408[54] = 'Ƭ';
    tmp2421_2408[55] = 'Ƭ';
    Object tmp2434_2421 = tmp2421_2408;
    Object tmp2434_2421 = tmp2421_2408;
    tmp2434_2421[56] = 'Ƭ';
    tmp2434_2421[57] = 'Ƭ';
    Object tmp2447_2434 = tmp2434_2421;
    Object tmp2447_2434 = tmp2434_2421;
    tmp2447_2434[58] = 'Ƭ';
    tmp2447_2434[59] = 'Ƭ';
    Object tmp2460_2447 = tmp2447_2434;
    Object tmp2460_2447 = tmp2447_2434;
    tmp2460_2447[60] = 'Ƭ';
    tmp2460_2447[61] = 'Ƭ';
    Object tmp2473_2460 = tmp2460_2447;
    Object tmp2473_2460 = tmp2460_2447;
    tmp2473_2460[62] = 'Ƭ';
    tmp2473_2460[63] = 'Ƭ';
    Object tmp2486_2473 = tmp2473_2460;
    Object tmp2486_2473 = tmp2473_2460;
    tmp2486_2473[64] = 'ʎ';
    tmp2486_2473[65] = 'ʎ';
    Object tmp2499_2486 = tmp2486_2473;
    Object tmp2499_2486 = tmp2486_2473;
    tmp2499_2486[66] = 'ʎ';
    tmp2499_2486[67] = 'ʎ';
    Object tmp2512_2499 = tmp2499_2486;
    Object tmp2512_2499 = tmp2499_2486;
    tmp2512_2499[68] = 'ʎ';
    tmp2512_2499[69] = 'ʎ';
    Object tmp2525_2512 = tmp2512_2499;
    Object tmp2525_2512 = tmp2512_2499;
    tmp2525_2512[70] = 'ʎ';
    tmp2525_2512[71] = 'ʎ';
    Object tmp2538_2525 = tmp2525_2512;
    Object tmp2538_2525 = tmp2525_2512;
    tmp2538_2525[72] = 'а';
    tmp2538_2525[73] = 'а';
    Object tmp2551_2538 = tmp2538_2525;
    Object tmp2551_2538 = tmp2538_2525;
    tmp2551_2538[74] = 'а';
    tmp2551_2538[75] = 'а';
    Object tmp2564_2551 = tmp2551_2538;
    Object tmp2564_2551 = tmp2551_2538;
    tmp2564_2551[76] = 'ѐ';
    tmp2564_2551[77] = 'ѐ';
    Object tmp2577_2564 = tmp2564_2551;
    Object tmp2577_2564 = tmp2564_2551;
    tmp2577_2564[78] = 'ѐ';
    tmp2577_2564[79] = 'ѐ';
    Object tmp2590_2577 = tmp2577_2564;
    Object tmp2590_2577 = tmp2577_2564;
    tmp2590_2577[80] = 'Ѱ';
    tmp2590_2577[81] = 'Ѱ';
    Object tmp2603_2590 = tmp2590_2577;
    Object tmp2603_2590 = tmp2590_2577;
    tmp2603_2590[82] = 'Ѱ';
    tmp2603_2590[83] = 'Ѱ';
    Object tmp2616_2603 = tmp2603_2590;
    Object tmp2616_2603 = tmp2603_2590;
    tmp2616_2603[84] = 'Ґ';
    tmp2616_2603[85] = 'Ґ';
    Object tmp2629_2616 = tmp2616_2603;
    Object tmp2629_2616 = tmp2616_2603;
    tmp2629_2616[86] = 'Ґ';
    tmp2629_2616[87] = 'Ґ';
    Object tmp2642_2629 = tmp2629_2616;
    Object tmp2642_2629 = tmp2629_2616;
    tmp2642_2629[88] = 'Ұ';
    tmp2642_2629[89] = 'Ұ';
    Object tmp2655_2642 = tmp2642_2629;
    Object tmp2655_2642 = tmp2642_2629;
    tmp2655_2642[90] = 'Ұ';
    tmp2655_2642[91] = 'Ұ';
    Object tmp2668_2655 = tmp2655_2642;
    Object tmp2668_2655 = tmp2655_2642;
    tmp2668_2655[92] = 'Ӑ';
    tmp2668_2655[93] = 'Ӑ';
    Object tmp2681_2668 = tmp2668_2655;
    Object tmp2681_2668 = tmp2668_2655;
    tmp2681_2668[94] = 'Ӑ';
    tmp2681_2668[95] = 'Ӑ';
    Object tmp2694_2681 = tmp2681_2668;
    Object tmp2694_2681 = tmp2681_2668;
    tmp2694_2681[96] = 'ɮ';
    tmp2694_2681[97] = 'ɮ';
    Object tmp2707_2694 = tmp2694_2681;
    Object tmp2707_2694 = tmp2694_2681;
    tmp2707_2694[98] = 'ɮ';
    tmp2707_2694[99] = 'ɮ';
    Object tmp2720_2707 = tmp2707_2694;
    Object tmp2720_2707 = tmp2707_2694;
    tmp2720_2707[100] = 'ɮ';
    tmp2720_2707[101] = 'ɮ';
    Object tmp2733_2720 = tmp2720_2707;
    Object tmp2733_2720 = tmp2720_2707;
    tmp2733_2720[102] = 'ɮ';
    tmp2733_2720[103] = 'ɮ';
    Object tmp2746_2733 = tmp2733_2720;
    Object tmp2746_2733 = tmp2733_2720;
    tmp2746_2733[104] = 'ϰ';
    tmp2746_2733[105] = 'ϰ';
    Object tmp2759_2746 = tmp2746_2733;
    Object tmp2759_2746 = tmp2746_2733;
    tmp2759_2746[106] = 'ϰ';
    tmp2759_2746[107] = 'ϰ';
    Object tmp2772_2759 = tmp2759_2746;
    Object tmp2772_2759 = tmp2759_2746;
    tmp2772_2759[108] = 'А';
    tmp2772_2759[109] = 'А';
    Object tmp2785_2772 = tmp2772_2759;
    Object tmp2785_2772 = tmp2772_2759;
    tmp2785_2772[110] = 'А';
    tmp2785_2772[111] = 'А';
    Object tmp2798_2785 = tmp2785_2772;
    Object tmp2798_2785 = tmp2785_2772;
    tmp2798_2785[112] = 44;
    tmp2798_2785[113] = 44;
    Object tmp2809_2798 = tmp2798_2785;
    Object tmp2809_2798 = tmp2798_2785;
    tmp2809_2798[114] = 44;
    tmp2809_2798[115] = 44;
    Object tmp2820_2809 = tmp2809_2798;
    Object tmp2820_2809 = tmp2809_2798;
    tmp2820_2809[116] = 44;
    tmp2820_2809[117] = 44;
    Object tmp2831_2820 = tmp2820_2809;
    Object tmp2831_2820 = tmp2820_2809;
    tmp2831_2820[118] = 44;
    tmp2831_2820[119] = 44;
    Object tmp2842_2831 = tmp2831_2820;
    Object tmp2842_2831 = tmp2831_2820;
    tmp2842_2831[120] = 44;
    tmp2842_2831[121] = 44;
    Object tmp2853_2842 = tmp2842_2831;
    Object tmp2853_2842 = tmp2842_2831;
    tmp2853_2842[122] = 44;
    tmp2853_2842[123] = 44;
    Object tmp2864_2853 = tmp2853_2842;
    Object tmp2864_2853 = tmp2853_2842;
    tmp2864_2853[124] = 44;
    tmp2864_2853[125] = 44;
    Object tmp2875_2864 = tmp2864_2853;
    Object tmp2875_2864 = tmp2864_2853;
    tmp2875_2864[126] = 44;
    tmp2875_2864[127] = 44;
    Object tmp2886_2875 = tmp2875_2864;
    Object tmp2886_2875 = tmp2875_2864;
    tmp2886_2875[''] = 'ƌ';
    tmp2886_2875[''] = 'ƌ';
    Object tmp2901_2886 = tmp2886_2875;
    Object tmp2901_2886 = tmp2886_2875;
    tmp2901_2886[''] = 'ƌ';
    tmp2901_2886[''] = 'ƌ';
    Object tmp2916_2901 = tmp2901_2886;
    Object tmp2916_2901 = tmp2901_2886;
    tmp2916_2901[''] = 'ƌ';
    tmp2916_2901[''] = 'ƌ';
    Object tmp2931_2916 = tmp2916_2901;
    Object tmp2931_2916 = tmp2916_2901;
    tmp2931_2916[''] = 'ƌ';
    tmp2931_2916[''] = 'ƌ';
    Object tmp2946_2931 = tmp2931_2916;
    Object tmp2946_2931 = tmp2931_2916;
    tmp2946_2931[''] = 'ƌ';
    tmp2946_2931[''] = 'ƌ';
    Object tmp2961_2946 = tmp2946_2931;
    Object tmp2961_2946 = tmp2946_2931;
    tmp2961_2946[''] = 'ƌ';
    tmp2961_2946[''] = 'ƌ';
    Object tmp2976_2961 = tmp2961_2946;
    Object tmp2976_2961 = tmp2961_2946;
    tmp2976_2961[''] = 'ƌ';
    tmp2976_2961[''] = 'ƌ';
    Object tmp2991_2976 = tmp2976_2961;
    Object tmp2991_2976 = tmp2976_2961;
    tmp2991_2976[''] = 'ƌ';
    tmp2991_2976[''] = 'ƌ';
    Object tmp3006_2991 = tmp2991_2976;
    Object tmp3006_2991 = tmp2991_2976;
    tmp3006_2991[''] = 'ڰ';
    tmp3006_2991[''] = 'ڰ';
    Object tmp3021_3006 = tmp3006_2991;
    Object tmp3021_3006 = tmp3006_2991;
    tmp3021_3006[''] = 'ڰ';
    tmp3021_3006[''] = 'ڰ';
    Object tmp3036_3021 = tmp3021_3006;
    Object tmp3036_3021 = tmp3021_3006;
    tmp3036_3021[''] = 'ې';
    tmp3036_3021[''] = 'ې';
    Object tmp3051_3036 = tmp3036_3021;
    Object tmp3051_3036 = tmp3036_3021;
    tmp3051_3036[''] = 'ې';
    tmp3051_3036[''] = 'ې';
    Object tmp3066_3051 = tmp3051_3036;
    Object tmp3066_3051 = tmp3051_3036;
    tmp3066_3051[''] = '͎';
    tmp3066_3051[''] = '͎';
    Object tmp3081_3066 = tmp3066_3051;
    Object tmp3081_3066 = tmp3066_3051;
    tmp3081_3066[''] = '͎';
    tmp3081_3066[''] = '͎';
    Object tmp3096_3081 = tmp3081_3066;
    Object tmp3096_3081 = tmp3081_3066;
    tmp3096_3081[''] = '͎';
    tmp3096_3081[''] = '͎';
    Object tmp3111_3096 = tmp3096_3081;
    Object tmp3111_3096 = tmp3096_3081;
    tmp3111_3096[''] = '͎';
    tmp3111_3096[''] = '͎';
    Object tmp3126_3111 = tmp3111_3096;
    Object tmp3126_3111 = tmp3111_3096;
    tmp3126_3111[' '] = 'Ӱ';
    tmp3126_3111['¡'] = 'Ӱ';
    Object tmp3141_3126 = tmp3126_3111;
    Object tmp3141_3126 = tmp3126_3111;
    tmp3141_3126['¢'] = 'Ӱ';
    tmp3141_3126['£'] = 'Ӱ';
    Object tmp3156_3141 = tmp3141_3126;
    Object tmp3156_3141 = tmp3141_3126;
    tmp3156_3141['¤'] = 'Ԑ';
    tmp3156_3141['¥'] = 'Ԑ';
    Object tmp3171_3156 = tmp3156_3141;
    Object tmp3171_3156 = tmp3156_3141;
    tmp3171_3156['¦'] = 'Ԑ';
    tmp3171_3156['§'] = 'Ԑ';
    Object tmp3186_3171 = tmp3171_3156;
    Object tmp3186_3171 = tmp3171_3156;
    tmp3186_3171['¨'] = '԰';
    tmp3186_3171['©'] = '԰';
    Object tmp3201_3186 = tmp3186_3171;
    Object tmp3201_3186 = tmp3186_3171;
    tmp3201_3186['ª'] = '԰';
    tmp3201_3186['«'] = '԰';
    Object tmp3216_3201 = tmp3201_3186;
    Object tmp3216_3201 = tmp3201_3186;
    tmp3216_3201['¬'] = 'Ր';
    tmp3216_3201['­'] = 'Ր';
    Object tmp3231_3216 = tmp3216_3201;
    Object tmp3231_3216 = tmp3216_3201;
    tmp3231_3216['®'] = 'Ր';
    tmp3231_3216['¯'] = 'Ր';
    Object tmp3246_3231 = tmp3231_3216;
    Object tmp3246_3231 = tmp3231_3216;
    tmp3246_3231['°'] = 'հ';
    tmp3246_3231['±'] = 'հ';
    Object tmp3261_3246 = tmp3246_3231;
    Object tmp3261_3246 = tmp3246_3231;
    tmp3261_3246['²'] = 'հ';
    tmp3261_3246['³'] = 'հ';
    Object tmp3276_3261 = tmp3261_3246;
    Object tmp3276_3261 = tmp3261_3246;
    tmp3276_3261['´'] = '֐';
    tmp3276_3261['µ'] = '֐';
    Object tmp3291_3276 = tmp3276_3261;
    Object tmp3291_3276 = tmp3276_3261;
    tmp3291_3276['¶'] = '֐';
    tmp3291_3276['·'] = '֐';
    Object tmp3306_3291 = tmp3291_3276;
    Object tmp3306_3291 = tmp3291_3276;
    tmp3306_3291['¸'] = 'ʮ';
    tmp3306_3291['¹'] = 'ʮ';
    Object tmp3321_3306 = tmp3306_3291;
    Object tmp3321_3306 = tmp3306_3291;
    tmp3321_3306['º'] = 'ʮ';
    tmp3321_3306['»'] = 'ʮ';
    Object tmp3336_3321 = tmp3321_3306;
    Object tmp3336_3321 = tmp3321_3306;
    tmp3336_3321['¼'] = 'ʮ';
    tmp3336_3321['½'] = 'ʮ';
    Object tmp3351_3336 = tmp3336_3321;
    Object tmp3351_3336 = tmp3336_3321;
    tmp3351_3336['¾'] = 'ʮ';
    tmp3351_3336['¿'] = 'ʮ';
    Object tmp3366_3351 = tmp3351_3336;
    Object tmp3366_3351 = tmp3351_3336;
    tmp3366_3351['À'] = 'Ύ';
    tmp3366_3351['Á'] = 'Ύ';
    Object tmp3381_3366 = tmp3366_3351;
    Object tmp3381_3366 = tmp3366_3351;
    tmp3381_3366['Â'] = 'Ύ';
    tmp3381_3366['Ã'] = 'Ύ';
    Object tmp3396_3381 = tmp3381_3366;
    Object tmp3396_3381 = tmp3381_3366;
    tmp3396_3381['Ä'] = 'Ύ';
    tmp3396_3381['Å'] = 'Ύ';
    Object tmp3411_3396 = tmp3396_3381;
    Object tmp3411_3396 = tmp3396_3381;
    tmp3411_3396['Æ'] = 'Ύ';
    tmp3411_3396['Ç'] = 'Ύ';
    Object tmp3426_3411 = tmp3411_3396;
    Object tmp3426_3411 = tmp3411_3396;
    tmp3426_3411['È'] = 'ް';
    tmp3426_3411['É'] = 'ް';
    Object tmp3441_3426 = tmp3426_3411;
    Object tmp3441_3426 = tmp3426_3411;
    tmp3441_3426['Ê'] = 'ް';
    tmp3441_3426['Ë'] = 'ް';
    Object tmp3456_3441 = tmp3441_3426;
    Object tmp3456_3441 = tmp3441_3426;
    tmp3456_3441['Ì'] = 'ߐ';
    tmp3456_3441['Í'] = 'ߐ';
    Object tmp3471_3456 = tmp3456_3441;
    Object tmp3471_3456 = tmp3456_3441;
    tmp3471_3456['Î'] = 'ߐ';
    tmp3471_3456['Ï'] = 'ߐ';
    Object tmp3486_3471 = tmp3471_3456;
    Object tmp3486_3471 = tmp3471_3456;
    tmp3486_3471['Ð'] = '߰';
    tmp3486_3471['Ñ'] = '߰';
    Object tmp3501_3486 = tmp3486_3471;
    Object tmp3501_3486 = tmp3486_3471;
    tmp3501_3486['Ò'] = '߰';
    tmp3501_3486['Ó'] = '߰';
    Object tmp3516_3501 = tmp3501_3486;
    Object tmp3516_3501 = tmp3501_3486;
    tmp3516_3501['Ô'] = 16;
    tmp3516_3501['Õ'] = 16;
    Object tmp3529_3516 = tmp3516_3501;
    Object tmp3529_3516 = tmp3516_3501;
    tmp3529_3516['Ö'] = 16;
    tmp3529_3516['×'] = 16;
    Object tmp3542_3529 = tmp3529_3516;
    Object tmp3542_3529 = tmp3529_3516;
    tmp3542_3529['Ø'] = '⠑';
    tmp3542_3529['Ù'] = '⠑';
    Object tmp3557_3542 = tmp3542_3529;
    Object tmp3557_3542 = tmp3542_3529;
    tmp3557_3542['Ú'] = '⠑';
    tmp3557_3542['Û'] = '⠑';
    Object tmp3572_3557 = tmp3557_3542;
    Object tmp3572_3557 = tmp3557_3542;
    tmp3572_3557['Ü'] = '】';
    tmp3572_3557['Ý'] = '】';
    Object tmp3587_3572 = tmp3572_3557;
    Object tmp3587_3572 = tmp3572_3557;
    tmp3587_3572['Þ'] = '】';
    tmp3587_3572['ß'] = '】';
    Object tmp3602_3587 = tmp3587_3572;
    Object tmp3602_3587 = tmp3587_3572;
    tmp3602_3587['à'] = 'Ŋ';
    tmp3602_3587['á'] = 'Ŋ';
    Object tmp3617_3602 = tmp3602_3587;
    Object tmp3617_3602 = tmp3602_3587;
    tmp3617_3602['â'] = 'Ŋ';
    tmp3617_3602['ã'] = 'Ŋ';
    Object tmp3632_3617 = tmp3617_3602;
    Object tmp3632_3617 = tmp3617_3602;
    tmp3632_3617['ä'] = 'Ŋ';
    tmp3632_3617['å'] = 'Ŋ';
    Object tmp3647_3632 = tmp3632_3617;
    Object tmp3647_3632 = tmp3632_3617;
    tmp3647_3632['æ'] = 'Ŋ';
    tmp3647_3632['ç'] = 'Ŋ';
    Object tmp3662_3647 = tmp3647_3632;
    Object tmp3662_3647 = tmp3647_3632;
    tmp3662_3647['è'] = 'Ŋ';
    tmp3662_3647['é'] = 'Ŋ';
    Object tmp3677_3662 = tmp3662_3647;
    Object tmp3677_3662 = tmp3662_3647;
    tmp3677_3662['ê'] = 'Ŋ';
    tmp3677_3662['ë'] = 'Ŋ';
    Object tmp3692_3677 = tmp3677_3662;
    Object tmp3692_3677 = tmp3677_3662;
    tmp3692_3677['ì'] = 'Ŋ';
    tmp3692_3677['í'] = 'Ŋ';
    Object tmp3707_3692 = tmp3692_3677;
    Object tmp3707_3692 = tmp3692_3677;
    tmp3707_3692['î'] = 'Ŋ';
    tmp3707_3692['ï'] = 'Ŋ';
    Object tmp3722_3707 = tmp3707_3692;
    Object tmp3722_3707 = tmp3707_3692;
    tmp3722_3707['ð'] = 'Ŋ';
    tmp3722_3707['ñ'] = 'Ŋ';
    Object tmp3737_3722 = tmp3722_3707;
    Object tmp3737_3722 = tmp3722_3707;
    tmp3737_3722['ò'] = 'Ŋ';
    tmp3737_3722['ó'] = 'Ŋ';
    Object tmp3752_3737 = tmp3737_3722;
    Object tmp3752_3737 = tmp3737_3722;
    tmp3752_3737['ô'] = 'Ŋ';
    tmp3752_3737['õ'] = 'Ŋ';
    Object tmp3767_3752 = tmp3752_3737;
    Object tmp3767_3752 = tmp3752_3737;
    tmp3767_3752['ö'] = 'Ŋ';
    tmp3767_3752['÷'] = 'Ŋ';
    Object tmp3782_3767 = tmp3767_3752;
    Object tmp3782_3767 = tmp3767_3752;
    tmp3782_3767['ø'] = 'Ŋ';
    tmp3782_3767['ù'] = 'Ŋ';
    Object tmp3797_3782 = tmp3782_3767;
    Object tmp3797_3782 = tmp3782_3767;
    tmp3797_3782['ú'] = 'Ŋ';
    tmp3797_3782['û'] = 'Ŋ';
    Object tmp3812_3797 = tmp3797_3782;
    Object tmp3812_3797 = tmp3797_3782;
    tmp3812_3797['ü'] = 'Ŋ';
    tmp3812_3797['ý'] = 'Ŋ';
    Object tmp3827_3812 = tmp3812_3797;
    Object tmp3827_3812 = tmp3812_3797;
    tmp3827_3812['þ'] = 'Ŋ';
    tmp3827_3812['ÿ'] = 'Ŋ';
    Object tmp3842_3827 = tmp3827_3812;
    Object tmp3842_3827 = tmp3827_3812;
    tmp3842_3827['Ā'] = 'Ū';
    tmp3842_3827['ā'] = 'Ū';
    Object tmp3857_3842 = tmp3842_3827;
    Object tmp3857_3842 = tmp3842_3827;
    tmp3857_3842['Ă'] = 'Ū';
    tmp3857_3842['ă'] = 'Ū';
    Object tmp3872_3857 = tmp3857_3842;
    Object tmp3872_3857 = tmp3857_3842;
    tmp3872_3857['Ą'] = 'Ū';
    tmp3872_3857['ą'] = 'Ū';
    Object tmp3887_3872 = tmp3872_3857;
    Object tmp3887_3872 = tmp3872_3857;
    tmp3887_3872['Ć'] = 'Ū';
    tmp3887_3872['ć'] = 'Ū';
    Object tmp3902_3887 = tmp3887_3872;
    Object tmp3902_3887 = tmp3887_3872;
    tmp3902_3887['Ĉ'] = 'Ū';
    tmp3902_3887['ĉ'] = 'Ū';
    Object tmp3917_3902 = tmp3902_3887;
    Object tmp3917_3902 = tmp3902_3887;
    tmp3917_3902['Ċ'] = 'Ū';
    tmp3917_3902['ċ'] = 'Ū';
    Object tmp3932_3917 = tmp3917_3902;
    Object tmp3932_3917 = tmp3917_3902;
    tmp3932_3917['Č'] = 'Ū';
    tmp3932_3917['č'] = 'Ū';
    Object tmp3947_3932 = tmp3932_3917;
    Object tmp3947_3932 = tmp3932_3917;
    tmp3947_3932['Ď'] = 'Ū';
    tmp3947_3932['ď'] = 'Ū';
    Object tmp3962_3947 = tmp3947_3932;
    Object tmp3962_3947 = tmp3947_3932;
    tmp3962_3947['Đ'] = 'Ū';
    tmp3962_3947['đ'] = 'Ū';
    Object tmp3977_3962 = tmp3962_3947;
    Object tmp3977_3962 = tmp3962_3947;
    tmp3977_3962['Ē'] = 'Ū';
    tmp3977_3962['ē'] = 'Ū';
    Object tmp3992_3977 = tmp3977_3962;
    Object tmp3992_3977 = tmp3977_3962;
    tmp3992_3977['Ĕ'] = 'Ū';
    tmp3992_3977['ĕ'] = 'Ū';
    Object tmp4007_3992 = tmp3992_3977;
    Object tmp4007_3992 = tmp3992_3977;
    tmp4007_3992['Ė'] = 'Ū';
    tmp4007_3992['ė'] = 'Ū';
    Object tmp4022_4007 = tmp4007_3992;
    Object tmp4022_4007 = tmp4007_3992;
    tmp4022_4007['Ę'] = 'Ū';
    tmp4022_4007['ę'] = 'Ū';
    Object tmp4037_4022 = tmp4022_4007;
    Object tmp4037_4022 = tmp4022_4007;
    tmp4037_4022['Ě'] = 'Ū';
    tmp4037_4022['ě'] = 'Ū';
    Object tmp4052_4037 = tmp4037_4022;
    Object tmp4052_4037 = tmp4037_4022;
    tmp4052_4037['Ĝ'] = 'Ū';
    tmp4052_4037['ĝ'] = 'Ū';
    Object tmp4067_4052 = tmp4052_4037;
    Object tmp4067_4052 = tmp4052_4037;
    tmp4067_4052['Ğ'] = 'Ū';
    tmp4067_4052['ğ'] = 'Ū';
    Object tmp4082_4067 = tmp4067_4052;
    Object tmp4082_4067 = tmp4067_4052;
    tmp4082_4067['Ġ'] = 'ͮ';
    tmp4082_4067['ġ'] = 'ͮ';
    Object tmp4097_4082 = tmp4082_4067;
    Object tmp4097_4082 = tmp4082_4067;
    tmp4097_4082['Ģ'] = 'ͮ';
    tmp4097_4082['ģ'] = 'ͮ';
    Object tmp4112_4097 = tmp4097_4082;
    Object tmp4112_4097 = tmp4097_4082;
    tmp4112_4097['Ĥ'] = 'ͮ';
    tmp4112_4097['ĥ'] = 'ͮ';
    Object tmp4127_4112 = tmp4112_4097;
    Object tmp4127_4112 = tmp4112_4097;
    tmp4127_4112['Ħ'] = 'ͮ';
    tmp4127_4112['ħ'] = 'ͮ';
    Object tmp4142_4127 = tmp4127_4112;
    Object tmp4142_4127 = tmp4127_4112;
    tmp4142_4127['Ĩ'] = 'ݰ';
    tmp4142_4127['ĩ'] = 'ݰ';
    Object tmp4157_4142 = tmp4142_4127;
    Object tmp4157_4142 = tmp4142_4127;
    tmp4157_4142['Ī'] = 'ݰ';
    tmp4157_4142['ī'] = 'ݰ';
    Object tmp4172_4157 = tmp4157_4142;
    Object tmp4172_4157 = tmp4157_4142;
    tmp4172_4157['Ĭ'] = 'ސ';
    tmp4172_4157['ĭ'] = 'ސ';
    Object tmp4187_4172 = tmp4172_4157;
    Object tmp4187_4172 = tmp4172_4157;
    tmp4187_4172['Į'] = 'ސ';
    tmp4187_4172['į'] = 'ސ';
    Object tmp4202_4187 = tmp4187_4172;
    Object tmp4202_4187 = tmp4187_4172;
    tmp4202_4187['İ'] = '렓';
    tmp4202_4187['ı'] = '렓';
    Object tmp4217_4202 = tmp4202_4187;
    Object tmp4217_4202 = tmp4202_4187;
    tmp4217_4202['Ĳ'] = '쀓';
    tmp4217_4202['ĳ'] = '쀓';
    Object tmp4232_4217 = tmp4217_4202;
    Object tmp4232_4217 = tmp4217_4202;
    tmp4232_4217['Ĵ'] = '젓';
    tmp4232_4217['ĵ'] = '젓';
    Object tmp4247_4232 = tmp4232_4217;
    Object tmp4247_4232 = tmp4232_4217;
    tmp4247_4232['Ķ'] = '?';
    tmp4247_4232['ķ'] = '?';
    Object tmp4262_4247 = tmp4247_4232;
    Object tmp4262_4247 = tmp4247_4232;
    tmp4262_4247['ĸ'] = 'Ɏ';
    tmp4262_4247['Ĺ'] = 'Ɏ';
    Object tmp4277_4262 = tmp4262_4247;
    Object tmp4277_4262 = tmp4262_4247;
    tmp4277_4262['ĺ'] = 'Ɏ';
    tmp4277_4262['Ļ'] = 'Ɏ';
    Object tmp4292_4277 = tmp4277_4262;
    Object tmp4292_4277 = tmp4277_4262;
    tmp4292_4277['ļ'] = 'Ɏ';
    tmp4292_4277['Ľ'] = 'Ɏ';
    Object tmp4307_4292 = tmp4292_4277;
    Object tmp4307_4292 = tmp4292_4277;
    tmp4307_4292['ľ'] = 'Ɏ';
    tmp4307_4292['Ŀ'] = 'Ɏ';
    Object tmp4322_4307 = tmp4307_4292;
    Object tmp4322_4307 = tmp4307_4292;
    tmp4322_4307['ŀ'] = '̎';
    tmp4322_4307['Ł'] = '̎';
    Object tmp4337_4322 = tmp4322_4307;
    Object tmp4337_4322 = tmp4322_4307;
    tmp4337_4322['ł'] = '̎';
    tmp4337_4322['Ń'] = '̎';
    Object tmp4352_4337 = tmp4337_4322;
    Object tmp4352_4337 = tmp4337_4322;
    tmp4352_4337['ń'] = '̎';
    tmp4352_4337['Ņ'] = '̎';
    Object tmp4367_4352 = tmp4352_4337;
    Object tmp4367_4352 = tmp4352_4337;
    tmp4367_4352['ņ'] = '̎';
    tmp4367_4352['Ň'] = '̎';
    Object tmp4382_4367 = tmp4367_4352;
    Object tmp4382_4367 = tmp4367_4352;
    tmp4382_4367['ň'] = 'ذ';
    tmp4382_4367['ŉ'] = 'ذ';
    Object tmp4397_4382 = tmp4382_4367;
    Object tmp4397_4382 = tmp4382_4367;
    tmp4397_4382['Ŋ'] = 'ذ';
    tmp4397_4382['ŋ'] = 'ذ';
    Object tmp4412_4397 = tmp4397_4382;
    Object tmp4412_4397 = tmp4397_4382;
    tmp4412_4397['Ō'] = 'ِ';
    tmp4412_4397['ō'] = 'ِ';
    Object tmp4427_4412 = tmp4412_4397;
    Object tmp4427_4412 = tmp4412_4397;
    tmp4427_4412['Ŏ'] = 'ِ';
    tmp4427_4412['ŏ'] = 'ِ';
    Object tmp4442_4427 = tmp4427_4412;
    Object tmp4442_4427 = tmp4427_4412;
    tmp4442_4427['Ő'] = 'ٰ';
    tmp4442_4427['ő'] = 'ٰ';
    Object tmp4457_4442 = tmp4442_4427;
    Object tmp4457_4442 = tmp4442_4427;
    tmp4457_4442['Œ'] = 'ٰ';
    tmp4457_4442['œ'] = 'ٰ';
    Object tmp4472_4457 = tmp4457_4442;
    Object tmp4472_4457 = tmp4457_4442;
    tmp4472_4457['Ŕ'] = 'ڐ';
    tmp4472_4457['ŕ'] = 'ڐ';
    Object tmp4487_4472 = tmp4472_4457;
    Object tmp4487_4472 = tmp4472_4457;
    tmp4487_4472['Ŗ'] = 'ڐ';
    tmp4487_4472['ŗ'] = 'ڐ';
    Object tmp4502_4487 = tmp4487_4472;
    Object tmp4502_4487 = tmp4487_4472;
    tmp4502_4487['Ř'] = '̮';
    tmp4502_4487['ř'] = '̮';
    Object tmp4517_4502 = tmp4502_4487;
    Object tmp4517_4502 = tmp4502_4487;
    tmp4517_4502['Ś'] = '̮';
    tmp4517_4502['ś'] = '̮';
    Object tmp4532_4517 = tmp4517_4502;
    Object tmp4532_4517 = tmp4517_4502;
    tmp4532_4517['Ŝ'] = '̮';
    tmp4532_4517['ŝ'] = '̮';
    Object tmp4547_4532 = tmp4532_4517;
    Object tmp4547_4532 = tmp4532_4517;
    tmp4547_4532['Ş'] = '̮';
    tmp4547_4532['ş'] = '̮';
    Object tmp4562_4547 = tmp4547_4532;
    Object tmp4562_4547 = tmp4547_4532;
    tmp4562_4547['Š'] = '۰';
    tmp4562_4547['š'] = '۰';
    Object tmp4577_4562 = tmp4562_4547;
    Object tmp4577_4562 = tmp4562_4547;
    tmp4577_4562['Ţ'] = '۰';
    tmp4577_4562['ţ'] = '۰';
    Object tmp4592_4577 = tmp4577_4562;
    Object tmp4592_4577 = tmp4577_4562;
    tmp4592_4577['Ť'] = 'ܐ';
    tmp4592_4577['ť'] = 'ܐ';
    Object tmp4607_4592 = tmp4592_4577;
    Object tmp4607_4592 = tmp4592_4577;
    tmp4607_4592['Ŧ'] = 'ܐ';
    tmp4607_4592['ŧ'] = 'ܐ';
    Object tmp4622_4607 = tmp4607_4592;
    Object tmp4622_4607 = tmp4607_4592;
    tmp4622_4607['Ũ'] = 'ܰ';
    tmp4622_4607['ũ'] = 'ܰ';
    Object tmp4637_4622 = tmp4622_4607;
    Object tmp4637_4622 = tmp4622_4607;
    tmp4637_4622['Ū'] = 'ܰ';
    tmp4637_4622['ū'] = 'ܰ';
    Object tmp4652_4637 = tmp4637_4622;
    Object tmp4652_4637 = tmp4637_4622;
    tmp4652_4637['Ŭ'] = 'ݐ';
    tmp4652_4637['ŭ'] = 'ݐ';
    Object tmp4667_4652 = tmp4652_4637;
    Object tmp4667_4652 = tmp4652_4637;
    tmp4667_4652['Ů'] = 'ݐ';
    tmp4667_4652['ů'] = 'ݐ';
    Object tmp4682_4667 = tmp4667_4652;
    Object tmp4682_4667 = tmp4667_4652;
    tmp4682_4667['Ű'] = '᠍';
    tmp4682_4667['ű'] = '᠍';
    Object tmp4697_4682 = tmp4682_4667;
    Object tmp4697_4682 = tmp4682_4667;
    tmp4697_4682['Ų'] = '᠍';
    tmp4697_4682['ų'] = '᠍';
    Object tmp4712_4697 = tmp4697_4682;
    Object tmp4712_4697 = tmp4697_4682;
    tmp4712_4697['Ŵ'] = '᠍';
    tmp4712_4697['ŵ'] = '᠍';
    Object tmp4727_4712 = tmp4712_4697;
    Object tmp4727_4712 = tmp4712_4697;
    tmp4727_4712['Ŷ'] = '᠍';
    tmp4727_4712['ŷ'] = '᠍';
    Object tmp4742_4727 = tmp4727_4712;
    Object tmp4742_4727 = tmp4727_4712;
    tmp4742_4727['Ÿ'] = '᠍';
    tmp4742_4727['Ź'] = '᠍';
    Object tmp4757_4742 = tmp4742_4727;
    Object tmp4757_4742 = tmp4742_4727;
    tmp4757_4742['ź'] = '᠍';
    tmp4757_4742['Ż'] = '᠍';
    Object tmp4772_4757 = tmp4757_4742;
    Object tmp4772_4757 = tmp4757_4742;
    tmp4772_4757['ż'] = '᠍';
    tmp4772_4757['Ž'] = '᠍';
    Object tmp4787_4772 = tmp4772_4757;
    Object tmp4787_4772 = tmp4772_4757;
    tmp4787_4772['ž'] = '᠍';
    tmp4787_4772['ſ'] = '᠍';
    Object tmp4802_4787 = tmp4787_4772;
    Object tmp4802_4787 = tmp4787_4772;
    tmp4802_4787['ƀ'] = '퀍';
    tmp4802_4787['Ɓ'] = '퀍';
    Object tmp4817_4802 = tmp4802_4787;
    Object tmp4817_4802 = tmp4802_4787;
    tmp4817_4802['Ƃ'] = '퀍';
    tmp4817_4802['ƃ'] = '퀍';
    Object tmp4832_4817 = tmp4817_4802;
    Object tmp4832_4817 = tmp4817_4802;
    tmp4832_4817['Ƅ'] = '퀍';
    tmp4832_4817['ƅ'] = '퀍';
    Object tmp4847_4832 = tmp4832_4817;
    Object tmp4847_4832 = tmp4832_4817;
    tmp4847_4832['Ɔ'] = '퀍';
    tmp4847_4832['Ƈ'] = '퀍';
    Object tmp4862_4847 = tmp4847_4832;
    Object tmp4862_4847 = tmp4847_4832;
    tmp4862_4847['ƈ'] = '퀍';
    tmp4862_4847['Ɖ'] = '퀍';
    Object tmp4877_4862 = tmp4862_4847;
    Object tmp4877_4862 = tmp4862_4847;
    tmp4877_4862['Ɗ'] = '퀍';
    tmp4877_4862['Ƌ'] = '퀍';
    Object tmp4892_4877 = tmp4877_4862;
    Object tmp4892_4877 = tmp4877_4862;
    tmp4892_4877['ƌ'] = '퀍';
    tmp4892_4877['ƍ'] = '퀍';
    Object tmp4907_4892 = tmp4892_4877;
    Object tmp4907_4892 = tmp4892_4877;
    tmp4907_4892['Ǝ'] = '퀍';
    tmp4907_4892['Ə'] = '퀍';
    Object tmp4922_4907 = tmp4907_4892;
    Object tmp4922_4907 = tmp4907_4892;
    tmp4922_4907['Ɛ'] = '㠑';
    tmp4922_4907['Ƒ'] = '㠑';
    Object tmp4937_4922 = tmp4922_4907;
    Object tmp4937_4922 = tmp4922_4907;
    tmp4937_4922['ƒ'] = '㠑';
    tmp4937_4922['Ɠ'] = '㠑';
    Object tmp4952_4937 = tmp4937_4922;
    Object tmp4952_4937 = tmp4937_4922;
    tmp4952_4937['Ɣ'] = '䀑';
    tmp4952_4937['ƕ'] = '䀑';
    Object tmp4967_4952 = tmp4952_4937;
    Object tmp4967_4952 = tmp4952_4937;
    tmp4967_4952['Ɩ'] = '䀑';
    tmp4967_4952['Ɨ'] = '䀑';
    Object tmp4982_4967 = tmp4967_4952;
    Object tmp4982_4967 = tmp4967_4952;
    tmp4982_4967['Ƙ'] = '堓';
    tmp4982_4967['ƙ'] = '堓';
    Object tmp4997_4982 = tmp4982_4967;
    Object tmp4997_4982 = tmp4982_4967;
    tmp4997_4982['ƚ'] = '怓';
    tmp4997_4982['ƛ'] = '怓';
    Object tmp5012_4997 = tmp4997_4982;
    Object tmp5012_4997 = tmp4997_4982;
    tmp5012_4997['Ɯ'] = '們';
    tmp5012_4997['Ɲ'] = '們';
    Object tmp5027_5012 = tmp5012_4997;
    Object tmp5027_5012 = tmp5012_4997;
    tmp5027_5012['ƞ'] = '們';
    tmp5027_5012['Ɵ'] = '們';
    Object tmp5042_5027 = tmp5027_5012;
    Object tmp5042_5027 = tmp5027_5012;
    tmp5042_5027['Ơ'] = '䠑';
    tmp5042_5027['ơ'] = '䠑';
    Object tmp5057_5042 = tmp5042_5027;
    Object tmp5057_5042 = tmp5042_5027;
    tmp5057_5042['Ƣ'] = '䠑';
    tmp5057_5042['ƣ'] = '䠑';
    Object tmp5072_5057 = tmp5057_5042;
    Object tmp5072_5057 = tmp5057_5042;
    tmp5072_5057['Ƥ'] = '栓';
    tmp5072_5057['ƥ'] = '栓';
    Object tmp5087_5072 = tmp5072_5057;
    Object tmp5087_5072 = tmp5072_5057;
    tmp5087_5072['Ʀ'] = '瀓';
    tmp5087_5072['Ƨ'] = '瀓';
    Object tmp5102_5087 = tmp5087_5072;
    Object tmp5102_5087 = tmp5087_5072;
    tmp5102_5087['ƨ'] = '砓';
    tmp5102_5087['Ʃ'] = '砓';
    Object tmp5117_5102 = tmp5102_5087;
    Object tmp5117_5102 = tmp5102_5087;
    tmp5117_5102['ƪ'] = '耓';
    tmp5117_5102['ƫ'] = '耓';
    Object tmp5132_5117 = tmp5117_5102;
    Object tmp5132_5117 = tmp5117_5102;
    tmp5132_5117['Ƭ'] = '蠓';
    tmp5132_5117['ƭ'] = '蠓';
    Object tmp5147_5132 = tmp5132_5117;
    Object tmp5147_5132 = tmp5132_5117;
    tmp5147_5132['Ʈ'] = '逓';
    tmp5147_5132['Ư'] = '逓';
    Object tmp5162_5147 = tmp5147_5132;
    Object tmp5162_5147 = tmp5147_5132;
    tmp5162_5147['ư'] = '頓';
    tmp5162_5147['Ʊ'] = '頓';
    Object tmp5177_5162 = tmp5162_5147;
    Object tmp5177_5162 = tmp5162_5147;
    tmp5177_5162['Ʋ'] = 'ꀓ';
    tmp5177_5162['Ƴ'] = 'ꀓ';
    Object tmp5192_5177 = tmp5177_5162;
    Object tmp5192_5177 = tmp5177_5162;
    tmp5192_5177['ƴ'] = 'ꠓ';
    tmp5192_5177['Ƶ'] = 'ꠓ';
    Object tmp5207_5192 = tmp5192_5177;
    Object tmp5207_5192 = tmp5192_5177;
    tmp5207_5192['ƶ'] = '뀓';
    tmp5207_5192['Ʒ'] = '뀓';
    Object tmp5222_5207 = tmp5207_5192;
    Object tmp5222_5207 = tmp5207_5192;
    tmp5222_5207['Ƹ'] = '‏';
    tmp5222_5207['ƹ'] = '‏';
    Object tmp5237_5222 = tmp5222_5207;
    Object tmp5237_5222 = tmp5222_5207;
    tmp5237_5222['ƺ'] = '‏';
    tmp5237_5222['ƻ'] = '‏';
    Object tmp5252_5237 = tmp5237_5222;
    Object tmp5252_5237 = tmp5237_5222;
    tmp5252_5237['Ƽ'] = '‏';
    tmp5252_5237['ƽ'] = '‏';
    Object tmp5267_5252 = tmp5252_5237;
    Object tmp5267_5252 = tmp5252_5237;
    tmp5267_5252['ƾ'] = '‏';
    tmp5267_5252['ƿ'] = '‏';
    Object tmp5282_5267 = tmp5267_5252;
    Object tmp5282_5267 = tmp5267_5252;
    tmp5282_5267['ǀ'] = 72;
    tmp5282_5267['ǁ'] = 72;
    Object tmp5295_5282 = tmp5282_5267;
    Object tmp5295_5282 = tmp5282_5267;
    tmp5295_5282['ǂ'] = 72;
    tmp5295_5282['ǃ'] = 72;
    Object tmp5308_5295 = tmp5295_5282;
    Object tmp5308_5295 = tmp5295_5282;
    tmp5308_5295['Ǆ'] = 72;
    tmp5308_5295['ǅ'] = 72;
    Object tmp5321_5308 = tmp5308_5295;
    Object tmp5321_5308 = tmp5308_5295;
    tmp5321_5308['ǆ'] = 72;
    tmp5321_5308['Ǉ'] = 72;
    Object tmp5334_5321 = tmp5321_5308;
    Object tmp5334_5321 = tmp5321_5308;
    tmp5334_5321['ǈ'] = 72;
    tmp5334_5321['ǉ'] = 72;
    Object tmp5347_5334 = tmp5334_5321;
    Object tmp5347_5334 = tmp5334_5321;
    tmp5347_5334['Ǌ'] = 72;
    tmp5347_5334['ǋ'] = 72;
    Object tmp5360_5347 = tmp5347_5334;
    Object tmp5360_5347 = tmp5347_5334;
    tmp5360_5347['ǌ'] = 72;
    tmp5360_5347['Ǎ'] = 72;
    Object tmp5373_5360 = tmp5360_5347;
    Object tmp5373_5360 = tmp5360_5347;
    tmp5373_5360['ǎ'] = 72;
    tmp5373_5360['Ǐ'] = 72;
    Object tmp5386_5373 = tmp5373_5360;
    Object tmp5386_5373 = tmp5373_5360;
    tmp5386_5373['ǐ'] = 72;
    tmp5386_5373['Ǒ'] = 72;
    Object tmp5399_5386 = tmp5386_5373;
    Object tmp5399_5386 = tmp5386_5373;
    tmp5399_5386['ǒ'] = 72;
    tmp5399_5386['Ǔ'] = 72;
    Object tmp5412_5399 = tmp5399_5386;
    Object tmp5412_5399 = tmp5399_5386;
    tmp5412_5399['ǔ'] = 72;
    tmp5412_5399['Ǖ'] = 72;
    Object tmp5425_5412 = tmp5412_5399;
    Object tmp5425_5412 = tmp5412_5399;
    tmp5425_5412['ǖ'] = 72;
    tmp5425_5412['Ǘ'] = 72;
    Object tmp5438_5425 = tmp5425_5412;
    Object tmp5438_5425 = tmp5425_5412;
    tmp5438_5425['ǘ'] = 72;
    tmp5438_5425['Ǚ'] = 72;
    Object tmp5451_5438 = tmp5438_5425;
    Object tmp5451_5438 = tmp5438_5425;
    tmp5451_5438['ǚ'] = 72;
    tmp5451_5438['Ǜ'] = 72;
    Object tmp5464_5451 = tmp5451_5438;
    Object tmp5464_5451 = tmp5451_5438;
    tmp5464_5451['ǜ'] = 72;
    tmp5464_5451['ǝ'] = 72;
    Object tmp5477_5464 = tmp5464_5451;
    Object tmp5477_5464 = tmp5464_5451;
    tmp5477_5464['Ǟ'] = 72;
    tmp5477_5464['ǟ'] = 72;
    Object tmp5490_5477 = tmp5477_5464;
    Object tmp5490_5477 = tmp5477_5464;
    tmp5490_5477['Ǡ'] = 72;
    tmp5490_5477['ǡ'] = 72;
    Object tmp5503_5490 = tmp5490_5477;
    Object tmp5503_5490 = tmp5490_5477;
    tmp5503_5490['Ǣ'] = 72;
    tmp5503_5490['ǣ'] = 72;
    Object tmp5516_5503 = tmp5503_5490;
    Object tmp5516_5503 = tmp5503_5490;
    tmp5516_5503['Ǥ'] = 72;
    tmp5516_5503['ǥ'] = 72;
    Object tmp5529_5516 = tmp5516_5503;
    Object tmp5529_5516 = tmp5516_5503;
    tmp5529_5516['Ǧ'] = 72;
    tmp5529_5516['ǧ'] = 72;
    Object tmp5542_5529 = tmp5529_5516;
    Object tmp5542_5529 = tmp5529_5516;
    tmp5542_5529['Ǩ'] = 72;
    tmp5542_5529['ǩ'] = 72;
    Object tmp5555_5542 = tmp5542_5529;
    Object tmp5555_5542 = tmp5542_5529;
    tmp5555_5542['Ǫ'] = 72;
    tmp5555_5542['ǫ'] = 72;
    Object tmp5568_5555 = tmp5555_5542;
    Object tmp5568_5555 = tmp5555_5542;
    tmp5568_5555['Ǭ'] = 72;
    tmp5568_5555['ǭ'] = 72;
    Object tmp5581_5568 = tmp5568_5555;
    Object tmp5581_5568 = tmp5568_5555;
    tmp5581_5568['Ǯ'] = 72;
    tmp5581_5568['ǯ'] = 72;
    Object tmp5594_5581 = tmp5581_5568;
    Object tmp5594_5581 = tmp5581_5568;
    tmp5594_5581['ǰ'] = 72;
    tmp5594_5581['Ǳ'] = 72;
    Object tmp5607_5594 = tmp5594_5581;
    Object tmp5607_5594 = tmp5594_5581;
    tmp5607_5594['ǲ'] = 72;
    tmp5607_5594['ǳ'] = 72;
    Object tmp5620_5607 = tmp5607_5594;
    Object tmp5620_5607 = tmp5607_5594;
    tmp5620_5607['Ǵ'] = 72;
    tmp5620_5607['ǵ'] = 72;
    Object tmp5633_5620 = tmp5620_5607;
    Object tmp5633_5620 = tmp5620_5607;
    tmp5633_5620['Ƕ'] = 72;
    tmp5633_5620['Ƿ'] = 72;
    Object tmp5646_5633 = tmp5633_5620;
    Object tmp5646_5633 = tmp5633_5620;
    tmp5646_5633['Ǹ'] = 72;
    tmp5646_5633['ǹ'] = 72;
    Object tmp5659_5646 = tmp5646_5633;
    Object tmp5659_5646 = tmp5646_5633;
    tmp5659_5646['Ǻ'] = 72;
    tmp5659_5646['ǻ'] = 72;
    Object tmp5672_5659 = tmp5659_5646;
    Object tmp5672_5659 = tmp5659_5646;
    tmp5672_5659['Ǽ'] = 72;
    tmp5672_5659['ǽ'] = 72;
    Object tmp5685_5672 = tmp5672_5659;
    Object tmp5685_5672 = tmp5672_5659;
    tmp5685_5672['Ǿ'] = 72;
    tmp5685_5672['ǿ'] = 72;
    Object tmp5698_5685 = tmp5685_5672;
    Object tmp5698_5685 = tmp5685_5672;
    tmp5698_5685['Ȁ'] = 104;
    tmp5698_5685['ȁ'] = 104;
    Object tmp5711_5698 = tmp5698_5685;
    Object tmp5711_5698 = tmp5698_5685;
    tmp5711_5698['Ȃ'] = 104;
    tmp5711_5698['ȃ'] = 104;
    Object tmp5724_5711 = tmp5711_5698;
    Object tmp5724_5711 = tmp5711_5698;
    tmp5724_5711['Ȅ'] = 104;
    tmp5724_5711['ȅ'] = 104;
    Object tmp5737_5724 = tmp5724_5711;
    Object tmp5737_5724 = tmp5724_5711;
    tmp5737_5724['Ȇ'] = 104;
    tmp5737_5724['ȇ'] = 104;
    Object tmp5750_5737 = tmp5737_5724;
    Object tmp5750_5737 = tmp5737_5724;
    tmp5750_5737['Ȉ'] = 104;
    tmp5750_5737['ȉ'] = 104;
    Object tmp5763_5750 = tmp5750_5737;
    Object tmp5763_5750 = tmp5750_5737;
    tmp5763_5750['Ȋ'] = 104;
    tmp5763_5750['ȋ'] = 104;
    Object tmp5776_5763 = tmp5763_5750;
    Object tmp5776_5763 = tmp5763_5750;
    tmp5776_5763['Ȍ'] = 104;
    tmp5776_5763['ȍ'] = 104;
    Object tmp5789_5776 = tmp5776_5763;
    Object tmp5789_5776 = tmp5776_5763;
    tmp5789_5776['Ȏ'] = 104;
    tmp5789_5776['ȏ'] = 104;
    Object tmp5802_5789 = tmp5789_5776;
    Object tmp5802_5789 = tmp5789_5776;
    tmp5802_5789['Ȑ'] = 104;
    tmp5802_5789['ȑ'] = 104;
    Object tmp5815_5802 = tmp5802_5789;
    Object tmp5815_5802 = tmp5802_5789;
    tmp5815_5802['Ȓ'] = 104;
    tmp5815_5802['ȓ'] = 104;
    Object tmp5828_5815 = tmp5815_5802;
    Object tmp5828_5815 = tmp5815_5802;
    tmp5828_5815['Ȕ'] = 104;
    tmp5828_5815['ȕ'] = 104;
    Object tmp5841_5828 = tmp5828_5815;
    Object tmp5841_5828 = tmp5828_5815;
    tmp5841_5828['Ȗ'] = 104;
    tmp5841_5828['ȗ'] = 104;
    Object tmp5854_5841 = tmp5841_5828;
    Object tmp5854_5841 = tmp5841_5828;
    tmp5854_5841['Ș'] = 104;
    tmp5854_5841['ș'] = 104;
    Object tmp5867_5854 = tmp5854_5841;
    Object tmp5867_5854 = tmp5854_5841;
    tmp5867_5854['Ț'] = 104;
    tmp5867_5854['ț'] = 104;
    Object tmp5880_5867 = tmp5867_5854;
    Object tmp5880_5867 = tmp5867_5854;
    tmp5880_5867['Ȝ'] = 104;
    tmp5880_5867['ȝ'] = 104;
    Object tmp5893_5880 = tmp5880_5867;
    Object tmp5893_5880 = tmp5880_5867;
    tmp5893_5880['Ȟ'] = 104;
    tmp5893_5880['ȟ'] = 104;
    Object tmp5906_5893 = tmp5893_5880;
    Object tmp5906_5893 = tmp5893_5880;
    tmp5906_5893['Ƞ'] = 104;
    tmp5906_5893['ȡ'] = 104;
    Object tmp5919_5906 = tmp5906_5893;
    Object tmp5919_5906 = tmp5906_5893;
    tmp5919_5906['Ȣ'] = 104;
    tmp5919_5906['ȣ'] = 104;
    Object tmp5932_5919 = tmp5919_5906;
    Object tmp5932_5919 = tmp5919_5906;
    tmp5932_5919['Ȥ'] = 104;
    tmp5932_5919['ȥ'] = 104;
    Object tmp5945_5932 = tmp5932_5919;
    Object tmp5945_5932 = tmp5932_5919;
    tmp5945_5932['Ȧ'] = 104;
    tmp5945_5932['ȧ'] = 104;
    Object tmp5958_5945 = tmp5945_5932;
    Object tmp5958_5945 = tmp5945_5932;
    tmp5958_5945['Ȩ'] = 104;
    tmp5958_5945['ȩ'] = 104;
    Object tmp5971_5958 = tmp5958_5945;
    Object tmp5971_5958 = tmp5958_5945;
    tmp5971_5958['Ȫ'] = 104;
    tmp5971_5958['ȫ'] = 104;
    Object tmp5984_5971 = tmp5971_5958;
    Object tmp5984_5971 = tmp5971_5958;
    tmp5984_5971['Ȭ'] = 104;
    tmp5984_5971['ȭ'] = 104;
    Object tmp5997_5984 = tmp5984_5971;
    Object tmp5997_5984 = tmp5984_5971;
    tmp5997_5984['Ȯ'] = 104;
    tmp5997_5984['ȯ'] = 104;
    Object tmp6010_5997 = tmp5997_5984;
    Object tmp6010_5997 = tmp5997_5984;
    tmp6010_5997['Ȱ'] = 104;
    tmp6010_5997['ȱ'] = 104;
    Object tmp6023_6010 = tmp6010_5997;
    Object tmp6023_6010 = tmp6010_5997;
    tmp6023_6010['Ȳ'] = 104;
    tmp6023_6010['ȳ'] = 104;
    Object tmp6036_6023 = tmp6023_6010;
    Object tmp6036_6023 = tmp6023_6010;
    tmp6036_6023['ȴ'] = 104;
    tmp6036_6023['ȵ'] = 104;
    Object tmp6049_6036 = tmp6036_6023;
    Object tmp6049_6036 = tmp6036_6023;
    tmp6049_6036['ȶ'] = 104;
    tmp6049_6036['ȷ'] = 104;
    Object tmp6062_6049 = tmp6049_6036;
    Object tmp6062_6049 = tmp6049_6036;
    tmp6062_6049['ȸ'] = 104;
    tmp6062_6049['ȹ'] = 104;
    Object tmp6075_6062 = tmp6062_6049;
    Object tmp6075_6062 = tmp6062_6049;
    tmp6075_6062['Ⱥ'] = 104;
    tmp6075_6062['Ȼ'] = 104;
    Object tmp6088_6075 = tmp6075_6062;
    Object tmp6088_6075 = tmp6075_6062;
    tmp6088_6075['ȼ'] = 104;
    tmp6088_6075['Ƚ'] = 104;
    Object tmp6101_6088 = tmp6088_6075;
    Object tmp6101_6088 = tmp6088_6075;
    tmp6101_6088['Ⱦ'] = 104;
    tmp6101_6088['ȿ'] = 104;
    Object tmp6114_6101 = tmp6101_6088;
    Object tmp6114_6101 = tmp6101_6088;
    tmp6114_6101['ɀ'] = 'ဋ';
    tmp6114_6101['Ɂ'] = 'ဋ';
    Object tmp6129_6114 = tmp6114_6101;
    Object tmp6129_6114 = tmp6114_6101;
    tmp6129_6114['ɂ'] = 'ဋ';
    tmp6129_6114['Ƀ'] = 'ဋ';
    Object tmp6144_6129 = tmp6129_6114;
    Object tmp6144_6129 = tmp6129_6114;
    tmp6144_6129['Ʉ'] = 'ဋ';
    tmp6144_6129['Ʌ'] = 'ဋ';
    Object tmp6159_6144 = tmp6144_6129;
    Object tmp6159_6144 = tmp6144_6129;
    tmp6159_6144['Ɇ'] = 'ဋ';
    tmp6159_6144['ɇ'] = 'ဋ';
    Object tmp6174_6159 = tmp6159_6144;
    Object tmp6174_6159 = tmp6159_6144;
    tmp6174_6159['Ɉ'] = 'ဋ';
    tmp6174_6159['ɉ'] = 'ဋ';
    Object tmp6189_6174 = tmp6174_6159;
    Object tmp6189_6174 = tmp6174_6159;
    tmp6189_6174['Ɋ'] = 'ဋ';
    tmp6189_6174['ɋ'] = 'ဋ';
    Object tmp6204_6189 = tmp6189_6174;
    Object tmp6204_6189 = tmp6189_6174;
    tmp6204_6189['Ɍ'] = 'ဋ';
    tmp6204_6189['ɍ'] = 'ဋ';
    Object tmp6219_6204 = tmp6204_6189;
    Object tmp6219_6204 = tmp6204_6189;
    tmp6219_6204['Ɏ'] = 'ဋ';
    tmp6219_6204['ɏ'] = 'ဋ';
    Object tmp6234_6219 = tmp6219_6204;
    Object tmp6234_6219 = tmp6219_6204;
    tmp6234_6219['ɐ'] = 'ဋ';
    tmp6234_6219['ɑ'] = 'ဋ';
    Object tmp6249_6234 = tmp6234_6219;
    Object tmp6249_6234 = tmp6234_6219;
    tmp6249_6234['ɒ'] = 'ဋ';
    tmp6249_6234['ɓ'] = 'ဋ';
    Object tmp6264_6249 = tmp6249_6234;
    Object tmp6264_6249 = tmp6249_6234;
    tmp6264_6249['ɔ'] = 'ဋ';
    tmp6264_6249['ɕ'] = 'ဋ';
    Object tmp6279_6264 = tmp6264_6249;
    Object tmp6279_6264 = tmp6264_6249;
    tmp6279_6264['ɖ'] = 'ဋ';
    tmp6279_6264['ɗ'] = 'ဋ';
    Object tmp6294_6279 = tmp6279_6264;
    Object tmp6294_6279 = tmp6279_6264;
    tmp6294_6279['ɘ'] = 'ဋ';
    tmp6294_6279['ə'] = 'ဋ';
    Object tmp6309_6294 = tmp6294_6279;
    Object tmp6309_6294 = tmp6294_6279;
    tmp6309_6294['ɚ'] = 'ဋ';
    tmp6309_6294['ɛ'] = 'ဋ';
    Object tmp6324_6309 = tmp6309_6294;
    Object tmp6324_6309 = tmp6309_6294;
    tmp6324_6309['ɜ'] = 'ဋ';
    tmp6324_6309['ɝ'] = 'ဋ';
    Object tmp6339_6324 = tmp6324_6309;
    Object tmp6339_6324 = tmp6324_6309;
    tmp6339_6324['ɞ'] = 'ဋ';
    tmp6339_6324['ɟ'] = 'ဋ';
    Object tmp6354_6339 = tmp6339_6324;
    Object tmp6354_6339 = tmp6339_6324;
    tmp6354_6339['ɠ'] = 'Ċ';
    tmp6354_6339['ɡ'] = 'Ċ';
    Object tmp6369_6354 = tmp6354_6339;
    Object tmp6369_6354 = tmp6354_6339;
    tmp6369_6354['ɢ'] = 'Ċ';
    tmp6369_6354['ɣ'] = 'Ċ';
    Object tmp6384_6369 = tmp6369_6354;
    Object tmp6384_6369 = tmp6369_6354;
    tmp6384_6369['ɤ'] = 'Ċ';
    tmp6384_6369['ɥ'] = 'Ċ';
    Object tmp6399_6384 = tmp6384_6369;
    Object tmp6399_6384 = tmp6384_6369;
    tmp6399_6384['ɦ'] = 'Ċ';
    tmp6399_6384['ɧ'] = 'Ċ';
    Object tmp6414_6399 = tmp6399_6384;
    Object tmp6414_6399 = tmp6399_6384;
    tmp6414_6399['ɨ'] = 'Ċ';
    tmp6414_6399['ɩ'] = 'Ċ';
    Object tmp6429_6414 = tmp6414_6399;
    Object tmp6429_6414 = tmp6414_6399;
    tmp6429_6414['ɪ'] = 'Ċ';
    tmp6429_6414['ɫ'] = 'Ċ';
    Object tmp6444_6429 = tmp6429_6414;
    Object tmp6444_6429 = tmp6429_6414;
    tmp6444_6429['ɬ'] = 'Ċ';
    tmp6444_6429['ɭ'] = 'Ċ';
    Object tmp6459_6444 = tmp6444_6429;
    Object tmp6459_6444 = tmp6444_6429;
    tmp6459_6444['ɮ'] = 'Ċ';
    tmp6459_6444['ɯ'] = 'Ċ';
    Object tmp6474_6459 = tmp6459_6444;
    Object tmp6474_6459 = tmp6459_6444;
    tmp6474_6459['ɰ'] = 'Ċ';
    tmp6474_6459['ɱ'] = 'Ċ';
    Object tmp6489_6474 = tmp6474_6459;
    Object tmp6489_6474 = tmp6474_6459;
    tmp6489_6474['ɲ'] = 'Ċ';
    tmp6489_6474['ɳ'] = 'Ċ';
    Object tmp6504_6489 = tmp6489_6474;
    Object tmp6504_6489 = tmp6489_6474;
    tmp6504_6489['ɴ'] = 'Ċ';
    tmp6504_6489['ɵ'] = 'Ċ';
    Object tmp6519_6504 = tmp6504_6489;
    Object tmp6519_6504 = tmp6504_6489;
    tmp6519_6504['ɶ'] = 'Ċ';
    tmp6519_6504['ɷ'] = 'Ċ';
    Object tmp6534_6519 = tmp6519_6504;
    Object tmp6534_6519 = tmp6519_6504;
    tmp6534_6519['ɸ'] = 'Ċ';
    tmp6534_6519['ɹ'] = 'Ċ';
    Object tmp6549_6534 = tmp6534_6519;
    Object tmp6549_6534 = tmp6534_6519;
    tmp6549_6534['ɺ'] = 'Ċ';
    tmp6549_6534['ɻ'] = 'Ċ';
    Object tmp6564_6549 = tmp6549_6534;
    Object tmp6564_6549 = tmp6549_6534;
    tmp6564_6549['ɼ'] = 'Ċ';
    tmp6564_6549['ɽ'] = 'Ċ';
    Object tmp6579_6564 = tmp6564_6549;
    Object tmp6579_6564 = tmp6564_6549;
    tmp6579_6564['ɾ'] = 'Ċ';
    tmp6579_6564['ɿ'] = 'Ċ';
    Object tmp6594_6579 = tmp6579_6564;
    Object tmp6594_6579 = tmp6579_6564;
    tmp6594_6579['ʀ'] = 'Ī';
    tmp6594_6579['ʁ'] = 'Ī';
    Object tmp6609_6594 = tmp6594_6579;
    Object tmp6609_6594 = tmp6594_6579;
    tmp6609_6594['ʂ'] = 'Ī';
    tmp6609_6594['ʃ'] = 'Ī';
    Object tmp6624_6609 = tmp6609_6594;
    Object tmp6624_6609 = tmp6609_6594;
    tmp6624_6609['ʄ'] = 'Ī';
    tmp6624_6609['ʅ'] = 'Ī';
    Object tmp6639_6624 = tmp6624_6609;
    Object tmp6639_6624 = tmp6624_6609;
    tmp6639_6624['ʆ'] = 'Ī';
    tmp6639_6624['ʇ'] = 'Ī';
    Object tmp6654_6639 = tmp6639_6624;
    Object tmp6654_6639 = tmp6639_6624;
    tmp6654_6639['ʈ'] = 'Ī';
    tmp6654_6639['ʉ'] = 'Ī';
    Object tmp6669_6654 = tmp6654_6639;
    Object tmp6669_6654 = tmp6654_6639;
    tmp6669_6654['ʊ'] = 'Ī';
    tmp6669_6654['ʋ'] = 'Ī';
    Object tmp6684_6669 = tmp6669_6654;
    Object tmp6684_6669 = tmp6669_6654;
    tmp6684_6669['ʌ'] = 'Ī';
    tmp6684_6669['ʍ'] = 'Ī';
    Object tmp6699_6684 = tmp6684_6669;
    Object tmp6699_6684 = tmp6684_6669;
    tmp6699_6684['ʎ'] = 'Ī';
    tmp6699_6684['ʏ'] = 'Ī';
    Object tmp6714_6699 = tmp6699_6684;
    Object tmp6714_6699 = tmp6699_6684;
    tmp6714_6699['ʐ'] = 'Ī';
    tmp6714_6699['ʑ'] = 'Ī';
    Object tmp6729_6714 = tmp6714_6699;
    Object tmp6729_6714 = tmp6714_6699;
    tmp6729_6714['ʒ'] = 'Ī';
    tmp6729_6714['ʓ'] = 'Ī';
    Object tmp6744_6729 = tmp6729_6714;
    Object tmp6744_6729 = tmp6729_6714;
    tmp6744_6729['ʔ'] = 'Ī';
    tmp6744_6729['ʕ'] = 'Ī';
    Object tmp6759_6744 = tmp6744_6729;
    Object tmp6759_6744 = tmp6744_6729;
    tmp6759_6744['ʖ'] = 'Ī';
    tmp6759_6744['ʗ'] = 'Ī';
    Object tmp6774_6759 = tmp6759_6744;
    Object tmp6774_6759 = tmp6759_6744;
    tmp6774_6759['ʘ'] = 'Ī';
    tmp6774_6759['ʙ'] = 'Ī';
    Object tmp6789_6774 = tmp6774_6759;
    Object tmp6789_6774 = tmp6774_6759;
    tmp6789_6774['ʚ'] = 'Ī';
    tmp6789_6774['ʛ'] = 'Ī';
    Object tmp6804_6789 = tmp6789_6774;
    Object tmp6804_6789 = tmp6789_6774;
    tmp6804_6789['ʜ'] = 'Ī';
    tmp6804_6789['ʝ'] = 'Ī';
    Object tmp6819_6804 = tmp6804_6789;
    Object tmp6819_6804 = tmp6804_6789;
    tmp6819_6804['ʞ'] = 'Ī';
    tmp6819_6804['ʟ'] = 'Ī';
    Object tmp6834_6819 = tmp6819_6804;
    Object tmp6834_6819 = tmp6819_6804;
    tmp6834_6819['ʠ'] = 'Ȍ';
    tmp6834_6819['ʡ'] = 'Ȍ';
    Object tmp6849_6834 = tmp6834_6819;
    Object tmp6849_6834 = tmp6834_6819;
    tmp6849_6834['ʢ'] = 'Ȍ';
    tmp6849_6834['ʣ'] = 'Ȍ';
    Object tmp6864_6849 = tmp6849_6834;
    Object tmp6864_6849 = tmp6849_6834;
    tmp6864_6849['ʤ'] = 'Ȍ';
    tmp6864_6849['ʥ'] = 'Ȍ';
    Object tmp6879_6864 = tmp6864_6849;
    Object tmp6879_6864 = tmp6864_6849;
    tmp6879_6864['ʦ'] = 'Ȍ';
    tmp6879_6864['ʧ'] = 'Ȍ';
    Object tmp6894_6879 = tmp6879_6864;
    Object tmp6894_6879 = tmp6879_6864;
    tmp6894_6879['ʨ'] = 'Ȍ';
    tmp6894_6879['ʩ'] = 'Ȍ';
    Object tmp6909_6894 = tmp6894_6879;
    Object tmp6909_6894 = tmp6894_6879;
    tmp6909_6894['ʪ'] = 'Ȍ';
    tmp6909_6894['ʫ'] = 'Ȍ';
    Object tmp6924_6909 = tmp6909_6894;
    Object tmp6924_6909 = tmp6909_6894;
    tmp6924_6909['ʬ'] = 'Ȍ';
    tmp6924_6909['ʭ'] = 'Ȍ';
    Object tmp6939_6924 = tmp6924_6909;
    Object tmp6939_6924 = tmp6924_6909;
    tmp6939_6924['ʮ'] = 'Ȍ';
    tmp6939_6924['ʯ'] = 'Ȍ';
    Object tmp6954_6939 = tmp6939_6924;
    Object tmp6954_6939 = tmp6939_6924;
    tmp6954_6939['ʰ'] = 'Ȭ';
    tmp6954_6939['ʱ'] = 'Ȭ';
    Object tmp6969_6954 = tmp6954_6939;
    Object tmp6969_6954 = tmp6954_6939;
    tmp6969_6954['ʲ'] = 'Ȭ';
    tmp6969_6954['ʳ'] = 'Ȭ';
    Object tmp6984_6969 = tmp6969_6954;
    Object tmp6984_6969 = tmp6969_6954;
    tmp6984_6969['ʴ'] = 'Ȭ';
    tmp6984_6969['ʵ'] = 'Ȭ';
    Object tmp6999_6984 = tmp6984_6969;
    Object tmp6999_6984 = tmp6984_6969;
    tmp6999_6984['ʶ'] = 'Ȭ';
    tmp6999_6984['ʷ'] = 'Ȭ';
    Object tmp7014_6999 = tmp6999_6984;
    Object tmp7014_6999 = tmp6999_6984;
    tmp7014_6999['ʸ'] = 'Ȭ';
    tmp7014_6999['ʹ'] = 'Ȭ';
    Object tmp7029_7014 = tmp7014_6999;
    Object tmp7029_7014 = tmp7014_6999;
    tmp7029_7014['ʺ'] = 'Ȭ';
    tmp7029_7014['ʻ'] = 'Ȭ';
    Object tmp7044_7029 = tmp7029_7014;
    Object tmp7044_7029 = tmp7029_7014;
    tmp7044_7029['ʼ'] = 'Ȭ';
    tmp7044_7029['ʽ'] = 'Ȭ';
    Object tmp7059_7044 = tmp7044_7029;
    Object tmp7059_7044 = tmp7044_7029;
    tmp7059_7044['ʾ'] = 'Ȭ';
    tmp7059_7044['ʿ'] = 'Ȭ';
    Object tmp7074_7059 = tmp7059_7044;
    Object tmp7074_7059 = tmp7059_7044;
    tmp7074_7059['ˀ'] = '';
    tmp7074_7059['ˁ'] = '';
    Object tmp7089_7074 = tmp7074_7059;
    Object tmp7089_7074 = tmp7074_7059;
    tmp7089_7074['˂'] = '';
    tmp7089_7074['˃'] = '';
    Object tmp7104_7089 = tmp7089_7074;
    Object tmp7104_7089 = tmp7089_7074;
    tmp7104_7089['˄'] = '';
    tmp7104_7089['˅'] = '';
    Object tmp7119_7104 = tmp7104_7089;
    Object tmp7119_7104 = tmp7104_7089;
    tmp7119_7104['ˆ'] = '';
    tmp7119_7104['ˇ'] = '';
    Object tmp7134_7119 = tmp7119_7104;
    Object tmp7134_7119 = tmp7119_7104;
    tmp7134_7119['ˈ'] = '';
    tmp7134_7119['ˉ'] = '';
    Object tmp7149_7134 = tmp7134_7119;
    Object tmp7149_7134 = tmp7134_7119;
    tmp7149_7134['ˊ'] = '';
    tmp7149_7134['ˋ'] = '';
    Object tmp7164_7149 = tmp7149_7134;
    Object tmp7164_7149 = tmp7149_7134;
    tmp7164_7149['ˌ'] = '';
    tmp7164_7149['ˍ'] = '';
    Object tmp7179_7164 = tmp7164_7149;
    Object tmp7179_7164 = tmp7164_7149;
    tmp7179_7164['ˎ'] = '';
    tmp7179_7164['ˏ'] = '';
    Object tmp7194_7179 = tmp7179_7164;
    Object tmp7194_7179 = tmp7179_7164;
    tmp7194_7179['ː'] = '';
    tmp7194_7179['ˑ'] = '';
    Object tmp7209_7194 = tmp7194_7179;
    Object tmp7209_7194 = tmp7194_7179;
    tmp7209_7194['˒'] = '';
    tmp7209_7194['˓'] = '';
    Object tmp7224_7209 = tmp7209_7194;
    Object tmp7224_7209 = tmp7209_7194;
    tmp7224_7209['˔'] = '';
    tmp7224_7209['˕'] = '';
    Object tmp7239_7224 = tmp7224_7209;
    Object tmp7239_7224 = tmp7224_7209;
    tmp7239_7224['˖'] = '';
    tmp7239_7224['˗'] = '';
    Object tmp7254_7239 = tmp7239_7224;
    Object tmp7254_7239 = tmp7239_7224;
    tmp7254_7239['˘'] = '';
    tmp7254_7239['˙'] = '';
    Object tmp7269_7254 = tmp7254_7239;
    Object tmp7269_7254 = tmp7254_7239;
    tmp7269_7254['˚'] = '';
    tmp7269_7254['˛'] = '';
    Object tmp7284_7269 = tmp7269_7254;
    Object tmp7284_7269 = tmp7269_7254;
    tmp7284_7269['˜'] = '';
    tmp7284_7269['˝'] = '';
    Object tmp7299_7284 = tmp7284_7269;
    Object tmp7299_7284 = tmp7284_7269;
    tmp7299_7284['˞'] = '';
    tmp7299_7284['˟'] = '';
    Object tmp7314_7299 = tmp7299_7284;
    Object tmp7314_7299 = tmp7299_7284;
    tmp7314_7299['ˠ'] = '';
    tmp7314_7299['ˡ'] = '';
    Object tmp7329_7314 = tmp7314_7299;
    Object tmp7329_7314 = tmp7314_7299;
    tmp7329_7314['ˢ'] = '';
    tmp7329_7314['ˣ'] = '';
    Object tmp7344_7329 = tmp7329_7314;
    Object tmp7344_7329 = tmp7329_7314;
    tmp7344_7329['ˤ'] = '';
    tmp7344_7329['˥'] = '';
    Object tmp7359_7344 = tmp7344_7329;
    Object tmp7359_7344 = tmp7344_7329;
    tmp7359_7344['˦'] = '';
    tmp7359_7344['˧'] = '';
    Object tmp7374_7359 = tmp7359_7344;
    Object tmp7374_7359 = tmp7359_7344;
    tmp7374_7359['˨'] = '';
    tmp7374_7359['˩'] = '';
    Object tmp7389_7374 = tmp7374_7359;
    Object tmp7389_7374 = tmp7374_7359;
    tmp7389_7374['˪'] = '';
    tmp7389_7374['˫'] = '';
    Object tmp7404_7389 = tmp7389_7374;
    Object tmp7404_7389 = tmp7389_7374;
    tmp7404_7389['ˬ'] = '';
    tmp7404_7389['˭'] = '';
    Object tmp7419_7404 = tmp7404_7389;
    Object tmp7419_7404 = tmp7404_7389;
    tmp7419_7404['ˮ'] = '';
    tmp7419_7404['˯'] = '';
    Object tmp7434_7419 = tmp7419_7404;
    Object tmp7434_7419 = tmp7419_7404;
    tmp7434_7419['˰'] = '';
    tmp7434_7419['˱'] = '';
    Object tmp7449_7434 = tmp7434_7419;
    Object tmp7449_7434 = tmp7434_7419;
    tmp7449_7434['˲'] = '';
    tmp7449_7434['˳'] = '';
    Object tmp7464_7449 = tmp7449_7434;
    Object tmp7464_7449 = tmp7449_7434;
    tmp7464_7449['˴'] = '';
    tmp7464_7449['˵'] = '';
    Object tmp7479_7464 = tmp7464_7449;
    Object tmp7479_7464 = tmp7464_7449;
    tmp7479_7464['˶'] = '';
    tmp7479_7464['˷'] = '';
    Object tmp7494_7479 = tmp7479_7464;
    Object tmp7494_7479 = tmp7479_7464;
    tmp7494_7479['˸'] = '';
    tmp7494_7479['˹'] = '';
    Object tmp7509_7494 = tmp7494_7479;
    Object tmp7509_7494 = tmp7494_7479;
    tmp7509_7494['˺'] = '';
    tmp7509_7494['˻'] = '';
    Object tmp7524_7509 = tmp7509_7494;
    Object tmp7524_7509 = tmp7509_7494;
    tmp7524_7509['˼'] = '';
    tmp7524_7509['˽'] = '';
    Object tmp7539_7524 = tmp7524_7509;
    Object tmp7539_7524 = tmp7524_7509;
    tmp7539_7524['˾'] = '';
    tmp7539_7524['˿'] = '';
    Object tmp7554_7539 = tmp7539_7524;
    Object tmp7554_7539 = tmp7539_7524;
    tmp7554_7539['̀'] = '¨';
    tmp7554_7539['́'] = '¨';
    Object tmp7569_7554 = tmp7554_7539;
    Object tmp7569_7554 = tmp7554_7539;
    tmp7569_7554['̂'] = '¨';
    tmp7569_7554['̃'] = '¨';
    Object tmp7584_7569 = tmp7569_7554;
    Object tmp7584_7569 = tmp7569_7554;
    tmp7584_7569['̄'] = '¨';
    tmp7584_7569['̅'] = '¨';
    Object tmp7599_7584 = tmp7584_7569;
    Object tmp7599_7584 = tmp7584_7569;
    tmp7599_7584['̆'] = '¨';
    tmp7599_7584['̇'] = '¨';
    Object tmp7614_7599 = tmp7599_7584;
    Object tmp7614_7599 = tmp7599_7584;
    tmp7614_7599['̈'] = '¨';
    tmp7614_7599['̉'] = '¨';
    Object tmp7629_7614 = tmp7614_7599;
    Object tmp7629_7614 = tmp7614_7599;
    tmp7629_7614['̊'] = '¨';
    tmp7629_7614['̋'] = '¨';
    Object tmp7644_7629 = tmp7629_7614;
    Object tmp7644_7629 = tmp7629_7614;
    tmp7644_7629['̌'] = '¨';
    tmp7644_7629['̍'] = '¨';
    Object tmp7659_7644 = tmp7644_7629;
    Object tmp7659_7644 = tmp7644_7629;
    tmp7659_7644['̎'] = '¨';
    tmp7659_7644['̏'] = '¨';
    Object tmp7674_7659 = tmp7659_7644;
    Object tmp7674_7659 = tmp7659_7644;
    tmp7674_7659['̐'] = '¨';
    tmp7674_7659['̑'] = '¨';
    Object tmp7689_7674 = tmp7674_7659;
    Object tmp7689_7674 = tmp7674_7659;
    tmp7689_7674['̒'] = '¨';
    tmp7689_7674['̓'] = '¨';
    Object tmp7704_7689 = tmp7689_7674;
    Object tmp7704_7689 = tmp7689_7674;
    tmp7704_7689['̔'] = '¨';
    tmp7704_7689['̕'] = '¨';
    Object tmp7719_7704 = tmp7704_7689;
    Object tmp7719_7704 = tmp7704_7689;
    tmp7719_7704['̖'] = '¨';
    tmp7719_7704['̗'] = '¨';
    Object tmp7734_7719 = tmp7719_7704;
    Object tmp7734_7719 = tmp7719_7704;
    tmp7734_7719['̘'] = '¨';
    tmp7734_7719['̙'] = '¨';
    Object tmp7749_7734 = tmp7734_7719;
    Object tmp7749_7734 = tmp7734_7719;
    tmp7749_7734['̚'] = '¨';
    tmp7749_7734['̛'] = '¨';
    Object tmp7764_7749 = tmp7749_7734;
    Object tmp7764_7749 = tmp7749_7734;
    tmp7764_7749['̜'] = '¨';
    tmp7764_7749['̝'] = '¨';
    Object tmp7779_7764 = tmp7764_7749;
    Object tmp7779_7764 = tmp7764_7749;
    tmp7779_7764['̞'] = '¨';
    tmp7779_7764['̟'] = '¨';
    Object tmp7794_7779 = tmp7779_7764;
    Object tmp7794_7779 = tmp7779_7764;
    tmp7794_7779['̠'] = '¨';
    tmp7794_7779['̡'] = '¨';
    Object tmp7809_7794 = tmp7794_7779;
    Object tmp7809_7794 = tmp7794_7779;
    tmp7809_7794['̢'] = '¨';
    tmp7809_7794['̣'] = '¨';
    Object tmp7824_7809 = tmp7809_7794;
    Object tmp7824_7809 = tmp7809_7794;
    tmp7824_7809['̤'] = '¨';
    tmp7824_7809['̥'] = '¨';
    Object tmp7839_7824 = tmp7824_7809;
    Object tmp7839_7824 = tmp7824_7809;
    tmp7839_7824['̦'] = '¨';
    tmp7839_7824['̧'] = '¨';
    Object tmp7854_7839 = tmp7839_7824;
    Object tmp7854_7839 = tmp7839_7824;
    tmp7854_7839['̨'] = '¨';
    tmp7854_7839['̩'] = '¨';
    Object tmp7869_7854 = tmp7854_7839;
    Object tmp7869_7854 = tmp7854_7839;
    tmp7869_7854['̪'] = '¨';
    tmp7869_7854['̫'] = '¨';
    Object tmp7884_7869 = tmp7869_7854;
    Object tmp7884_7869 = tmp7869_7854;
    tmp7884_7869['̬'] = '¨';
    tmp7884_7869['̭'] = '¨';
    Object tmp7899_7884 = tmp7884_7869;
    Object tmp7899_7884 = tmp7884_7869;
    tmp7899_7884['̮'] = '¨';
    tmp7899_7884['̯'] = '¨';
    Object tmp7914_7899 = tmp7899_7884;
    Object tmp7914_7899 = tmp7899_7884;
    tmp7914_7899['̰'] = '¨';
    tmp7914_7899['̱'] = '¨';
    Object tmp7929_7914 = tmp7914_7899;
    Object tmp7929_7914 = tmp7914_7899;
    tmp7929_7914['̲'] = '¨';
    tmp7929_7914['̳'] = '¨';
    Object tmp7944_7929 = tmp7929_7914;
    Object tmp7944_7929 = tmp7929_7914;
    tmp7944_7929['̴'] = '¨';
    tmp7944_7929['̵'] = '¨';
    Object tmp7959_7944 = tmp7944_7929;
    Object tmp7959_7944 = tmp7944_7929;
    tmp7959_7944['̶'] = '¨';
    tmp7959_7944['̷'] = '¨';
    Object tmp7974_7959 = tmp7959_7944;
    Object tmp7974_7959 = tmp7959_7944;
    tmp7974_7959['̸'] = '¨';
    tmp7974_7959['̹'] = '¨';
    Object tmp7989_7974 = tmp7974_7959;
    Object tmp7989_7974 = tmp7974_7959;
    tmp7989_7974['̺'] = '¨';
    tmp7989_7974['̻'] = '¨';
    Object tmp8004_7989 = tmp7989_7974;
    Object tmp8004_7989 = tmp7989_7974;
    tmp8004_7989['̼'] = '¨';
    tmp8004_7989['̽'] = '¨';
    Object tmp8019_8004 = tmp8004_7989;
    Object tmp8019_8004 = tmp8004_7989;
    tmp8019_8004['̾'] = '¨';
    tmp8019_8004['̿'] = '¨';
    Object tmp8034_8019 = tmp8019_8004;
    Object tmp8034_8019 = tmp8019_8004;
    tmp8034_8019['̀'] = 'ǌ';
    tmp8034_8019['́'] = 'ǌ';
    Object tmp8049_8034 = tmp8034_8019;
    Object tmp8049_8034 = tmp8034_8019;
    tmp8049_8034['͂'] = 'ǌ';
    tmp8049_8034['̓'] = 'ǌ';
    Object tmp8064_8049 = tmp8049_8034;
    Object tmp8064_8049 = tmp8049_8034;
    tmp8064_8049['̈́'] = 'ǌ';
    tmp8064_8049['ͅ'] = 'ǌ';
    Object tmp8079_8064 = tmp8064_8049;
    Object tmp8079_8064 = tmp8064_8049;
    tmp8079_8064['͆'] = 'ǌ';
    tmp8079_8064['͇'] = 'ǌ';
    Object tmp8094_8079 = tmp8079_8064;
    Object tmp8094_8079 = tmp8079_8064;
    tmp8094_8079['͈'] = 'ǌ';
    tmp8094_8079['͉'] = 'ǌ';
    Object tmp8109_8094 = tmp8094_8079;
    Object tmp8109_8094 = tmp8094_8079;
    tmp8109_8094['͊'] = 'ǌ';
    tmp8109_8094['͋'] = 'ǌ';
    Object tmp8124_8109 = tmp8109_8094;
    Object tmp8124_8109 = tmp8109_8094;
    tmp8124_8109['͌'] = 'ǌ';
    tmp8124_8109['͍'] = 'ǌ';
    Object tmp8139_8124 = tmp8124_8109;
    Object tmp8139_8124 = tmp8124_8109;
    tmp8139_8124['͎'] = 'ǌ';
    tmp8139_8124['͏'] = 'ǌ';
    Object tmp8154_8139 = tmp8139_8124;
    Object tmp8154_8139 = tmp8139_8124;
    tmp8154_8139['͐'] = 'Ǭ';
    tmp8154_8139['͑'] = 'Ǭ';
    Object tmp8169_8154 = tmp8154_8139;
    Object tmp8169_8154 = tmp8154_8139;
    tmp8169_8154['͒'] = 'Ǭ';
    tmp8169_8154['͓'] = 'Ǭ';
    Object tmp8184_8169 = tmp8169_8154;
    Object tmp8184_8169 = tmp8169_8154;
    tmp8184_8169['͔'] = 'Ǭ';
    tmp8184_8169['͕'] = 'Ǭ';
    Object tmp8199_8184 = tmp8184_8169;
    Object tmp8199_8184 = tmp8184_8169;
    tmp8199_8184['͖'] = 'Ǭ';
    tmp8199_8184['͗'] = 'Ǭ';
    Object tmp8214_8199 = tmp8199_8184;
    Object tmp8214_8199 = tmp8199_8184;
    tmp8214_8199['͘'] = 'Ǭ';
    tmp8214_8199['͙'] = 'Ǭ';
    Object tmp8229_8214 = tmp8214_8199;
    Object tmp8229_8214 = tmp8214_8199;
    tmp8229_8214['͚'] = 'Ǭ';
    tmp8229_8214['͛'] = 'Ǭ';
    Object tmp8244_8229 = tmp8229_8214;
    Object tmp8244_8229 = tmp8229_8214;
    tmp8244_8229['͜'] = 'Ǭ';
    tmp8244_8229['͝'] = 'Ǭ';
    Object tmp8259_8244 = tmp8244_8229;
    Object tmp8259_8244 = tmp8244_8229;
    tmp8259_8244['͞'] = 'Ǭ';
    tmp8259_8244['͟'] = 'Ǭ';
    Object tmp8274_8259 = tmp8259_8244;
    Object tmp8274_8259 = tmp8259_8244;
    tmp8274_8259['͠'] = 'ࠋ';
    tmp8274_8259['͡'] = 'ࠋ';
    Object tmp8289_8274 = tmp8274_8259;
    Object tmp8289_8274 = tmp8274_8259;
    tmp8289_8274['͢'] = 'ࠋ';
    tmp8289_8274['ͣ'] = 'ࠋ';
    Object tmp8304_8289 = tmp8289_8274;
    Object tmp8304_8289 = tmp8289_8274;
    tmp8304_8289['ͤ'] = 'ࠋ';
    tmp8304_8289['ͥ'] = 'ࠋ';
    Object tmp8319_8304 = tmp8304_8289;
    Object tmp8319_8304 = tmp8304_8289;
    tmp8319_8304['ͦ'] = 'ࠋ';
    tmp8319_8304['ͧ'] = 'ࠋ';
    Object tmp8334_8319 = tmp8319_8304;
    Object tmp8334_8319 = tmp8319_8304;
    tmp8334_8319['ͨ'] = 'ࠋ';
    tmp8334_8319['ͩ'] = 'ࠋ';
    Object tmp8349_8334 = tmp8334_8319;
    Object tmp8349_8334 = tmp8334_8319;
    tmp8349_8334['ͪ'] = 'ࠋ';
    tmp8349_8334['ͫ'] = 'ࠋ';
    Object tmp8364_8349 = tmp8349_8334;
    Object tmp8364_8349 = tmp8349_8334;
    tmp8364_8349['ͬ'] = 'ࠋ';
    tmp8364_8349['ͭ'] = 'ࠋ';
    Object tmp8379_8364 = tmp8364_8349;
    Object tmp8379_8364 = tmp8364_8349;
    tmp8379_8364['ͮ'] = 'ࠋ';
    tmp8379_8364['ͯ'] = 'ࠋ';
    Object tmp8394_8379 = tmp8379_8364;
    Object tmp8394_8379 = tmp8379_8364;
    tmp8394_8379['Ͱ'] = 'ࠋ';
    tmp8394_8379['ͱ'] = 'ࠋ';
    Object tmp8409_8394 = tmp8394_8379;
    Object tmp8409_8394 = tmp8394_8379;
    tmp8409_8394['Ͳ'] = 'ࠋ';
    tmp8409_8394['ͳ'] = 'ࠋ';
    Object tmp8424_8409 = tmp8409_8394;
    Object tmp8424_8409 = tmp8409_8394;
    tmp8424_8409['ʹ'] = 'ࠋ';
    tmp8424_8409['͵'] = 'ࠋ';
    Object tmp8439_8424 = tmp8424_8409;
    Object tmp8439_8424 = tmp8424_8409;
    tmp8439_8424['Ͷ'] = 'ࠋ';
    tmp8439_8424['ͷ'] = 'ࠋ';
    Object tmp8454_8439 = tmp8439_8424;
    Object tmp8454_8439 = tmp8439_8424;
    tmp8454_8439['͸'] = 'ࠋ';
    tmp8454_8439['͹'] = 'ࠋ';
    Object tmp8469_8454 = tmp8454_8439;
    Object tmp8469_8454 = tmp8454_8439;
    tmp8469_8454['ͺ'] = 'ࠋ';
    tmp8469_8454['ͻ'] = 'ࠋ';
    Object tmp8484_8469 = tmp8469_8454;
    Object tmp8484_8469 = tmp8469_8454;
    tmp8484_8469['ͼ'] = 'ࠋ';
    tmp8484_8469['ͽ'] = 'ࠋ';
    Object tmp8499_8484 = tmp8484_8469;
    Object tmp8499_8484 = tmp8484_8469;
    tmp8499_8484[';'] = 'ࠋ';
    tmp8499_8484['Ϳ'] = 'ࠋ';
    Object tmp8514_8499 = tmp8499_8484;
    Object tmp8514_8499 = tmp8499_8484;
    tmp8514_8499['΀'] = 'È';
    tmp8514_8499['΁'] = 'È';
    Object tmp8529_8514 = tmp8514_8499;
    Object tmp8529_8514 = tmp8514_8499;
    tmp8529_8514['΂'] = 'È';
    tmp8529_8514['΃'] = 'È';
    Object tmp8544_8529 = tmp8529_8514;
    Object tmp8544_8529 = tmp8529_8514;
    tmp8544_8529['΄'] = 'È';
    tmp8544_8529['΅'] = 'È';
    Object tmp8559_8544 = tmp8544_8529;
    Object tmp8559_8544 = tmp8544_8529;
    tmp8559_8544['Ά'] = 'È';
    tmp8559_8544['·'] = 'È';
    Object tmp8574_8559 = tmp8559_8544;
    Object tmp8574_8559 = tmp8559_8544;
    tmp8574_8559['Έ'] = 'È';
    tmp8574_8559['Ή'] = 'È';
    Object tmp8589_8574 = tmp8574_8559;
    Object tmp8589_8574 = tmp8574_8559;
    tmp8589_8574['Ί'] = 'È';
    tmp8589_8574['΋'] = 'È';
    Object tmp8604_8589 = tmp8589_8574;
    Object tmp8604_8589 = tmp8589_8574;
    tmp8604_8589['Ό'] = 'È';
    tmp8604_8589['΍'] = 'È';
    Object tmp8619_8604 = tmp8604_8589;
    Object tmp8619_8604 = tmp8604_8589;
    tmp8619_8604['Ύ'] = 'È';
    tmp8619_8604['Ώ'] = 'È';
    Object tmp8634_8619 = tmp8619_8604;
    Object tmp8634_8619 = tmp8619_8604;
    tmp8634_8619['ΐ'] = 'È';
    tmp8634_8619['Α'] = 'È';
    Object tmp8649_8634 = tmp8634_8619;
    Object tmp8649_8634 = tmp8634_8619;
    tmp8649_8634['Β'] = 'È';
    tmp8649_8634['Γ'] = 'È';
    Object tmp8664_8649 = tmp8649_8634;
    Object tmp8664_8649 = tmp8649_8634;
    tmp8664_8649['Δ'] = 'È';
    tmp8664_8649['Ε'] = 'È';
    Object tmp8679_8664 = tmp8664_8649;
    Object tmp8679_8664 = tmp8664_8649;
    tmp8679_8664['Ζ'] = 'È';
    tmp8679_8664['Η'] = 'È';
    Object tmp8694_8679 = tmp8679_8664;
    Object tmp8694_8679 = tmp8679_8664;
    tmp8694_8679['Θ'] = 'È';
    tmp8694_8679['Ι'] = 'È';
    Object tmp8709_8694 = tmp8694_8679;
    Object tmp8709_8694 = tmp8694_8679;
    tmp8709_8694['Κ'] = 'È';
    tmp8709_8694['Λ'] = 'È';
    Object tmp8724_8709 = tmp8709_8694;
    Object tmp8724_8709 = tmp8709_8694;
    tmp8724_8709['Μ'] = 'È';
    tmp8724_8709['Ν'] = 'È';
    Object tmp8739_8724 = tmp8724_8709;
    Object tmp8739_8724 = tmp8724_8709;
    tmp8739_8724['Ξ'] = 'È';
    tmp8739_8724['Ο'] = 'È';
    Object tmp8754_8739 = tmp8739_8724;
    Object tmp8754_8739 = tmp8739_8724;
    tmp8754_8739['Π'] = 'È';
    tmp8754_8739['Ρ'] = 'È';
    Object tmp8769_8754 = tmp8754_8739;
    Object tmp8769_8754 = tmp8754_8739;
    tmp8769_8754['΢'] = 'È';
    tmp8769_8754['Σ'] = 'È';
    Object tmp8784_8769 = tmp8769_8754;
    Object tmp8784_8769 = tmp8769_8754;
    tmp8784_8769['Τ'] = 'È';
    tmp8784_8769['Υ'] = 'È';
    Object tmp8799_8784 = tmp8784_8769;
    Object tmp8799_8784 = tmp8784_8769;
    tmp8799_8784['Φ'] = 'È';
    tmp8799_8784['Χ'] = 'È';
    Object tmp8814_8799 = tmp8799_8784;
    Object tmp8814_8799 = tmp8799_8784;
    tmp8814_8799['Ψ'] = 'È';
    tmp8814_8799['Ω'] = 'È';
    Object tmp8829_8814 = tmp8814_8799;
    Object tmp8829_8814 = tmp8814_8799;
    tmp8829_8814['Ϊ'] = 'È';
    tmp8829_8814['Ϋ'] = 'È';
    Object tmp8844_8829 = tmp8829_8814;
    Object tmp8844_8829 = tmp8829_8814;
    tmp8844_8829['ά'] = 'È';
    tmp8844_8829['έ'] = 'È';
    Object tmp8859_8844 = tmp8844_8829;
    Object tmp8859_8844 = tmp8844_8829;
    tmp8859_8844['ή'] = 'È';
    tmp8859_8844['ί'] = 'È';
    Object tmp8874_8859 = tmp8859_8844;
    Object tmp8874_8859 = tmp8859_8844;
    tmp8874_8859['ΰ'] = 'È';
    tmp8874_8859['α'] = 'È';
    Object tmp8889_8874 = tmp8874_8859;
    Object tmp8889_8874 = tmp8874_8859;
    tmp8889_8874['β'] = 'È';
    tmp8889_8874['γ'] = 'È';
    Object tmp8904_8889 = tmp8889_8874;
    Object tmp8904_8889 = tmp8889_8874;
    tmp8904_8889['δ'] = 'È';
    tmp8904_8889['ε'] = 'È';
    Object tmp8919_8904 = tmp8904_8889;
    Object tmp8919_8904 = tmp8904_8889;
    tmp8919_8904['ζ'] = 'È';
    tmp8919_8904['η'] = 'È';
    Object tmp8934_8919 = tmp8919_8904;
    Object tmp8934_8919 = tmp8919_8904;
    tmp8934_8919['θ'] = 'È';
    tmp8934_8919['ι'] = 'È';
    Object tmp8949_8934 = tmp8934_8919;
    Object tmp8949_8934 = tmp8934_8919;
    tmp8949_8934['κ'] = 'È';
    tmp8949_8934['λ'] = 'È';
    Object tmp8964_8949 = tmp8949_8934;
    Object tmp8964_8949 = tmp8949_8934;
    tmp8964_8949['μ'] = 'È';
    tmp8964_8949['ν'] = 'È';
    Object tmp8979_8964 = tmp8964_8949;
    Object tmp8979_8964 = tmp8964_8949;
    tmp8979_8964['ξ'] = 'È';
    tmp8979_8964['ο'] = 'È';
    Object tmp8994_8979 = tmp8979_8964;
    Object tmp8994_8979 = tmp8979_8964;
    tmp8994_8979['π'] = 'è';
    tmp8994_8979['ρ'] = 'è';
    Object tmp9009_8994 = tmp8994_8979;
    Object tmp9009_8994 = tmp8994_8979;
    tmp9009_8994['ς'] = 'è';
    tmp9009_8994['σ'] = 'è';
    Object tmp9024_9009 = tmp9009_8994;
    Object tmp9024_9009 = tmp9009_8994;
    tmp9024_9009['τ'] = 'è';
    tmp9024_9009['υ'] = 'è';
    Object tmp9039_9024 = tmp9024_9009;
    Object tmp9039_9024 = tmp9024_9009;
    tmp9039_9024['φ'] = 'è';
    tmp9039_9024['χ'] = 'è';
    Object tmp9054_9039 = tmp9039_9024;
    Object tmp9054_9039 = tmp9039_9024;
    tmp9054_9039['ψ'] = 'è';
    tmp9054_9039['ω'] = 'è';
    Object tmp9069_9054 = tmp9054_9039;
    Object tmp9069_9054 = tmp9054_9039;
    tmp9069_9054['ϊ'] = 'è';
    tmp9069_9054['ϋ'] = 'è';
    Object tmp9084_9069 = tmp9069_9054;
    Object tmp9084_9069 = tmp9069_9054;
    tmp9084_9069['ό'] = 'è';
    tmp9084_9069['ύ'] = 'è';
    Object tmp9099_9084 = tmp9084_9069;
    Object tmp9099_9084 = tmp9084_9069;
    tmp9099_9084['ώ'] = 'è';
    tmp9099_9084['Ϗ'] = 'è';
    Object tmp9114_9099 = tmp9099_9084;
    Object tmp9114_9099 = tmp9099_9084;
    tmp9114_9099['ϐ'] = 'è';
    tmp9114_9099['ϑ'] = 'è';
    Object tmp9129_9114 = tmp9114_9099;
    Object tmp9129_9114 = tmp9114_9099;
    tmp9129_9114['ϒ'] = 'è';
    tmp9129_9114['ϓ'] = 'è';
    Object tmp9144_9129 = tmp9129_9114;
    Object tmp9144_9129 = tmp9129_9114;
    tmp9144_9129['ϔ'] = 'è';
    tmp9144_9129['ϕ'] = 'è';
    Object tmp9159_9144 = tmp9144_9129;
    Object tmp9159_9144 = tmp9144_9129;
    tmp9159_9144['ϖ'] = 'è';
    tmp9159_9144['ϗ'] = 'è';
    Object tmp9174_9159 = tmp9159_9144;
    Object tmp9174_9159 = tmp9159_9144;
    tmp9174_9159['Ϙ'] = 'è';
    tmp9174_9159['ϙ'] = 'è';
    Object tmp9189_9174 = tmp9174_9159;
    Object tmp9189_9174 = tmp9174_9159;
    tmp9189_9174['Ϛ'] = 'è';
    tmp9189_9174['ϛ'] = 'è';
    Object tmp9204_9189 = tmp9189_9174;
    Object tmp9204_9189 = tmp9189_9174;
    tmp9204_9189['Ϝ'] = 'è';
    tmp9204_9189['ϝ'] = 'è';
    Object tmp9219_9204 = tmp9204_9189;
    Object tmp9219_9204 = tmp9204_9189;
    tmp9219_9204['Ϟ'] = 'è';
    tmp9219_9204['ϟ'] = 'è';
    Object tmp9234_9219 = tmp9219_9204;
    Object tmp9234_9219 = tmp9219_9204;
    tmp9234_9219['Ϡ'] = 'è';
    tmp9234_9219['ϡ'] = 'è';
    Object tmp9249_9234 = tmp9234_9219;
    Object tmp9249_9234 = tmp9234_9219;
    tmp9249_9234['Ϣ'] = 'è';
    tmp9249_9234['ϣ'] = 'è';
    Object tmp9264_9249 = tmp9249_9234;
    Object tmp9264_9249 = tmp9249_9234;
    tmp9264_9249['Ϥ'] = 'è';
    tmp9264_9249['ϥ'] = 'è';
    Object tmp9279_9264 = tmp9264_9249;
    Object tmp9279_9264 = tmp9264_9249;
    tmp9279_9264['Ϧ'] = 'è';
    tmp9279_9264['ϧ'] = 'è';
    Object tmp9294_9279 = tmp9279_9264;
    Object tmp9294_9279 = tmp9279_9264;
    tmp9294_9279['Ϩ'] = 'è';
    tmp9294_9279['ϩ'] = 'è';
    Object tmp9309_9294 = tmp9294_9279;
    Object tmp9309_9294 = tmp9294_9279;
    tmp9309_9294['Ϫ'] = 'è';
    tmp9309_9294['ϫ'] = 'è';
    Object tmp9324_9309 = tmp9309_9294;
    Object tmp9324_9309 = tmp9309_9294;
    tmp9324_9309['Ϭ'] = 'è';
    tmp9324_9309['ϭ'] = 'è';
    Object tmp9339_9324 = tmp9324_9309;
    Object tmp9339_9324 = tmp9324_9309;
    tmp9339_9324['Ϯ'] = 'è';
    tmp9339_9324['ϯ'] = 'è';
    Object tmp9354_9339 = tmp9339_9324;
    Object tmp9354_9339 = tmp9339_9324;
    tmp9354_9339['ϰ'] = 'è';
    tmp9354_9339['ϱ'] = 'è';
    Object tmp9369_9354 = tmp9354_9339;
    Object tmp9369_9354 = tmp9354_9339;
    tmp9369_9354['ϲ'] = 'è';
    tmp9369_9354['ϳ'] = 'è';
    Object tmp9384_9369 = tmp9369_9354;
    Object tmp9384_9369 = tmp9369_9354;
    tmp9384_9369['ϴ'] = 'è';
    tmp9384_9369['ϵ'] = 'è';
    Object tmp9399_9384 = tmp9384_9369;
    Object tmp9399_9384 = tmp9384_9369;
    tmp9399_9384['϶'] = 'è';
    tmp9399_9384['Ϸ'] = 'è';
    Object tmp9414_9399 = tmp9399_9384;
    Object tmp9414_9399 = tmp9399_9384;
    tmp9414_9399['ϸ'] = 'è';
    tmp9414_9399['Ϲ'] = 'è';
    Object tmp9429_9414 = tmp9414_9399;
    Object tmp9429_9414 = tmp9414_9399;
    tmp9429_9414['Ϻ'] = 'è';
    tmp9429_9414['ϻ'] = 'è';
    Object tmp9444_9429 = tmp9429_9414;
    Object tmp9444_9429 = tmp9429_9414;
    tmp9444_9429['ϼ'] = 'è';
    tmp9444_9429['Ͻ'] = 'è';
    tmp9444_9429['Ͼ'] = 'è';
    tmp9444_9429['Ͽ'] = 'è';
    white = (short[])localObject;
    localObject = new short[16];
    Object tmp9486_9484 = localObject;
    Object tmp9487_9486 = tmp9486_9484;
    Object tmp9487_9486 = tmp9486_9484;
    tmp9487_9486[0] = '瀇';
    tmp9487_9486[1] = '瀇';
    Object tmp9498_9487 = tmp9487_9486;
    Object tmp9498_9487 = tmp9487_9486;
    tmp9498_9487[2] = '簈';
    tmp9498_9487[3] = '耉';
    Object tmp9509_9498 = tmp9498_9487;
    Object tmp9509_9498 = tmp9498_9487;
    tmp9509_9498[4] = '萉';
    tmp9509_9498[5] = '蠉';
    Object tmp9520_9509 = tmp9509_9498;
    Object tmp9520_9509 = tmp9509_9498;
    tmp9520_9509[6] = '谉';
    tmp9520_9509[7] = '选';
    Object tmp9533_9520 = tmp9520_9509;
    Object tmp9533_9520 = tmp9520_9509;
    tmp9533_9520[8] = '琇';
    tmp9533_9520[9] = '琇';
    Object tmp9546_9533 = tmp9533_9520;
    Object tmp9546_9533 = tmp9533_9520;
    tmp9546_9533[10] = '砇';
    tmp9546_9533[11] = '砇';
    Object tmp9559_9546 = tmp9546_9533;
    Object tmp9559_9546 = tmp9546_9533;
    tmp9559_9546[12] = '鐉';
    tmp9559_9546[13] = '頉';
    tmp9559_9546[14] = '鰉';
    tmp9559_9546[15] = 'ꀉ';
    additionalMakeup = (short[])localObject;
    localObject = new short[16];
    Object tmp9597_9595 = localObject;
    Object tmp9598_9597 = tmp9597_9595;
    Object tmp9598_9597 = tmp9597_9595;
    tmp9598_9597[0] = 'ಚ';
    tmp9598_9597[1] = 'ᤌ';
    Object tmp9609_9598 = tmp9598_9597;
    Object tmp9609_9598 = tmp9598_9597;
    tmp9609_9598[2] = 'È';
    tmp9609_9598[3] = '¨';
    Object tmp9620_9609 = tmp9609_9598;
    Object tmp9620_9609 = tmp9609_9598;
    tmp9620_9609[4] = 38;
    tmp9620_9609[5] = 38;
    Object tmp9629_9620 = tmp9620_9609;
    Object tmp9629_9620 = tmp9620_9609;
    tmp9629_9620[6] = '';
    tmp9629_9620[7] = '';
    Object tmp9642_9629 = tmp9629_9620;
    Object tmp9642_9629 = tmp9629_9620;
    tmp9642_9629[8] = 100;
    tmp9642_9629[9] = 100;
    Object tmp9653_9642 = tmp9642_9629;
    Object tmp9653_9642 = tmp9642_9629;
    tmp9653_9642[10] = 100;
    tmp9653_9642[11] = 100;
    Object tmp9664_9653 = tmp9653_9642;
    Object tmp9664_9653 = tmp9653_9642;
    tmp9664_9653[12] = 68;
    tmp9664_9653[13] = 68;
    tmp9664_9653[14] = 68;
    tmp9664_9653[15] = 68;
    initBlack = (short[])localObject;
    localObject = new short[4];
    Object tmp9697_9695 = localObject;
    Object tmp9698_9697 = tmp9697_9695;
    Object tmp9698_9697 = tmp9697_9695;
    tmp9698_9697[0] = 'Ĥ';
    tmp9698_9697[1] = 'Ą';
    tmp9698_9697[2] = 'â';
    tmp9698_9697[3] = 'â';
    twoBitBlack = (short[])localObject;
    localObject = new short['Ȁ'];
    localObject[0] = 62;
    localObject[1] = 62;
    localObject[2] = 30;
    localObject[3] = 30;
    localObject[32] = 3225;
    localObject[33] = 3225;
    localObject[34] = 3225;
    localObject[35] = 3225;
    localObject[36] = 3225;
    localObject[37] = 3225;
    localObject[38] = 3225;
    localObject[39] = 3225;
    localObject[40] = 3225;
    localObject[41] = 3225;
    localObject[42] = 3225;
    localObject[43] = 3225;
    localObject[44] = 3225;
    localObject[45] = 3225;
    localObject[46] = 3225;
    localObject[47] = 3225;
    localObject[48] = 3225;
    localObject[49] = 3225;
    localObject[50] = 3225;
    localObject[51] = 3225;
    localObject[52] = 3225;
    localObject[53] = 3225;
    localObject[54] = 3225;
    localObject[55] = 3225;
    localObject[56] = 3225;
    localObject[57] = 3225;
    localObject[58] = 3225;
    localObject[59] = 3225;
    localObject[60] = 3225;
    localObject[61] = 3225;
    localObject[62] = 3225;
    localObject[63] = 3225;
    localObject[64] = 588;
    localObject[65] = 588;
    localObject[66] = 588;
    localObject[67] = 588;
    localObject[68] = 588;
    localObject[69] = 588;
    localObject[70] = 588;
    localObject[71] = 588;
    localObject[72] = 1680;
    localObject[73] = 1680;
    localObject[74] = 20499;
    localObject[75] = 22547;
    localObject[76] = 24595;
    localObject[77] = 26643;
    localObject[78] = 1776;
    localObject[79] = 1776;
    localObject[80] = 1808;
    localObject[81] = 1808;
    localObject[82] = 40979;
    localObject[83] = 43027;
    localObject[84] = 45075;
    localObject[85] = 47123;
    localObject[86] = 1904;
    localObject[87] = 1904;
    localObject[88] = 1936;
    localObject[89] = 1936;
    localObject[90] = 49171;
    localObject[91] = 51219;
    localObject[92] = 782;
    localObject[93] = 782;
    localObject[94] = 782;
    localObject[95] = 782;
    localObject[96] = 814;
    localObject[97] = 814;
    localObject[98] = 814;
    localObject[99] = 814;
    localObject[100] = 53267;
    localObject[101] = 55315;
    localObject[102] = 10257;
    localObject[103] = 10257;
    localObject[104] = 12305;
    localObject[105] = 12305;
    localObject[106] = 14353;
    localObject[107] = 14353;
    localObject[108] = 16403;
    localObject[109] = 18451;
    localObject[110] = 1712;
    localObject[111] = 1712;
    localObject[112] = 1744;
    localObject[113] = 1744;
    localObject[114] = 28691;
    localObject[115] = 30739;
    localObject[116] = 32787;
    localObject[117] = 34835;
    localObject[118] = 36883;
    localObject[119] = 38931;
    localObject[120] = 2061;
    localObject[121] = 2061;
    localObject[122] = 2061;
    localObject[123] = 2061;
    localObject[124] = 2061;
    localObject[125] = 2061;
    localObject[126] = 2061;
    localObject[127] = 2061;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[''] = j;
    localObject[' '] = 750;
    localObject['¡'] = 750;
    localObject['¢'] = 750;
    localObject['£'] = 750;
    localObject['¤'] = 1616;
    localObject['¥'] = 1616;
    localObject['¦'] = 1648;
    localObject['§'] = 1648;
    localObject['¨'] = 1424;
    localObject['©'] = 1424;
    localObject['ª'] = 1456;
    localObject['«'] = 1456;
    localObject['¬'] = 1488;
    localObject['­'] = 1488;
    localObject['®'] = 1520;
    localObject['¯'] = 1520;
    localObject['°'] = 1840;
    localObject['±'] = 1840;
    localObject['²'] = 1872;
    localObject['³'] = 1872;
    localObject['´'] = 1968;
    localObject['µ'] = 1968;
    localObject['¶'] = 8209;
    localObject['·'] = 8209;
    localObject['¸'] = 524;
    localObject['¹'] = 524;
    localObject['º'] = 524;
    localObject['»'] = 524;
    localObject['¼'] = 524;
    localObject['½'] = 524;
    localObject['¾'] = 524;
    localObject['¿'] = 524;
    localObject['À'] = 556;
    localObject['Á'] = 556;
    localObject['Â'] = 556;
    localObject['Ã'] = 556;
    localObject['Ä'] = 556;
    localObject['Å'] = 556;
    localObject['Æ'] = 556;
    localObject['Ç'] = 556;
    localObject['È'] = 1552;
    localObject['É'] = 1552;
    localObject['Ê'] = 1584;
    localObject['Ë'] = 1584;
    localObject['Ì'] = 2000;
    localObject['Í'] = 2000;
    localObject['Î'] = 2032;
    localObject['Ï'] = 2032;
    localObject['Ð'] = 976;
    localObject['Ñ'] = 976;
    localObject['Ò'] = 1008;
    localObject['Ó'] = 1008;
    localObject['Ô'] = 1040;
    localObject['Õ'] = 1040;
    localObject['Ö'] = 1072;
    localObject['×'] = 1072;
    localObject['Ø'] = 1296;
    localObject['Ù'] = 1296;
    localObject['Ú'] = 1328;
    localObject['Û'] = 1328;
    localObject['Ü'] = 718;
    localObject['Ý'] = 718;
    localObject['Þ'] = 718;
    localObject['ß'] = 718;
    localObject['à'] = i;
    localObject['á'] = i;
    localObject['â'] = i;
    localObject['ã'] = i;
    localObject['ä'] = i;
    localObject['å'] = i;
    localObject['æ'] = i;
    localObject['ç'] = i;
    localObject['è'] = i;
    localObject['é'] = i;
    localObject['ê'] = i;
    localObject['ë'] = i;
    localObject['ì'] = i;
    localObject['í'] = i;
    localObject['î'] = i;
    localObject['ï'] = i;
    localObject['ð'] = i;
    localObject['ñ'] = i;
    localObject['ò'] = i;
    localObject['ó'] = i;
    localObject['ô'] = i;
    localObject['õ'] = i;
    localObject['ö'] = i;
    localObject['÷'] = i;
    localObject['ø'] = i;
    localObject['ù'] = i;
    localObject['ú'] = i;
    localObject['û'] = i;
    localObject['ü'] = i;
    localObject['ý'] = i;
    localObject['þ'] = i;
    localObject['ÿ'] = i;
    localObject['Ā'] = n;
    localObject['ā'] = n;
    localObject['Ă'] = n;
    localObject['ă'] = n;
    localObject['Ą'] = n;
    localObject['ą'] = n;
    localObject['Ć'] = n;
    localObject['ć'] = n;
    localObject['Ĉ'] = n;
    localObject['ĉ'] = n;
    localObject['Ċ'] = n;
    localObject['ċ'] = n;
    localObject['Č'] = n;
    localObject['č'] = n;
    localObject['Ď'] = n;
    localObject['ď'] = n;
    localObject['Đ'] = n;
    localObject['đ'] = n;
    localObject['Ē'] = n;
    localObject['ē'] = n;
    localObject['Ĕ'] = n;
    localObject['ĕ'] = n;
    localObject['Ė'] = n;
    localObject['ė'] = n;
    localObject['Ę'] = n;
    localObject['ę'] = n;
    localObject['Ě'] = n;
    localObject['ě'] = n;
    localObject['Ĝ'] = n;
    localObject['ĝ'] = n;
    localObject['Ğ'] = n;
    localObject['ğ'] = n;
    localObject['Ġ'] = n;
    localObject['ġ'] = n;
    localObject['Ģ'] = n;
    localObject['ģ'] = n;
    localObject['Ĥ'] = n;
    localObject['ĥ'] = n;
    localObject['Ħ'] = n;
    localObject['ħ'] = n;
    localObject['Ĩ'] = n;
    localObject['ĩ'] = n;
    localObject['Ī'] = n;
    localObject['ī'] = n;
    localObject['Ĭ'] = n;
    localObject['ĭ'] = n;
    localObject['Į'] = n;
    localObject['į'] = n;
    localObject['İ'] = n;
    localObject['ı'] = n;
    localObject['Ĳ'] = n;
    localObject['ĳ'] = n;
    localObject['Ĵ'] = n;
    localObject['ĵ'] = n;
    localObject['Ķ'] = n;
    localObject['ķ'] = n;
    localObject['ĸ'] = n;
    localObject['Ĺ'] = n;
    localObject['ĺ'] = n;
    localObject['Ļ'] = n;
    localObject['ļ'] = n;
    localObject['Ľ'] = n;
    localObject['ľ'] = n;
    localObject['Ŀ'] = n;
    localObject['ŀ'] = m;
    localObject['Ł'] = m;
    localObject['ł'] = m;
    localObject['Ń'] = m;
    localObject['ń'] = m;
    localObject['Ņ'] = m;
    localObject[n] = m;
    localObject['Ň'] = m;
    localObject['ň'] = m;
    localObject['ŉ'] = m;
    localObject['Ŋ'] = m;
    localObject['ŋ'] = m;
    localObject['Ō'] = m;
    localObject['ō'] = m;
    localObject['Ŏ'] = m;
    localObject['ŏ'] = m;
    localObject['Ő'] = m;
    localObject['ő'] = m;
    localObject['Œ'] = m;
    localObject['œ'] = m;
    localObject['Ŕ'] = m;
    localObject['ŕ'] = m;
    localObject['Ŗ'] = m;
    localObject['ŗ'] = m;
    localObject['Ř'] = m;
    localObject['ř'] = m;
    localObject['Ś'] = m;
    localObject['ś'] = m;
    localObject['Ŝ'] = m;
    localObject['ŝ'] = m;
    localObject['Ş'] = m;
    localObject['ş'] = m;
    localObject['Š'] = m;
    localObject['š'] = m;
    localObject['Ţ'] = m;
    localObject['ţ'] = m;
    localObject['Ť'] = m;
    localObject['ť'] = m;
    localObject[m] = m;
    localObject['ŧ'] = m;
    localObject['Ũ'] = m;
    localObject['ũ'] = m;
    localObject['Ū'] = m;
    localObject['ū'] = m;
    localObject['Ŭ'] = m;
    localObject['ŭ'] = m;
    localObject['Ů'] = m;
    localObject['ů'] = m;
    localObject['Ű'] = m;
    localObject['ű'] = m;
    localObject['Ų'] = m;
    localObject['ų'] = m;
    localObject['Ŵ'] = m;
    localObject['ŵ'] = m;
    localObject['Ŷ'] = m;
    localObject['ŷ'] = m;
    localObject['Ÿ'] = m;
    localObject['Ź'] = m;
    localObject['ź'] = m;
    localObject['Ż'] = m;
    localObject['ż'] = m;
    localObject['Ž'] = m;
    localObject['ž'] = m;
    localObject['ſ'] = m;
    localObject['ƀ'] = 490;
    localObject['Ɓ'] = 490;
    localObject['Ƃ'] = 490;
    localObject['ƃ'] = 490;
    localObject['Ƅ'] = 490;
    localObject['ƅ'] = 490;
    localObject[k] = 490;
    localObject['Ƈ'] = 490;
    localObject['ƈ'] = 490;
    localObject['Ɖ'] = 490;
    localObject['Ɗ'] = 490;
    localObject['Ƌ'] = 490;
    localObject['ƌ'] = 490;
    localObject['ƍ'] = 490;
    localObject['Ǝ'] = 490;
    localObject['Ə'] = 490;
    localObject['Ɛ'] = 4113;
    localObject['Ƒ'] = 4113;
    localObject['ƒ'] = 6161;
    localObject['Ɠ'] = 6161;
    localObject['Ɣ'] = 848;
    localObject['ƕ'] = 848;
    localObject['Ɩ'] = 880;
    localObject['Ɨ'] = 880;
    localObject['Ƙ'] = 912;
    localObject['ƙ'] = 912;
    localObject['ƚ'] = 944;
    localObject['ƛ'] = 944;
    localObject['Ɯ'] = 622;
    localObject['Ɲ'] = 622;
    localObject['ƞ'] = 622;
    localObject['Ɵ'] = 622;
    localObject['Ơ'] = 654;
    localObject['ơ'] = 654;
    localObject['Ƣ'] = 654;
    localObject['ƣ'] = 654;
    localObject['Ƥ'] = 1104;
    localObject['ƥ'] = 1104;
    localObject['Ʀ'] = 1136;
    localObject['Ƨ'] = 1136;
    localObject[j] = 1168;
    localObject['Ʃ'] = 1168;
    localObject['ƪ'] = 1200;
    localObject['ƫ'] = 1200;
    localObject['Ƭ'] = 1232;
    localObject['ƭ'] = 1232;
    localObject['Ʈ'] = 1264;
    localObject['Ư'] = 1264;
    localObject['ư'] = 686;
    localObject['Ʊ'] = 686;
    localObject['Ʋ'] = 686;
    localObject['Ƴ'] = 686;
    localObject['ƴ'] = 1360;
    localObject['Ƶ'] = 1360;
    localObject['ƶ'] = 1392;
    localObject['Ʒ'] = 1392;
    localObject['Ƹ'] = 12;
    localObject['ƹ'] = 12;
    localObject['ƺ'] = 12;
    localObject['ƻ'] = 12;
    localObject['Ƽ'] = 12;
    localObject['ƽ'] = 12;
    localObject['ƾ'] = 12;
    localObject['ƿ'] = 12;
    localObject['ǀ'] = k;
    localObject['ǁ'] = k;
    localObject['ǂ'] = k;
    localObject['ǃ'] = k;
    localObject['Ǆ'] = k;
    localObject['ǅ'] = k;
    localObject['ǆ'] = k;
    localObject['Ǉ'] = k;
    localObject[i] = k;
    localObject['ǉ'] = k;
    localObject['Ǌ'] = k;
    localObject['ǋ'] = k;
    localObject['ǌ'] = k;
    localObject['Ǎ'] = k;
    localObject['ǎ'] = k;
    localObject['Ǐ'] = k;
    localObject['ǐ'] = k;
    localObject['Ǒ'] = k;
    localObject['ǒ'] = k;
    localObject['Ǔ'] = k;
    localObject['ǔ'] = k;
    localObject['Ǖ'] = k;
    localObject['ǖ'] = k;
    localObject['Ǘ'] = k;
    localObject['ǘ'] = k;
    localObject['Ǚ'] = k;
    localObject['ǚ'] = k;
    localObject['Ǜ'] = k;
    localObject['ǜ'] = k;
    localObject['ǝ'] = k;
    localObject['Ǟ'] = k;
    localObject['ǟ'] = k;
    localObject['Ǡ'] = k;
    localObject['ǡ'] = k;
    localObject['Ǣ'] = k;
    localObject['ǣ'] = k;
    localObject['Ǥ'] = k;
    localObject['ǥ'] = k;
    localObject['Ǧ'] = k;
    localObject['ǧ'] = k;
    localObject['Ǩ'] = k;
    localObject['ǩ'] = k;
    localObject['Ǫ'] = k;
    localObject['ǫ'] = k;
    localObject['Ǭ'] = k;
    localObject['ǭ'] = k;
    localObject['Ǯ'] = k;
    localObject['ǯ'] = k;
    localObject['ǰ'] = k;
    localObject['Ǳ'] = k;
    localObject['ǲ'] = k;
    localObject['ǳ'] = k;
    localObject['Ǵ'] = k;
    localObject['ǵ'] = k;
    localObject['Ƕ'] = k;
    localObject['Ƿ'] = k;
    localObject['Ǹ'] = k;
    localObject['ǹ'] = k;
    localObject['Ǻ'] = k;
    localObject['ǻ'] = k;
    localObject['Ǽ'] = k;
    localObject['ǽ'] = k;
    localObject['Ǿ'] = k;
    localObject['ǿ'] = k;
    black = (short[])localObject;
    localObject = new byte[''];
    Object tmp13528_13526 = localObject;
    Object tmp13529_13528 = tmp13528_13526;
    Object tmp13529_13528 = tmp13528_13526;
    tmp13529_13528[0] = 80;
    tmp13529_13528[1] = 88;
    Object tmp13538_13529 = tmp13529_13528;
    Object tmp13538_13529 = tmp13529_13528;
    tmp13538_13529[2] = 23;
    tmp13538_13529[3] = 71;
    Object tmp13547_13538 = tmp13538_13529;
    Object tmp13547_13538 = tmp13538_13529;
    tmp13547_13538[4] = 30;
    tmp13547_13538[5] = 30;
    Object tmp13556_13547 = tmp13547_13538;
    Object tmp13556_13547 = tmp13547_13538;
    tmp13556_13547[6] = 62;
    tmp13556_13547[7] = 62;
    Object tmp13567_13556 = tmp13556_13547;
    Object tmp13567_13556 = tmp13556_13547;
    tmp13567_13556[8] = 4;
    tmp13567_13556[9] = 4;
    Object tmp13576_13567 = tmp13567_13556;
    Object tmp13576_13567 = tmp13567_13556;
    tmp13576_13567[10] = 4;
    tmp13576_13567[11] = 4;
    Object tmp13585_13576 = tmp13576_13567;
    Object tmp13585_13576 = tmp13576_13567;
    tmp13585_13576[12] = 4;
    tmp13585_13576[13] = 4;
    Object tmp13594_13585 = tmp13585_13576;
    Object tmp13594_13585 = tmp13585_13576;
    tmp13594_13585[14] = 4;
    tmp13594_13585[15] = 4;
    Object tmp13603_13594 = tmp13594_13585;
    Object tmp13603_13594 = tmp13594_13585;
    tmp13603_13594[16] = 11;
    tmp13603_13594[17] = 11;
    Object tmp13614_13603 = tmp13603_13594;
    Object tmp13614_13603 = tmp13603_13594;
    tmp13614_13603[18] = 11;
    tmp13614_13603[19] = 11;
    Object tmp13625_13614 = tmp13614_13603;
    Object tmp13625_13614 = tmp13614_13603;
    tmp13625_13614[20] = 11;
    tmp13625_13614[21] = 11;
    Object tmp13636_13625 = tmp13625_13614;
    Object tmp13636_13625 = tmp13625_13614;
    tmp13636_13625[22] = 11;
    tmp13636_13625[23] = 11;
    Object tmp13647_13636 = tmp13636_13625;
    Object tmp13647_13636 = tmp13636_13625;
    tmp13647_13636[24] = 11;
    tmp13647_13636[25] = 11;
    Object tmp13658_13647 = tmp13647_13636;
    Object tmp13658_13647 = tmp13647_13636;
    tmp13658_13647[26] = 11;
    tmp13658_13647[27] = 11;
    Object tmp13669_13658 = tmp13658_13647;
    Object tmp13669_13658 = tmp13658_13647;
    tmp13669_13658[28] = 11;
    tmp13669_13658[29] = 11;
    Object tmp13680_13669 = tmp13669_13658;
    Object tmp13680_13669 = tmp13669_13658;
    tmp13680_13669[30] = 11;
    tmp13680_13669[31] = 11;
    Object tmp13691_13680 = tmp13680_13669;
    Object tmp13691_13680 = tmp13680_13669;
    tmp13691_13680[32] = 35;
    tmp13691_13680[33] = 35;
    Object tmp13702_13691 = tmp13691_13680;
    Object tmp13702_13691 = tmp13691_13680;
    tmp13702_13691[34] = 35;
    tmp13702_13691[35] = 35;
    Object tmp13713_13702 = tmp13702_13691;
    Object tmp13713_13702 = tmp13702_13691;
    tmp13713_13702[36] = 35;
    tmp13713_13702[37] = 35;
    Object tmp13724_13713 = tmp13713_13702;
    Object tmp13724_13713 = tmp13713_13702;
    tmp13724_13713[38] = 35;
    tmp13724_13713[39] = 35;
    Object tmp13735_13724 = tmp13724_13713;
    Object tmp13735_13724 = tmp13724_13713;
    tmp13735_13724[40] = 35;
    tmp13735_13724[41] = 35;
    Object tmp13746_13735 = tmp13735_13724;
    Object tmp13746_13735 = tmp13735_13724;
    tmp13746_13735[42] = 35;
    tmp13746_13735[43] = 35;
    Object tmp13757_13746 = tmp13746_13735;
    Object tmp13757_13746 = tmp13746_13735;
    tmp13757_13746[44] = 35;
    tmp13757_13746[45] = 35;
    Object tmp13768_13757 = tmp13757_13746;
    Object tmp13768_13757 = tmp13757_13746;
    tmp13768_13757[46] = 35;
    tmp13768_13757[47] = 35;
    Object tmp13779_13768 = tmp13768_13757;
    Object tmp13779_13768 = tmp13768_13757;
    tmp13779_13768[48] = 51;
    tmp13779_13768[49] = 51;
    Object tmp13790_13779 = tmp13779_13768;
    Object tmp13790_13779 = tmp13779_13768;
    tmp13790_13779[50] = 51;
    tmp13790_13779[51] = 51;
    Object tmp13801_13790 = tmp13790_13779;
    Object tmp13801_13790 = tmp13790_13779;
    tmp13801_13790[52] = 51;
    tmp13801_13790[53] = 51;
    Object tmp13812_13801 = tmp13801_13790;
    Object tmp13812_13801 = tmp13801_13790;
    tmp13812_13801[54] = 51;
    tmp13812_13801[55] = 51;
    Object tmp13823_13812 = tmp13812_13801;
    Object tmp13823_13812 = tmp13812_13801;
    tmp13823_13812[56] = 51;
    tmp13823_13812[57] = 51;
    Object tmp13834_13823 = tmp13823_13812;
    Object tmp13834_13823 = tmp13823_13812;
    tmp13834_13823[58] = 51;
    tmp13834_13823[59] = 51;
    Object tmp13845_13834 = tmp13834_13823;
    Object tmp13845_13834 = tmp13834_13823;
    tmp13845_13834[60] = 51;
    tmp13845_13834[61] = 51;
    Object tmp13856_13845 = tmp13845_13834;
    Object tmp13856_13845 = tmp13845_13834;
    tmp13856_13845[62] = 51;
    tmp13856_13845[63] = 51;
    Object tmp13867_13856 = tmp13856_13845;
    Object tmp13867_13856 = tmp13856_13845;
    tmp13867_13856[64] = 41;
    tmp13867_13856[65] = 41;
    Object tmp13878_13867 = tmp13867_13856;
    Object tmp13878_13867 = tmp13867_13856;
    tmp13878_13867[66] = 41;
    tmp13878_13867[67] = 41;
    Object tmp13889_13878 = tmp13878_13867;
    Object tmp13889_13878 = tmp13878_13867;
    tmp13889_13878[68] = 41;
    tmp13889_13878[69] = 41;
    Object tmp13900_13889 = tmp13889_13878;
    Object tmp13900_13889 = tmp13889_13878;
    tmp13900_13889[70] = 41;
    tmp13900_13889[71] = 41;
    Object tmp13911_13900 = tmp13900_13889;
    Object tmp13911_13900 = tmp13900_13889;
    tmp13911_13900[72] = 41;
    tmp13911_13900[73] = 41;
    Object tmp13922_13911 = tmp13911_13900;
    Object tmp13922_13911 = tmp13911_13900;
    tmp13922_13911[74] = 41;
    tmp13922_13911[75] = 41;
    Object tmp13933_13922 = tmp13922_13911;
    Object tmp13933_13922 = tmp13922_13911;
    tmp13933_13922[76] = 41;
    tmp13933_13922[77] = 41;
    Object tmp13944_13933 = tmp13933_13922;
    Object tmp13944_13933 = tmp13933_13922;
    tmp13944_13933[78] = 41;
    tmp13944_13933[79] = 41;
    Object tmp13955_13944 = tmp13944_13933;
    Object tmp13955_13944 = tmp13944_13933;
    tmp13955_13944[80] = 41;
    tmp13955_13944[81] = 41;
    Object tmp13966_13955 = tmp13955_13944;
    Object tmp13966_13955 = tmp13955_13944;
    tmp13966_13955[82] = 41;
    tmp13966_13955[83] = 41;
    Object tmp13977_13966 = tmp13966_13955;
    Object tmp13977_13966 = tmp13966_13955;
    tmp13977_13966[84] = 41;
    tmp13977_13966[85] = 41;
    Object tmp13988_13977 = tmp13977_13966;
    Object tmp13988_13977 = tmp13977_13966;
    tmp13988_13977[86] = 41;
    tmp13988_13977[87] = 41;
    Object tmp13999_13988 = tmp13988_13977;
    Object tmp13999_13988 = tmp13988_13977;
    tmp13999_13988[88] = 41;
    tmp13999_13988[89] = 41;
    Object tmp14010_13999 = tmp13999_13988;
    Object tmp14010_13999 = tmp13999_13988;
    tmp14010_13999[90] = 41;
    tmp14010_13999[91] = 41;
    Object tmp14021_14010 = tmp14010_13999;
    Object tmp14021_14010 = tmp14010_13999;
    tmp14021_14010[92] = 41;
    tmp14021_14010[93] = 41;
    Object tmp14032_14021 = tmp14021_14010;
    Object tmp14032_14021 = tmp14021_14010;
    tmp14032_14021[94] = 41;
    tmp14032_14021[95] = 41;
    Object tmp14043_14032 = tmp14032_14021;
    Object tmp14043_14032 = tmp14032_14021;
    tmp14043_14032[96] = 41;
    tmp14043_14032[97] = 41;
    Object tmp14054_14043 = tmp14043_14032;
    Object tmp14054_14043 = tmp14043_14032;
    tmp14054_14043[98] = 41;
    tmp14054_14043[99] = 41;
    Object tmp14065_14054 = tmp14054_14043;
    Object tmp14065_14054 = tmp14054_14043;
    tmp14065_14054[100] = 41;
    tmp14065_14054[101] = 41;
    Object tmp14076_14065 = tmp14065_14054;
    Object tmp14076_14065 = tmp14065_14054;
    tmp14076_14065[102] = 41;
    tmp14076_14065[103] = 41;
    Object tmp14087_14076 = tmp14076_14065;
    Object tmp14087_14076 = tmp14076_14065;
    tmp14087_14076[104] = 41;
    tmp14087_14076[105] = 41;
    Object tmp14098_14087 = tmp14087_14076;
    Object tmp14098_14087 = tmp14087_14076;
    tmp14098_14087[106] = 41;
    tmp14098_14087[107] = 41;
    Object tmp14109_14098 = tmp14098_14087;
    Object tmp14109_14098 = tmp14098_14087;
    tmp14109_14098[108] = 41;
    tmp14109_14098[109] = 41;
    Object tmp14120_14109 = tmp14109_14098;
    Object tmp14120_14109 = tmp14109_14098;
    tmp14120_14109[110] = 41;
    tmp14120_14109[111] = 41;
    Object tmp14131_14120 = tmp14120_14109;
    Object tmp14131_14120 = tmp14120_14109;
    tmp14131_14120[112] = 41;
    tmp14131_14120[113] = 41;
    Object tmp14142_14131 = tmp14131_14120;
    Object tmp14142_14131 = tmp14131_14120;
    tmp14142_14131[114] = 41;
    tmp14142_14131[115] = 41;
    Object tmp14153_14142 = tmp14142_14131;
    Object tmp14153_14142 = tmp14142_14131;
    tmp14153_14142[116] = 41;
    tmp14153_14142[117] = 41;
    Object tmp14164_14153 = tmp14153_14142;
    Object tmp14164_14153 = tmp14153_14142;
    tmp14164_14153[118] = 41;
    tmp14164_14153[119] = 41;
    Object tmp14175_14164 = tmp14164_14153;
    Object tmp14175_14164 = tmp14164_14153;
    tmp14175_14164[120] = 41;
    tmp14175_14164[121] = 41;
    Object tmp14186_14175 = tmp14175_14164;
    Object tmp14186_14175 = tmp14175_14164;
    tmp14186_14175[122] = 41;
    tmp14186_14175[123] = 41;
    Object tmp14197_14186 = tmp14186_14175;
    Object tmp14197_14186 = tmp14186_14175;
    tmp14197_14186[124] = 41;
    tmp14197_14186[125] = 41;
    tmp14197_14186[126] = 41;
    tmp14197_14186[127] = 41;
    twoDCodes = (byte[])localObject;
  }
  
  public CCITTFaxDecoder(int paramInt1, int paramInt2, int paramInt3)
  {
    this.fillOrder = paramInt1;
    this.w = paramInt2;
    this.bitPointer = 0;
    this.bytePointer = 0;
    int[] arrayOfInt = new int[paramInt2];
    this.prevChangingElems = arrayOfInt;
    arrayOfInt = new int[paramInt2];
    this.currChangingElems = arrayOfInt;
  }
  
  private boolean align()
  {
    boolean bool1 = false;
    boolean bool2 = this.align;
    if (bool2)
    {
      int i = this.bitPointer;
      if (i != 0)
      {
        i = this.bytePointer + 1;
        this.bytePointer = i;
        this.bitPointer = 0;
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private int decodeBlackCodeWord()
  {
    int i = 4;
    int j = 0;
    RuntimeException localRuntimeException = null;
    int k = 1;
    int m = 0;
    for (;;)
    {
      if (j != 0) {
        return m;
      }
      int n = nextLesserThan8Bits(i);
      short[] arrayOfShort1 = initBlack;
      n = arrayOfShort1[n];
      int i1 = n & 0x1;
      i1 = n >>> 1 & 0xF;
      n = n >>> 5 & 0x7FF;
      int i2 = 100;
      if (n == i2)
      {
        n = nextNBits(9);
        arrayOfShort1 = black;
        n = arrayOfShort1[n];
        i1 = n & 0x1;
        i2 = n >>> 1 & 0xF;
        n = n >>> 5 & 0x7FF;
        int i3 = 12;
        if (i2 == i3)
        {
          updatePointer(5);
          n = nextLesserThan8Bits(i);
          arrayOfShort1 = additionalMakeup;
          n = arrayOfShort1[n];
          i1 = n >>> 1 & 0x7;
          n = n >>> 4 & 0xFFF;
          m += n;
          n = 4 - i1;
          updatePointer(n);
        }
        else
        {
          i3 = 15;
          if (i2 == i3)
          {
            localRuntimeException = new java/lang/RuntimeException;
            localRuntimeException.<init>("EOL code word encountered in Black run.");
            throw localRuntimeException;
          }
          m += n;
          n = 9 - i2;
          updatePointer(n);
          if (i1 == 0) {
            j = k;
          }
        }
      }
      else
      {
        j = 200;
        if (n == j)
        {
          j = nextLesserThan8Bits(2);
          short[] arrayOfShort2 = twoBitBlack;
          n = arrayOfShort2[j];
          j = (n >>> 5 & 0x7FF) + m;
          m = n >>> 1 & 0xF;
          m = 2 - m;
          updatePointer(m);
          m = j;
          j = k;
        }
        else
        {
          j = m + n;
          m = 4 - i1;
          updatePointer(m);
          m = j;
          j = k;
        }
      }
    }
  }
  
  private int decodeWhiteCodeWord()
  {
    int i = 1;
    int j = 0;
    for (;;)
    {
      if (i == 0) {
        return j;
      }
      int k = nextNBits(10);
      short[] arrayOfShort = white;
      int m = arrayOfShort[k];
      int n = m & 0x1;
      int i1 = m >>> 1 & 0xF;
      int i2 = 12;
      if (i1 == i2)
      {
        m = nextLesserThan8Bits(2);
        k = k << 2 & 0xC | m;
        arrayOfShort = additionalMakeup;
        k = arrayOfShort[k];
        m = k >>> 1 & 0x7;
        k = k >>> 4 & 0xFFF;
        j += k;
        k = 4 - m;
        updatePointer(k);
      }
      else
      {
        RuntimeException localRuntimeException;
        if (i1 == 0)
        {
          localRuntimeException = new java/lang/RuntimeException;
          localRuntimeException.<init>("Invalid code encountered.");
          throw localRuntimeException;
        }
        k = 15;
        if (i1 == k)
        {
          localRuntimeException = new java/lang/RuntimeException;
          localRuntimeException.<init>("EOL code word encountered in White run.");
          throw localRuntimeException;
        }
        k = m >>> 5 & 0x7FF;
        j += k;
        k = 10 - i1;
        updatePointer(k);
        if (n == 0)
        {
          i = 0;
          localRuntimeException = null;
        }
      }
    }
  }
  
  private void getNextChangingElement(int paramInt, boolean paramBoolean, int[] paramArrayOfInt)
  {
    int i = 0;
    int[] arrayOfInt = this.prevChangingElems;
    int j = this.changingElemSize;
    int k = this.lastChangingElement;
    if (k > 0)
    {
      k = this.lastChangingElement + -1;
      if (!paramBoolean) {
        break label94;
      }
      k &= 0xFFFFFFFE;
    }
    for (;;)
    {
      label45:
      if (k >= j) {}
      for (;;)
      {
        i = k + 1;
        if (i < j)
        {
          i = 1;
          k += 1;
          k = arrayOfInt[k];
          paramArrayOfInt[i] = k;
        }
        return;
        k = 0;
        break;
        label94:
        k |= 0x1;
        break label45;
        int m = arrayOfInt[k];
        if (m <= paramInt) {
          break label130;
        }
        this.lastChangingElement = k;
        paramArrayOfInt[0] = m;
      }
      label130:
      k += 2;
    }
  }
  
  private int nextLesserThan8Bits(int paramInt)
  {
    int i = 0;
    int[] arrayOfInt = null;
    Object localObject1 = this.data;
    int j = localObject1.length + -1;
    int k = this.bytePointer;
    int m = this.fillOrder;
    int n = 1;
    Object localObject2;
    int i1;
    if (m == n)
    {
      localObject2 = this.data;
      m = localObject2[k];
      if (k == j)
      {
        j = 0;
        localObject1 = null;
        k = this.bitPointer;
        k = 8 - k;
        n = paramInt - k;
        i1 = k - paramInt;
        if (i1 < 0) {
          break label301;
        }
        localObject1 = table1;
        j = (localObject1[k] & m) >>> i1;
        m = this.bitPointer + paramInt;
        this.bitPointer = m;
        m = this.bitPointer;
        k = 8;
        if (m == k)
        {
          this.bitPointer = 0;
          i = this.bytePointer + 1;
          this.bytePointer = i;
        }
      }
    }
    for (;;)
    {
      return j;
      localObject1 = this.data;
      k += 1;
      j = localObject1[k];
      break;
      m = this.fillOrder;
      n = 2;
      if (m == n)
      {
        localObject2 = flipTable;
        byte[] arrayOfByte = this.data;
        n = arrayOfByte[k] & 0xFF;
        m = localObject2[n];
        if (k == j)
        {
          j = 0;
          localObject1 = null;
          break;
        }
        localObject1 = flipTable;
        arrayOfByte = this.data;
        k += 1;
        k = arrayOfByte[k] & 0xFF;
        j = localObject1[k];
        break;
      }
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>("tag must be either 1 or 2.");
      throw ((Throwable)localObject1);
      label301:
      arrayOfInt = table1;
      i = arrayOfInt[k] & m;
      m = -i1;
      i <<= m;
      localObject2 = table2;
      m = localObject2[n];
      j &= m;
      m = 8 - n;
      j = j >>> m | i;
      i = this.bytePointer + 1;
      this.bytePointer = i;
      this.bitPointer = n;
    }
  }
  
  private int nextNBits(int paramInt)
  {
    int i = 8;
    int j = 0;
    Object localObject1 = this.data;
    int k = localObject1.length + -1;
    int m = this.bytePointer;
    int n = this.fillOrder;
    int i1 = 1;
    Object localObject2;
    int i2;
    int i3;
    if (n == i1)
    {
      localObject2 = this.data;
      i1 = localObject2[m];
      if (m == k)
      {
        k = 0;
        localObject1 = null;
        n = 0;
        localObject2 = null;
        m = this.bitPointer;
        i2 = 8 - m;
        m = paramInt - i2;
        if (m <= i) {
          break label596;
        }
        m += -8;
        i3 = i;
      }
    }
    for (;;)
    {
      int i4 = this.bytePointer + 1;
      this.bytePointer = i4;
      int[] arrayOfInt1 = table1;
      i4 = arrayOfInt1[i2];
      i1 &= i4;
      i2 = paramInt - i2;
      i1 <<= i2;
      int[] arrayOfInt2 = table2;
      i2 = arrayOfInt2[i3];
      n &= i2;
      i2 = 8 - i3;
      n >>>= i2;
      if (m != 0)
      {
        j = n << m;
        localObject2 = table2;
        n = localObject2[m];
        k &= n;
        n = 8 - m;
        k = k >>> n | j;
        j = this.bytePointer + 1;
        this.bytePointer = j;
        this.bitPointer = m;
      }
      for (;;)
      {
        return k | i1;
        n = m + 1;
        if (n == k)
        {
          localObject1 = this.data;
          n = m + 1;
          n = localObject1[n];
          k = 0;
          localObject1 = null;
          break;
        }
        localObject1 = this.data;
        n = m + 1;
        n = localObject1[n];
        localObject1 = this.data;
        m += 2;
        k = localObject1[m];
        break;
        n = this.fillOrder;
        i1 = 2;
        if (n == i1)
        {
          localObject2 = flipTable;
          byte[] arrayOfByte1 = this.data;
          i1 = arrayOfByte1[m] & 0xFF;
          i1 = localObject2[i1];
          if (m == k)
          {
            k = 0;
            localObject1 = null;
            n = 0;
            localObject2 = null;
            break;
          }
          n = m + 1;
          if (n == k)
          {
            localObject1 = flipTable;
            localObject2 = this.data;
            m += 1;
            n = localObject2[m] & 0xFF;
            n = localObject1[n];
            k = 0;
            localObject1 = null;
            break;
          }
          localObject1 = flipTable;
          localObject2 = this.data;
          i3 = m + 1;
          n = localObject2[i3] & 0xFF;
          n = localObject1[n];
          localObject1 = flipTable;
          byte[] arrayOfByte2 = this.data;
          m += 2;
          m = arrayOfByte2[m] & 0xFF;
          k = localObject1[m];
          break;
        }
        localObject1 = new java/lang/RuntimeException;
        ((RuntimeException)localObject1).<init>("tag must be either 1 or 2.");
        throw ((Throwable)localObject1);
        if (i3 == i)
        {
          this.bitPointer = 0;
          k = this.bytePointer + 1;
          this.bytePointer = k;
          k = n;
        }
        else
        {
          this.bitPointer = i3;
          k = n;
        }
      }
      label596:
      i3 = m;
      m = 0;
    }
  }
  
  private int readEOL(boolean paramBoolean)
  {
    int i = 8;
    int j = 4;
    int k = 1;
    boolean bool = seekEOL();
    RuntimeException localRuntimeException;
    if (!bool)
    {
      localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("EOL not found");
      throw localRuntimeException;
    }
    bool = this.fillBits;
    int m;
    int n;
    if (!bool)
    {
      m = nextNBits(12);
      if ((paramBoolean) && (m == 0))
      {
        n = nextNBits(j);
        if (n == k)
        {
          this.fillBits = k;
          return k;
        }
      }
      if (m != k)
      {
        localRuntimeException = new java/lang/RuntimeException;
        localRuntimeException.<init>("Scanline must begin with EOL code word.");
        throw localRuntimeException;
      }
    }
    else
    {
      m = this.bitPointer;
      m = 8 - m;
      n = nextNBits(m);
      if (n != 0)
      {
        localRuntimeException = new java/lang/RuntimeException;
        localRuntimeException.<init>("All fill bits preceding EOL code must be 0.");
        throw localRuntimeException;
      }
      if (m < j)
      {
        m = nextNBits(i);
        if (m != 0)
        {
          localRuntimeException = new java/lang/RuntimeException;
          localRuntimeException.<init>("All fill bits preceding EOL code must be 0.");
          throw localRuntimeException;
        }
      }
      m = nextNBits(i);
      if (!paramBoolean) {
        break label267;
      }
      n = m & 0xF0;
      int i1 = 16;
      if (n != i1) {
        break label267;
      }
      m = 0;
      this.fillBits = false;
      updatePointer(j);
    }
    for (;;)
    {
      k = nextLesserThan8Bits(k);
      break;
      label267:
      do
      {
        if (m != 0)
        {
          localRuntimeException = new java/lang/RuntimeException;
          localRuntimeException.<init>("0 bits expected before EOL");
          throw localRuntimeException;
        }
        m = nextNBits(i);
      } while (m != k);
    }
  }
  
  private boolean seekEOL()
  {
    int i = 12;
    int j = 1;
    byte[] arrayOfByte = this.data;
    int k = arrayOfByte.length * 8 + -1;
    int m = this.bytePointer * 8;
    int i1 = this.bitPointer + m;
    m = k + -12;
    if (i1 > m)
    {
      j = 0;
      label53:
      return j;
    }
    m = nextNBits(i);
    int i2;
    i1 += 12;
    for (;;)
    {
      if ((m == j) || (i2 >= k))
      {
        if (m != j) {
          break;
        }
        updatePointer(i);
        break label53;
      }
      int n = (m & 0x7FF) << 1;
      int i3 = nextLesserThan8Bits(j) & 0x1;
      n |= i3;
      i2 += 1;
    }
  }
  
  private void setToBlack(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    int j = paramInt1 * 8 + paramInt2;
    int k = j + paramInt3;
    int m = j >> 3;
    int n = j & 0x7;
    int i1;
    if (n > 0)
    {
      n = 7 - n;
      i1 = i << n;
      n = paramArrayOfByte[m];
      if ((i1 <= 0) || (j >= k)) {
        paramArrayOfByte[m] = n;
      }
    }
    else
    {
      n = j >> 3;
      label80:
      i1 = k + -7;
      if (j < i1) {
        break label125;
      }
    }
    for (;;)
    {
      if (j >= k)
      {
        return;
        n = (byte)(n | i1);
        i1 >>= 1;
        j += 1;
        break;
        label125:
        i1 = n + 1;
        m = -1;
        paramArrayOfByte[n] = m;
        j += 8;
        n = i1;
        break label80;
      }
      n = j >> 3;
      i1 = paramArrayOfByte[n];
      m = j & 0x7;
      m = 7 - m;
      m = i << m;
      i1 = (byte)(i1 | m);
      paramArrayOfByte[n] = i1;
      j += 1;
    }
  }
  
  private void updatePointer(int paramInt)
  {
    int i = 8;
    int j;
    if (paramInt > i)
    {
      i = this.bytePointer;
      j = paramInt / 8;
      i -= j;
      this.bytePointer = i;
      paramInt %= 8;
    }
    i = this.bitPointer - paramInt;
    if (i < 0)
    {
      j = this.bytePointer + -1;
      this.bytePointer = j;
      i += 8;
    }
    for (this.bitPointer = i;; this.bitPointer = i) {
      return;
    }
  }
  
  protected boolean consumeEOL()
  {
    int i = 12;
    int j = 1;
    int k = nextNBits(i);
    if (k == j) {}
    for (;;)
    {
      return j;
      updatePointer(i);
      j = 0;
    }
  }
  
  protected void decodeNextScanline(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 9;
    int j = 4;
    int k = 2;
    int m = 0;
    int n = 1;
    this.changingElemSize = 0;
    int i1 = n;
    int i2 = this.w;
    label37:
    Object localObject;
    if (paramInt2 >= i2)
    {
      localObject = this.currChangingElems;
      n = this.changingElemSize;
      m = n + 1;
      this.changingElemSize = m;
      localObject[n] = paramInt2;
      label67:
      return;
    }
    short[] arrayOfShort1;
    int i3;
    int i4;
    int i5;
    label322:
    for (;;)
    {
      i2 = nextNBits(10);
      arrayOfShort1 = white;
      i3 = arrayOfShort1[i2];
      i4 = i3 & 0x1;
      i5 = i3 >>> 1 & 0xF;
      int i6 = 12;
      if (i5 == i6)
      {
        i3 = nextLesserThan8Bits(k);
        i2 = i2 << 2 & 0xC | i3;
        arrayOfShort1 = additionalMakeup;
        i2 = arrayOfShort1[i2];
        i3 = i2 >>> 1 & 0x7;
        i2 = i2 >>> 4 & 0xFFF;
        paramInt2 += i2;
        i2 = 4 - i3;
        updatePointer(i2);
      }
      for (;;)
      {
        if (i1 != 0) {
          break label322;
        }
        i2 = this.w;
        if (paramInt2 != i2) {
          break label506;
        }
        align();
        break;
        if (i5 == 0)
        {
          localObject = new java/lang/RuntimeException;
          ((RuntimeException)localObject).<init>("Invalid code encountered.");
          throw ((Throwable)localObject);
        }
        i2 = 15;
        if (i5 == i2)
        {
          i1 = 10;
          updatePointer(i1);
          break label67;
        }
        i2 = i3 >>> 5 & 0x7FF;
        paramInt2 += i2;
        i2 = 10 - i5;
        updatePointer(i2);
        if (i4 == 0)
        {
          localObject = this.currChangingElems;
          i2 = this.changingElemSize;
          i3 = i2 + 1;
          this.changingElemSize = i3;
          localObject[i2] = paramInt2;
          i1 = 0;
          localObject = null;
        }
      }
    }
    label506:
    label795:
    for (;;)
    {
      i2 = nextLesserThan8Bits(j);
      arrayOfShort1 = initBlack;
      i2 = arrayOfShort1[i2];
      i3 = i2 & 0x1;
      i3 = i2 >>> 1 & 0xF;
      i2 = i2 >>> 5 & 0x7FF;
      i4 = 100;
      if (i2 == i4)
      {
        i2 = nextNBits(i);
        arrayOfShort1 = black;
        i2 = arrayOfShort1[i2];
        i3 = i2 & 0x1;
        i4 = i2 >>> 1 & 0xF;
        i2 = i2 >>> 5 & 0x7FF;
        i5 = 12;
        if (i4 == i5)
        {
          updatePointer(5);
          i2 = nextLesserThan8Bits(j);
          arrayOfShort1 = additionalMakeup;
          i2 = arrayOfShort1[i2];
          i3 = i2 >>> 1 & 0x7;
          i2 = i2 >>> 4 & 0xFFF;
          setToBlack(paramArrayOfByte, paramInt1, paramInt2, i2);
          paramInt2 += i2;
          i2 = 4 - i3;
          updatePointer(i2);
        }
      }
      for (;;)
      {
        if (i1 == 0) {
          break label795;
        }
        i2 = this.w;
        if (paramInt2 != i2) {
          break;
        }
        align();
        break label37;
        i5 = 15;
        if (i4 == i5)
        {
          updatePointer(i);
          break label67;
        }
        setToBlack(paramArrayOfByte, paramInt1, paramInt2, i2);
        paramInt2 += i2;
        i2 = 9 - i4;
        updatePointer(i2);
        if (i3 == 0)
        {
          localObject = this.currChangingElems;
          i2 = this.changingElemSize;
          i3 = i2 + 1;
          this.changingElemSize = i3;
          localObject[i2] = paramInt2;
          i1 = n;
          continue;
          i1 = 200;
          if (i2 == i1)
          {
            i1 = nextLesserThan8Bits(k);
            short[] arrayOfShort2 = twoBitBlack;
            i1 = arrayOfShort2[i1];
            i2 = i1 >>> 5 & 0x7FF;
            i1 = i1 >>> 1 & 0xF;
            setToBlack(paramArrayOfByte, paramInt1, paramInt2, i2);
            paramInt2 += i2;
            i1 = 2 - i1;
            updatePointer(i1);
            localObject = this.currChangingElems;
            i2 = this.changingElemSize;
            i3 = i2 + 1;
            this.changingElemSize = i3;
            localObject[i2] = paramInt2;
            i1 = n;
          }
          else
          {
            setToBlack(paramArrayOfByte, paramInt1, paramInt2, i2);
            paramInt2 += i2;
            i1 = 4 - i3;
            updatePointer(i1);
            localObject = this.currChangingElems;
            i2 = this.changingElemSize;
            i3 = i2 + 1;
            this.changingElemSize = i3;
            localObject[i2] = paramInt2;
            i1 = n;
          }
        }
      }
    }
  }
  
  public void decodeT41D(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2)
  {
    int i = 0;
    this.data = paramArrayOfByte2;
    int j = (this.w + 7) / 8;
    this.bitPointer = 0;
    this.bytePointer = 0;
    int k = 0;
    for (;;)
    {
      if (i >= paramInt2) {
        return;
      }
      consumeEOL();
      decodeNextScanline(paramArrayOfByte1, k, paramInt1);
      k += j;
      i += 1;
    }
  }
  
  public void decodeT42D(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2)
  {
    this.data = paramArrayOfByte2;
    int i = (this.w + 7) / 8;
    this.bitPointer = 0;
    Object localObject1 = null;
    this.bytePointer = 0;
    int[] arrayOfInt1 = new int[2];
    int j = readEOL(true);
    int k = 1;
    if (j != k)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>("First scanline must be 1D encoded.");
      throw ((Throwable)localObject1);
    }
    localObject1 = null;
    decodeNextScanline(paramArrayOfByte1, 0, paramInt1);
    k = 0 + i;
    j = 1;
    int m = j;
    int n = k;
    if (m >= paramInt2) {
      return;
    }
    localObject1 = null;
    j = readEOL(false);
    int[] arrayOfInt2;
    int i1;
    boolean bool;
    int i2;
    int[] arrayOfInt3;
    if (j == 0)
    {
      localObject1 = this.prevChangingElems;
      arrayOfInt2 = this.currChangingElems;
      this.prevChangingElems = arrayOfInt2;
      this.currChangingElems = ((int[])localObject1);
      localObject1 = null;
      i1 = 0;
      this.lastChangingElement = 0;
      bool = true;
      k = -1;
      i2 = 0;
      arrayOfInt3 = null;
      j = paramInt1;
      label168:
      i1 = this.w;
      if (j >= i1)
      {
        arrayOfInt2 = this.currChangingElems;
        i1 = i2 + 1;
        arrayOfInt2[i2] = j;
        this.changingElemSize = i1;
      }
    }
    for (;;)
    {
      k = n + i;
      j = m + 1;
      m = j;
      n = k;
      break;
      getNextChangingElement(k, bool, arrayOfInt1);
      arrayOfInt2 = null;
      i1 = arrayOfInt1[0];
      k = arrayOfInt1[1];
      int i3 = nextLesserThan8Bits(7);
      Object localObject2 = twoDCodes;
      i3 = localObject2[i3] & 0xFF;
      int i4 = (i3 & 0x78) >>> 3;
      i3 &= 0x7;
      if (i4 == 0)
      {
        if (!bool)
        {
          i1 = k - j;
          setToBlack(paramArrayOfByte1, n, j, i1);
        }
        j = 7 - i3;
        updatePointer(j);
        j = k;
        break label168;
      }
      k = 1;
      if (i4 == k)
      {
        k = 7 - i3;
        updatePointer(k);
        if (bool)
        {
          k = decodeWhiteCodeWord();
          j += k;
          arrayOfInt2 = this.currChangingElems;
          i1 = i2 + 1;
          arrayOfInt2[i2] = j;
          k = decodeBlackCodeWord();
          setToBlack(paramArrayOfByte1, n, j, k);
          j += k;
          arrayOfInt3 = this.currChangingElems;
          k = i1 + 1;
          arrayOfInt3[i1] = j;
        }
        for (;;)
        {
          i2 = k;
          k = j;
          break;
          k = decodeBlackCodeWord();
          setToBlack(paramArrayOfByte1, n, j, k);
          j += k;
          arrayOfInt2 = this.currChangingElems;
          i1 = i2 + 1;
          arrayOfInt2[i2] = j;
          k = decodeWhiteCodeWord();
          j += k;
          arrayOfInt3 = this.currChangingElems;
          k = i1 + 1;
          arrayOfInt3[i1] = j;
        }
      }
      k = 8;
      if (i4 <= k)
      {
        k = i4 + -5 + i1;
        localObject2 = this.currChangingElems;
        i1 = i2 + 1;
        localObject2[i2] = k;
        if (!bool)
        {
          i2 = k - j;
          setToBlack(paramArrayOfByte1, n, j, i2);
        }
        if (bool)
        {
          j = 0;
          localObject1 = null;
        }
        for (;;)
        {
          i2 = 7 - i3;
          updatePointer(i2);
          i2 = i1;
          bool = j;
          j = k;
          break;
          j = 1;
        }
      }
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>("Invalid code encountered while decoding 2D group 3 compressed data.");
      throw ((Throwable)localObject1);
      decodeNextScanline(paramArrayOfByte1, n, paramInt1);
    }
  }
  
  public void decodeT6(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2)
  {
    int i;
    float f1;
    int k;
    float f2;
    Object localObject2;
    int m;
    int i1;
    boolean bool;
    float f3;
    int[] arrayOfInt3;
    float f4;
    int i3;
    label290:
    int i6;
    RuntimeException localRuntimeException;
    for (;;)
    {
      int i4;
      try
      {
        this.data = paramArrayOfByte2;
        i = this.w + 7;
        int j = i / 8;
        i = 0;
        f1 = 0.0F;
        int[] arrayOfInt1 = null;
        this.bitPointer = 0;
        i = 0;
        f1 = 0.0F;
        arrayOfInt1 = null;
        this.bytePointer = 0;
        i = 2;
        f1 = 2.8E-45F;
        int[] arrayOfInt2 = new int[i];
        arrayOfInt1 = this.currChangingElems;
        k = 0;
        f2 = 0.0F;
        localObject2 = null;
        this.changingElemSize = 0;
        k = this.changingElemSize;
        m = k + 1;
        this.changingElemSize = m;
        m = this.w;
        arrayOfInt1[k] = m;
        k = this.changingElemSize;
        m = k + 1;
        this.changingElemSize = m;
        m = this.w;
        arrayOfInt1[k] = m;
        k = 0;
        f2 = 0.0F;
        localObject2 = null;
        i = 0;
        f1 = 0.0F;
        arrayOfInt1 = null;
        int n = 0;
        i1 = 0;
        if (n >= paramInt2) {
          return;
        }
        i = -1;
        f1 = 0.0F / 0.0F;
        bool = true;
        f3 = Float.MIN_VALUE;
        arrayOfInt3 = this.prevChangingElems;
        localObject2 = this.currChangingElems;
        this.prevChangingElems = ((int[])localObject2);
        this.currChangingElems = arrayOfInt3;
        k = 0;
        f2 = 0.0F;
        localObject2 = null;
        m = 0;
        f4 = 0.0F;
        this.lastChangingElement = 0;
        i3 = paramInt1;
        i4 = i;
        i = this.w;
        if (i3 >= i)
        {
          align();
          i = this.w;
          if (k > i) {
            break label1330;
          }
          i = k + 1;
          arrayOfInt3[k] = i3;
          this.changingElemSize = i;
          k = i1 + j;
          i = n + 1;
          n = i;
          i1 = k;
          continue;
        }
        getNextChangingElement(i4, bool, arrayOfInt2);
        i = 0;
        f1 = 0.0F;
        arrayOfInt1 = null;
        m = arrayOfInt2[0];
        i = 1;
        f1 = Float.MIN_VALUE;
        i = arrayOfInt2[i];
        i5 = 7;
        i5 = nextLesserThan8Bits(i5);
        byte[] arrayOfByte = twoDCodes;
        i5 = arrayOfByte[i5] & 0xFF;
        i6 = (i5 & 0x78) >>> 3;
        i5 &= 0x7;
        if (i6 == 0)
        {
          if (!bool)
          {
            m = this.w;
            if (i > m) {
              i = this.w;
            }
            m = i - i3;
            setToBlack(paramArrayOfByte1, i1, i3, m);
          }
          m = 7 - i5;
          updatePointer(m);
          i3 = i;
          i4 = i;
          continue;
        }
        i = 1;
        f1 = Float.MIN_VALUE;
        if (i6 == i)
        {
          i = 7 - i5;
          updatePointer(i);
          if (bool)
          {
            i = decodeWhiteCodeWord();
            m = i3 + i;
            i5 = k + 1;
            arrayOfInt3[k] = m;
            i = decodeBlackCodeWord();
            k = this.w - m;
            if (i > k) {
              i = this.w - m;
            }
            setToBlack(paramArrayOfByte1, i1, m, i);
            i += m;
            k = i5 + 1;
            arrayOfInt3[i5] = i;
            i3 = i;
            i4 = i;
            continue;
          }
          i = decodeBlackCodeWord();
          m = this.w - i3;
          if (i > m) {
            i = this.w - i3;
          }
          setToBlack(paramArrayOfByte1, i1, i3, i);
          i += i3;
          m = k + 1;
          arrayOfInt3[k] = i;
          k = decodeWhiteCodeWord();
          i += k;
          k = m + 1;
          arrayOfInt3[m] = i;
          continue;
        }
        i = 8;
      }
      finally {}
      f1 = 1.1E-44F;
      if (i6 <= i)
      {
        i = i6 + -5 + m;
        m = k + 1;
        arrayOfInt3[k] = i;
        if (!bool)
        {
          k = this.w;
          if (i > k) {
            i = this.w;
          }
          k = i - i3;
          setToBlack(paramArrayOfByte1, i1, i3, k);
        }
        k = i;
        if (bool)
        {
          i = 0;
          f1 = 0.0F;
          localRuntimeException = null;
        }
        for (;;)
        {
          i5 = 7 - i5;
          updatePointer(i5);
          i3 = k;
          bool = i;
          f3 = f1;
          i4 = k;
          k = m;
          break;
          i = 1;
          f1 = Float.MIN_VALUE;
        }
      }
      i = 11;
      f1 = 1.5E-44F;
      if (i6 != i) {
        break label1304;
      }
      i = 3;
      f1 = 4.2E-45F;
      i = nextLesserThan8Bits(i);
      m = 7;
      f4 = 9.8E-45F;
      if (i != m)
      {
        localRuntimeException = new java/lang/RuntimeException;
        localObject2 = "Invalid code encountered while decoding 2D group 4 compressed data.";
        localRuntimeException.<init>((String)localObject2);
        throw localRuntimeException;
      }
      i5 = 0;
      f4 = 0.0F;
      i = 0;
      localRuntimeException = null;
      f1 = 0.0F;
      m = i3;
      i3 = k;
      k = 0;
      localObject2 = null;
      f2 = 0.0F;
      label944:
      if (i == 0) {
        break;
      }
      k = i3;
      i3 = m;
    }
    do
    {
      k += 1;
      i5 = 1;
      i5 = nextLesserThan8Bits(i5);
      i6 = 1;
    } while (i5 != i6);
    int i5 = 5;
    label1027:
    label1084:
    label1091:
    int i7;
    if (k > i5)
    {
      i5 = k + -6;
      if ((!bool) && (i5 > 0))
      {
        k = i3 + 1;
        arrayOfInt3[i3] = m;
        i3 = m + i5;
        if (i5 > 0)
        {
          bool = true;
          f3 = Float.MIN_VALUE;
        }
        i = 1;
        f1 = Float.MIN_VALUE;
        i = nextLesserThan8Bits(i);
        if (i == 0)
        {
          if (bool) {
            break label1344;
          }
          i = k + 1;
          arrayOfInt3[k] = i3;
          k = 1;
          f2 = Float.MIN_VALUE;
          m = 1;
          f4 = Float.MIN_VALUE;
          i7 = i;
          i = k;
          f1 = f2;
          k = i7;
        }
      }
    }
    for (;;)
    {
      int i2 = 5;
      f3 = 7.0E-45F;
      if (i5 == i2)
      {
        if (i != 0) {
          break label1337;
        }
        i = k + 1;
        arrayOfInt3[k] = i3;
      }
      for (;;)
      {
        k = i3 + i5;
        i2 = 1;
        f3 = Float.MIN_VALUE;
        i3 = i;
        i = m;
        f1 = f4;
        m = k;
        k = i5;
        break label944;
        if (i2 != 0)
        {
          i = k + 1;
          arrayOfInt3[k] = i3;
          k = i;
        }
        f1 = 0.0F;
        localRuntimeException = null;
        i7 = k;
        k = 0;
        localObject2 = null;
        f2 = 0.0F;
        i = i7;
        break label1091;
        i = i3 + i5;
        i3 = k + 1;
        arrayOfInt3[k] = i;
        k = 1;
        f2 = Float.MIN_VALUE;
        setToBlack(paramArrayOfByte1, i1, i, k);
        i += 1;
        i2 = 0;
        f3 = 0.0F;
        k = i5;
        i7 = m;
        m = i;
        i = i7;
        f1 = f4;
        break label944;
        label1304:
        i = 7 - i5;
        updatePointer(i);
        i = this.w;
        i3 = i;
        break;
        label1330:
        i = k;
        break label290;
        label1337:
        i = k;
      }
      label1344:
      i = k;
      break label1084;
      k = i3;
      break label1027;
      i5 = k;
      k = i3;
      i3 = m;
      m = i;
      f4 = f1;
      i = i2;
      f1 = f3;
    }
  }
  
  public boolean isAlign()
  {
    return this.align;
  }
  
  public boolean isFillBits()
  {
    return this.fillBits;
  }
  
  public void setAlign(boolean paramBoolean)
  {
    this.align = paramBoolean;
  }
  
  public void setFillBits(boolean paramBoolean)
  {
    this.fillBits = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decode\CCITTFaxDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */