package abstractiondemo;

public class BlankFinalStaticVar {

static final int data;

static {
	data=5;
}

int cube(final int n)
{
	//n=n+1; the value cannot be changed as it has been assigned as final
	// It must be blank and not using a compound assignment
	return n*n*n;
}
	public static void main(String[] args) {
		System.out.println(BlankFinalStaticVar.data);

	}

}
