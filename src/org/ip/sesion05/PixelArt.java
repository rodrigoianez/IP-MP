package org.ip.sesion05;

public class PixelArt {

	public static void main(String[] args) {

		final String PIXEL = "  ";

		final String BLACK_BACKGROUND = "\033[40m"; // BLACK		
		final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
		final String CYAN_BACKGROUND = "\033[46m"; // CYAN		
		
		final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";
		
		final int SIZE = 15;
		
		String[][] emoji = new String[SIZE][SIZE];
	
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				emoji[i][j] = "  ";

			}
		}

		
	
		emoji[0][0] = CYAN_BACKGROUND + PIXEL;
		emoji[0][5] = BLACK_BACKGROUND + PIXEL;
		emoji[0][10] = CYAN_BACKGROUND + PIXEL;
		emoji[1][3] = BLACK_BACKGROUND + PIXEL;
		emoji[1][5] = YELLOW_BACKGROUND + PIXEL;
		emoji[1][10] = BLACK_BACKGROUND + PIXEL;
		emoji[1][12] = CYAN_BACKGROUND + PIXEL;
		emoji[2][2] = BLACK_BACKGROUND + PIXEL;
		emoji[2][3] = YELLOW_BACKGROUND + PIXEL;
		emoji[2][12] = BLACK_BACKGROUND + PIXEL;
		emoji[2][13] = CYAN_BACKGROUND + PIXEL;
		emoji[3][1] = BLACK_BACKGROUND + PIXEL;
		emoji[3][2] = YELLOW_BACKGROUND + PIXEL;
		emoji[3][13] = BLACK_BACKGROUND + PIXEL;
		emoji[3][14] = CYAN_BACKGROUND + PIXEL;
		emoji[4][1] = BLACK_BACKGROUND + PIXEL;
		emoji[4][2] = YELLOW_BACKGROUND + PIXEL;
		emoji[4][13] = BLACK_BACKGROUND + PIXEL;
		emoji[4][14] = CYAN_BACKGROUND + PIXEL;
		emoji[5][0] = BLACK_BACKGROUND + PIXEL;
		emoji[6][1] = YELLOW_BACKGROUND + PIXEL;
		emoji[6][2] = BLACK_BACKGROUND + PIXEL;
		emoji[6][3] = WHITE_BACKGROUND_BRIGHT + PIXEL;
		emoji[6][5] = BLACK_BACKGROUND + PIXEL;
		emoji[6][9] = WHITE_BACKGROUND_BRIGHT + PIXEL;
		emoji[6][11] = BLACK_BACKGROUND + PIXEL;
		emoji[6][13] = YELLOW_BACKGROUND + PIXEL;
		emoji[6][14] = BLACK_BACKGROUND + PIXEL;
		emoji[7][1] = YELLOW_BACKGROUND + PIXEL;
		emoji[7][2] = BLACK_BACKGROUND + PIXEL;
		emoji[7][3] = WHITE_BACKGROUND_BRIGHT + PIXEL;
		emoji[7][4] = BLACK_BACKGROUND + PIXEL;
		emoji[7][7] = YELLOW_BACKGROUND + PIXEL;
		emoji[7][8] = BLACK_BACKGROUND + PIXEL;
		emoji[7][9] = WHITE_BACKGROUND_BRIGHT + PIXEL;
		emoji[7][10] = BLACK_BACKGROUND + PIXEL;
		emoji[7][13] = YELLOW_BACKGROUND + PIXEL;
		emoji[7][14] = BLACK_BACKGROUND + PIXEL;
		emoji[8][1] = YELLOW_BACKGROUND + PIXEL;
		emoji[8][3] = BLACK_BACKGROUND + PIXEL;
		emoji[8][6] = YELLOW_BACKGROUND + PIXEL;
		emoji[8][9] = BLACK_BACKGROUND + PIXEL;
		emoji[8][12] = YELLOW_BACKGROUND + PIXEL;
		emoji[8][14] = BLACK_BACKGROUND + PIXEL;
		emoji[9][1] = YELLOW_BACKGROUND + PIXEL;
		emoji[9][14] = BLACK_BACKGROUND + PIXEL;
		emoji[10][0] = CYAN_BACKGROUND + PIXEL;
		emoji[10][1] = BLACK_BACKGROUND + PIXEL;
		emoji[10][2] = YELLOW_BACKGROUND + PIXEL;
		emoji[10][10] = BLACK_BACKGROUND + PIXEL;
		emoji[10][11] = YELLOW_BACKGROUND + PIXEL;
		emoji[10][13] = BLACK_BACKGROUND + PIXEL;
		emoji[10][14] = CYAN_BACKGROUND + PIXEL;
		emoji[11][1] = BLACK_BACKGROUND + PIXEL;
		emoji[11][2] = YELLOW_BACKGROUND + PIXEL;
		emoji[11][5] = BLACK_BACKGROUND + PIXEL;
		emoji[11][10] = YELLOW_BACKGROUND + PIXEL;
		emoji[11][13] = BLACK_BACKGROUND + PIXEL;
		emoji[11][14] = CYAN_BACKGROUND + PIXEL;
		emoji[12][2] = BLACK_BACKGROUND + PIXEL;
		emoji[12][3] = YELLOW_BACKGROUND + PIXEL;
		emoji[12][12] = BLACK_BACKGROUND + PIXEL;
		emoji[12][13] = CYAN_BACKGROUND + PIXEL;
		emoji[13][3] = BLACK_BACKGROUND + PIXEL;
		emoji[13][5] = YELLOW_BACKGROUND + PIXEL;
		emoji[13][10] = BLACK_BACKGROUND + PIXEL;
		emoji[13][12] = CYAN_BACKGROUND + PIXEL;
		emoji[14][5] = BLACK_BACKGROUND + PIXEL;
		emoji[14][10] = CYAN_BACKGROUND + PIXEL;

		for (int i = 0; i < SIZE; i++) {
			
			for (int j = 0; j < emoji[i].length; j++)
				System.out.print(emoji[i][j]);
			System.out.println();
		}
	}
}
