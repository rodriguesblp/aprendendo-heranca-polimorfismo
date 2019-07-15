package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Empregado;
import entidades.EmpregadoTerceiro;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List <Empregado> listaEmpregados = new ArrayList<>();
		
		System.out.print("Quantos funcionários irá cadastrar: ");
		int n = sc.nextInt();
		
		for(int i = 1;i <= n;i++) {
			System.out.println("Digitando funcionário #" + i);
			System.out.print("O funcionário é terceirizado: (y/n)");
			char ch = sc.next().charAt(0);
			
			if (ch == 'y') {
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Horas: ");
				int horas = sc.nextInt();
				System.out.print("Valor por hora: ");
				double valorHora = sc.nextDouble();
				System.out.print("Valor adicional: ");
				double valorAdicional = sc.nextDouble();
				
				EmpregadoTerceiro t = new EmpregadoTerceiro(nome, horas, valorHora, valorAdicional);
				listaEmpregados.add(t);
			}
			else {
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Horas: ");
				int horas = sc.nextInt();
				System.out.print("Valor por hora: ");
				double valorHora = sc.nextDouble();
				
				Empregado e = new Empregado(nome, horas, valorHora);
				listaEmpregados.add(e);
				}
			System.out.println("");
		}
			

	for (Empregado e : listaEmpregados) {
		System.out.println(e);
		}
		sc.close();		
	}
}
