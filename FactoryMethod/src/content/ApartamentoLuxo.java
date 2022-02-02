package content;

public class ApartamentoLuxo extends Apartamento{
	
	protected String tipo_luminaria;
	protected String possui_geladeira;
	
	public ApartamentoLuxo(int num_app, int andar, String tipo_app, String tipo_luminaria, String possui_geladeira) {
		super(num_app,andar,tipo_app);
		this.tipo_luminaria = tipo_luminaria;
		this.possui_geladeira = possui_geladeira;
	}
	
}
