package spittr.repository;

import javax.validation.Valid;

import spittr.model.Spitter;

public interface SpitterRepository {

	void save(@Valid Spitter spitter);

}
