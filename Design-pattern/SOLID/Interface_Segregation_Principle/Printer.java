class Document {

}

interface Machine {
	void print(Document d);
	void fax(Document d);
	void scan(Document d);
}

class MultiFunctionPrinter implements Machine {

	@Override
	public void print(Document d) {}

	@Override
	public void fax(Document d) {}

	@Override
	public void scan(Document d) {}
}

class OldFahsionPrinter implements Machine {

	/**
	 * lets assume old fahsion printer only wants to print, the fact that we implemented the Machine
	 * Interface means we have to override and write the implementation of all the methods available in 
	 * the interface
	 * - An old fahsion printer only needs the print method
	 * - Throwing error for methods with no implementation is a messy way to fix this
	 */
	@Override
	public void print(Document d) {}

	@Override
	public void fax(Document d) {}

	@Override
	public void scan(Document d) {}
}

// Solution

/** 
 * Split the interface into smaller interfaces
 */
interface Printer {
	void print(Document d);
}

interface Scanner {
	void scan(Document d)
}

class JustAPrinter implements Printer {
	@Override
	public void print(Document d) {}
}

class PhotoCopier implements Printer, Scanner {

	@Override
	public void print(Document d) {}

	@Override
	public void scan(Document d) {}
}

/** 
 * Another way of doing things
 * */ 
interface MultiFunctionDevice extends Printer, Scanner {

}
class MultiFunctionMachine implements MultiFunctionDevice {

	@Override
	public void print(Document d) {}

	@Override
	public void scan(Document d) {}
}

