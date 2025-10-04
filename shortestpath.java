package String;

public class shortestpath {

	public static void main(String[] args) {
		String str ="WNEENESENNN";
		System.out.println(getshortestpath(str));
		
	}
	public static int getshortestpath(String str) { 
		int x=0 ;int y=0;
		for(int i=0;i<str.length();i++) {
			char dir =str.charAt(i);
			if(dir =='S') {
				y--;
			}
			else if( dir =='N') {
				y++;
			}
			else if ( dir == 'E') {
				x++;
			}
			else { 
				if ( dir == 'w') {
					x--;
				}
			}
		}
		int x2=x*x;
		int y2=y*y;
		return (int) Math.sqrt((x2-x)+(y2-y));
		 
		
	}

}
