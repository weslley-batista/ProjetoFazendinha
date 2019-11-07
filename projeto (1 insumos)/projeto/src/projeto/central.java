package projeto;
import java.util.*;
public class central {

	public static void main(String[] args) {
		racaoArray  racao = new racaoArray();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe em qual item voce deseja mexer");
		System.out.println("1 - Remedio");
		System.out.println("2 - Boi");
		System.out.println("3 - Ração");
		int itemInsumo = in.nextInt();
		
		switch(itemInsumo)
		{
			case '1':
			{
				System.out.println("O que deseja fazer em Remedio");
				System.out.println("1 - Inserir");
				System.out.println("2 - Remover");
				System.out.println("3 - Listar");
				int comando = in.nextInt();
				switch (comando)
				{
					case'1':
					{
						racao.inserir(item, quantitem);
					}
				}
				
				break;
			}
			case '2':
			{
				System.out.println("O que deseja fazer em Boi");
				System.out.println("1 - Inserir");
				System.out.println("2 - Remover");
				System.out.println("3 - Listar");
			}
			case '3':
			{
				System.out.println("O que deseja fazer em Racao");
				System.out.println("1 - Inserir");
				System.out.println("2 - Remover");
				System.out.println("3 - Listar");
			}
		}
		
		in.close();
		
	}

}
