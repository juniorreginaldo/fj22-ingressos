package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public class SemDesconto implements Desconto {
	
	@Override
	public String getDescricao() {
		return "Normal";
	}
	
	public class DescontoParaEstudantes implements Desconto{
		@Override
		public String getDescricao() {
			return "Desconto Estudante";
		}


		
		public class DescontoParaBancos implements Desconto{
			@Override
			public String getDescricao() {
				return "Desconto Banco";
			}

			@Override
			public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
				// TODO Auto-generated method stub
				return null;
			}
		}



		@Override
		public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
			// TODO Auto-generated method stub
			return null;
		}	
	}

	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		// TODO Auto-generated method stub
		return null;
	}

}
