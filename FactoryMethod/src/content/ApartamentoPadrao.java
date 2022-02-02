package content;

public class ApartamentoPadrao extends Apartamento{

	protected String tipo_armario;
	protected String tipo_piso;
	
	public ApartamentoPadrao(int num_app, int andar, String tipo_app, String tipo_armario, String tipo_piso) {
		super(num_app,andar,tipo_app);
		this.tipo_armario = tipo_armario;
		this.tipo_piso = tipo_piso;
	}
	
	
}
