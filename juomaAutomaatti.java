package juomaAutomaatti;

public class juomaAutomaatti {
	
	
public juomaAutomaatti() {
		teet� = 50;
		kahvia = 50;
		kaakaota = 50;
	}
	

		private int teet�;
		private int kahvia;
		private int kaakaota;
		
		

		public int getKahvia() {
			return kahvia;
		}
		public int getTeet�() {
			return teet�;
		}
		public int getKaakaota() {
			return kaakaota;
		}
		public void setKahvia(int kahvia) {
			this.kahvia = kahvia;
		}
		public void setTeet�(int teet�) {
			this.teet�=teet�;
		}
		public void setKaakaota (int kaakaota) {
			this.kaakaota = kaakaota;
		}
		public boolean onnistuuko() {
			int luku2 = (int)(Math.random() * 100+1);
			if (luku2<=25) {
				System.out.println("Ei onnistu, kiitos kuitenkin rahoista");
				return false;
			}
			else {
				return true;
			}
		}
		
		public void valmistaKahvi() {
			if (onnistuuko())
			if(kahvia>10) {
			this.kahvia = kahvia -10;
			System.out.println("Odota hetki, Kahvisi valmistuu. Kahvia j�ljell� "+kahvia+" yksikk��");
			}
			else {
				System.out.println("Kahvia ei ole j�ljell�. T�yt� s�ili�!");
			}
			
		}
		public void valmistaTee() {
			if (onnistuuko())
			if(teet�>10) {
			this.teet� = teet� -10;
			System.out.println("Odota hetki, Teesi valmistuu. Teet� j�ljell� "+teet�+" yksikk��");
			}
			else {
				System.out.println("Teet� ei ole j�ljell�. T�yt� s�ili�!");
			}
			
		}
		public void valmistaKaakao() {
			if (onnistuuko())
			if(kaakaota>10) {
			this.kaakaota = kaakaota -10;
			System.out.println("Odota hetki, Kaakaosi valmistuu. Kaakaota j�ljell� "+kaakaota+" yksikk��");
		}
		else {
			System.out.println("Kaakaota ei ole j�ljell�. T�yt� s�ili�!");
		}
		}


		
		public String tostring() {
			return"JuomaAutomaatti [kahvia=" + kahvia + ""
					+ ", teet�=" + teet� + ", kaakaota=" + kaakaota + "]";
			
		}
		
		
		
		
	
		
}
