package repository;

import java.util.List;

import org.junit.jupiter.api.Test;

class TestBateauRepo {

	@Test
	void test() {
		List<String> res = BateauRepo.findAll();
		System.out.println(res);
	}

}
