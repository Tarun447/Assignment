package capgemini.a2;

abstract class Persistance
{
	abstract public void persist();
}

class FilePersistance extends Persistance
{
	public void persist()
	{
		System.out.println("File Persistance");
	}
}

class DatabasePersistance extends Persistance
{
	public void persist()
	{
		System.out.println("Database Persistance");
	}
}
public class AbsractPersistance {
public static void main(String[] args) {
	Persistance ps = new FilePersistance();
	ps.persist();
	
	Persistance ps1 = new DatabasePersistance();
	ps1.persist();
}
}
