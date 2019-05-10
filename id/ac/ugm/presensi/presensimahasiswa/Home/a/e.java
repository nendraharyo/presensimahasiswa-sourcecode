package id.ac.ugm.presensi.presensimahasiswa.Home.a;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class e
  extends RecyclerView.Adapter
{
  private Context a;
  
  public e(Context paramContext, String paramString)
  {
    this.a = paramContext;
  }
  
  private void a() {}
  
  public e.a a(ViewGroup paramViewGroup, int paramInt)
  {
    View localView = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131427392, paramViewGroup, false);
    e.a locala = new id/ac/ugm/presensi/presensimahasiswa/Home/a/e$a;
    locala.<init>(this, localView);
    return locala;
  }
  
  public void a(e.a parama, int paramInt)
  {
    int i = 2131230881;
    Object localObject1;
    Object localObject2;
    if (paramInt == 0)
    {
      parama.a.setText("56 poin");
      localObject1 = parama.b;
      localObject2 = "PAKET 1 KFC";
      ((TextView)localObject1).setText((CharSequence)localObject2);
      localObject1 = parama.c;
      ((ImageView)localObject1).setBackgroundResource(i);
    }
    for (;;)
    {
      localObject1 = parama.d;
      localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/a/e$1;
      ((e.1)localObject2).<init>(this);
      ((CardView)localObject1).setOnClickListener((View.OnClickListener)localObject2);
      return;
      int j = 1;
      if (paramInt == j)
      {
        parama.a.setText("89 poin");
        localObject1 = parama.b;
        localObject2 = "PULSA SIMPATI 100 RIBU";
        ((TextView)localObject1).setText((CharSequence)localObject2);
        localObject1 = parama.c;
        ((ImageView)localObject1).setBackgroundResource(i);
      }
      else
      {
        j = 2;
        if (paramInt == j)
        {
          parama.a.setText("65 poin");
          localObject1 = parama.b;
          localObject2 = "VOUCHER STARBUCKS";
          ((TextView)localObject1).setText((CharSequence)localObject2);
          localObject1 = parama.c;
          ((ImageView)localObject1).setBackgroundResource(i);
        }
        else
        {
          j = 3;
          if (paramInt == j)
          {
            parama.a.setText("99 poin");
            localObject1 = parama.b;
            localObject2 = "VOUCHER MAXX COFFEE";
            ((TextView)localObject1).setText((CharSequence)localObject2);
            localObject1 = parama.c;
            ((ImageView)localObject1).setBackgroundResource(i);
          }
        }
      }
    }
  }
  
  public int getItemCount()
  {
    return 4;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\a\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */