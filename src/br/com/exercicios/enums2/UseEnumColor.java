package br.com.exercicios.enums2;

import br.com.exercicios.enums.EnumColor;
import static br.com.exercicios.enums.EnumColor.*;

/**
 * Para utilizar EnumColor é necessário realizar importacao normal
 * import br.com.exercicios.enums.EnumColor;
 * 
 * Para utilizar VERDE diretamente, é necessário importar o membro static
 * import static br.com.exercicios.enum.EnumColor.*;
 * ou
 * import static br.com.exercicios.enum.EnumColor.GREEN;
 * 
 * @author Leandro
 *
 */
public class UseEnumColor {

	public static void main(String[] args) {
		System.out.println(EnumColor.VERDE);
		System.out.println(VERDE);
	}
}
