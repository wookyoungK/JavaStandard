package ch12;

class NewClass {
	int newField;

	int getNewField() { 
		return newField;
	}	

	@Deprecated
	int oldField;

	@Deprecated
	int getOldField() { 
		return oldField;
	}
}

class AnnotationEx2 {
	public static void main(String args[]) {
		NewClass nc = new NewClass();

		nc.oldField = 10;                     //@Depreacted�� ���� ����� ���
		System.out.println(nc.getOldField()); //@Depreacted�� ���� ����� ���
	}
}
