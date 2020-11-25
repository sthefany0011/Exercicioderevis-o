package ExercicioRevisao;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Estoque {
	
	private String tipo;
	private double valorVenda;
	private int qnt;
	private Date dataEntrada;
	private String data;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	public Date getDataEntrada() {
		return  dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Estoque (String tipo, double valorVenda, int qnt, String data) throws ParseException {
		super();
		this.tipo = tipo;
		this.valorVenda = valorVenda;
		this.qnt = qnt;
		this.dataEntrada = sdf.parse(data);
	}
	@Override
	public String toString() {
		return "produto =" + tipo + ", valorVenda=" + valorVenda + ", qnt=" + qnt + ", dataEntrada=" + sdf.format(dataEntrada)
				+ "]";
	}
	
	
}
