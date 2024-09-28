package br.mendonca;

import br.mendonca.controller.ServiceExit1;
import br.mendonca.model.BuildData;
import br.mendonca.view.Tela;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		
		BuildData model = BuildData.getInstance();
		model.start();

		Tela view = new Tela(model);
		
		
		/*
		BuildData bd = new BuildData();
		new Tela(bd);
		
		bd.start();
		
		Thread.sleep(5000);
		System.out.println(bd.getMensagem());
		*/
	}

}
