package part05_exam;

public class ServiceImp implements Service{
	private MemDaoImp mdi;
	
	public ServiceImp() {
	
	}

	@Override
	public void prn() {
		mdi.selectMethod();
	}

	public MemDaoImp getMdi() {
		return mdi;
	}

	public void setMdi(MemDaoImp mdi) {
		this.mdi = mdi;
	}
	
}
