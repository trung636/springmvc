package spittr.repository.imp;

import javax.validation.Valid;

import spittr.model.Spitter;
import spittr.repository.SpitterRepository;

public class SpitterRepositoryImp implements SpitterRepository {

	@Override
	public void save(@Valid Spitter spitter) {
		System.out.println("hello");
	}

}
