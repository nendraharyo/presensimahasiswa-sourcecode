package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;

final class DecodeJob$DecodeCallback
  implements DecodePath.DecodeCallback
{
  private final DataSource dataSource;
  
  DecodeJob$DecodeCallback(DecodeJob paramDecodeJob, DataSource paramDataSource)
  {
    this.dataSource = paramDataSource;
  }
  
  public Resource onResourceDecoded(Resource paramResource)
  {
    DecodeJob localDecodeJob = this.this$0;
    DataSource localDataSource = this.dataSource;
    return localDecodeJob.onResourceDecoded(localDataSource, paramResource);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DecodeJob$DecodeCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */