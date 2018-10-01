package alunos.dao;

import java.util.ArrayList;

import alunos.modelos.Aluno;

public interface Dao {
	
	void inserir(Aluno aluno);
	
	ArrayList<Aluno> listar();
	
}
 