package Interface;

public class Ventilador implements IEletronico {
	
	private boolean ligar = false;

	@Override
	public void liga() {
		if(!this.ligar ) {
			this.ligar = true;
			System.out.println("Ligado");
		}
	}

	@Override
	public void desliga() {
		if(this.ligar) {
			this.ligar = false;
			System.out.println("Desligado");
		}else {
			System.out.println("Ventilador ja desligado");
		}
		
	}

}
