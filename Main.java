import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String first = "krt17,opn1mw3,ppa1b,gb:co360592;ndufb4,apoba,gcdhb,glulb,cops3,rpl9,mcee,nme3,rpl28,hadhaa,pitrm1,rpl13,ctsd,mao,hars,yars,ca2,rpl15,myl6,inpp5kb,tpm4a,prdx1,zgc:92630,akap12b,histh1l,serpinc1,epd,ca4a,opn1mw1,crygs1,crybb2,crygm7,crygm6,crygna,crygm2b;crygm2c,grifin,park7,crygm2a,krt17,cryba2b;cryba2a,crybb1,aimp2,pnpo,gig2l,DKEY-75L1.5-001,crygm1;zgc:153846,crybb1l2;crybb1l1,crygs3,jupa,tmed10";
        String second = "LOC100005356,soul5,gig2l,ndufb10,h2afy2,cngb1a,gnas,CRP5.2,ndrg1b,scrn2,CRP3.2,zgc:152945,si:dkey-105h12.2,itgb1b.2;itgb1b.1,apobb.1,zgc:175088,aldh6a1,rab6a,nsfb,rplp0,ca2,LOC557979,prdx6,anp32b,pdxkb,psmd8,rpl24,sae1,unc119a,crk,arl3l1,viml,nae1,gspt1l,cops4,dnaja2,dpysl3,ddost,hrasa;,wars,tuba1c,eno1b,vps29,eef2l2,tp53rk,hspa8,ddx19,gng2,si:dkey-94f20.4,pkma,cbx3a,ywhaba,arl3l2,ncaldb,pabpn1,zgc:112492,arhgdia,bin1a,eif2s1b;eif2s1a,lcp1,ech1,ldha,gclc,cdk5,dnm2a,phyhipla;phyhiplb;phyhipl,si:ch211-251b21.1;Si:ch211-251b21.1,ddah2,psma5,vat1,nme3,crmp1";
        String[] firstConv = splitByChar(first, ',');
        String[] secondConv = splitByChar(second, ',');
        List<String> returnString = new ArrayList<>();

        for (String str : firstConv) {
            for (String compStr : secondConv) {
                if (str.equals(compStr)) {
                    returnString.add(str);
                    System.out.println("found: " + str);
                }
            }
        }
    }

    public static String[] splitByChar(String input, char separator) {
        return input.split(String.valueOf(separator));
    }
}
