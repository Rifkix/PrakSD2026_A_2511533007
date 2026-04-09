package pekan3_2511533007;
import java.util.ArrayList;

class Siswa_3007 {
	String nama_3007;
	int nim_3007;
	
	public Siswa_3007(String nama_3007, int nim_3007) {
		this.nama_3007 = nama_3007;
		this.nim_3007 = nim_3007;
	}
	
	@Override
	public String toString() {
		return "Nim: " + nim_3007 + ", Nama: " + nama_3007;
	}
}

public class SiswaStack_2511533007 {
	private ArrayList<Siswa_3007> stack_3007;
	
	public SiswaStack_2511533007() {
		stack_3007 = new ArrayList<>();
		
	}
	
	public void push_3007(Siswa_3007 mhs_3007) {
		stack_3007.add(mhs_3007);
	}
	public Siswa_3007 pop_3007() {
		if (!isEmpty_3007()) {
			return stack_3007.remove(stack_3007.size() - 1);
		}
		return null;
	}
	public Siswa_3007 peek_3007() {
		if (!isEmpty_3007()) {
			return stack_3007.get(stack_3007.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty_3007() {
		return stack_3007.isEmpty();
	}
	public void tampilkanSiswa_3007() {
		for (int i = stack_3007.size() - 1; i >= 0; i--) {
			System.out.println(stack_3007.get(i));
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511533007 studentStack_3007 = new SiswaStack_2511533007();
		
		Siswa_3007 mhs1_3007 = new Siswa_3007("Alis", 1);
		Siswa_3007 mhs2_3007 = new Siswa_3007("Boby", 2);
		Siswa_3007 mhs3_3007 = new Siswa_3007("Charles", 3);
		
		studentStack_3007.push_3007(mhs1_3007);
		studentStack_3007.push_3007(mhs2_3007);
		studentStack_3007.push_3007(mhs3_3007);
		
		System.out.println("Siswa di dalam stack:");
		studentStack_3007.tampilkanSiswa_3007();
		
		System.out.println("siswa teratas " + studentStack_3007.peek_3007());
		System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack_3007.pop_3007());
		System.out.println("daftar siswa setelah di pop :");
		studentStack_3007.tampilkanSiswa_3007();
		
	}

}
