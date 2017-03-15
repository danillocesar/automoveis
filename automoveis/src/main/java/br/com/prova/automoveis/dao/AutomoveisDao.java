package br.com.prova.automoveis.dao;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.prova.automoveis.entity.Automoveis;

public class AutomoveisDao {
	
    
	/**
	  * Object
	  * Retorna objeto automovel de acordo com o id recebido
	  * É necessario encontrar na lista em memoria o automovel
	  */
	public Automoveis getById(int id){
		//procura na lista o automovel com o id enviado
		for(Automoveis a : listAll()){
			if(a.getId() == id){
				return a;
			}
		}
		return null;
	}
	/**
	  * Lista
	  * Retorna lista de automoveis cadastrados
	  * Lista é guardada em um arquivo temporario utilizando o serializable
	  */
	public List<Automoveis> listAll(){
		List<Automoveis> l = new ArrayList<>();
		 try {
	         FileInputStream fileIn = new FileInputStream("automoveis.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         l = (List<Automoveis>) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i) {
	         i.printStackTrace();
	      }catch(ClassNotFoundException c) {
	         c.printStackTrace();
	      }
		return l;
	}
	/**
	  * void
	  * Procura na lista um automovel com o mesmo id, caso encontre, substitui com  o novo (editado),
	  * caso não encontre, cria um novo e adiciona na lista
	  */
	public void save(Automoveis automovel){
		List<Automoveis> l = listAll();
		if(automovel.getId() > 0){
			for(Automoveis a : l){
				if(a.getId().intValue() == automovel.getId().intValue()){
					a.setMarca(automovel.getMarca());
					a.setCor(automovel.getCor());
					a.setModelo(automovel.getModelo());
					a.setPlaca(automovel.getPlaca());
					break;
				}
			}
		}else{
			automovel.setId(l.isEmpty()?1:(l.get(l.size()-1).getId()+1));
			l.add(automovel);
		}
		try {
	         FileOutputStream fileOut = new FileOutputStream("automoveis.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(l);
	         out.close();
	         fileOut.close();
	      }catch(IOException i) {
	         i.printStackTrace();
	      }
	}
	/**
	  * void
	  * Procura na lista um automovel com o mesmo id para remoção
	  */
	public void remove(Automoveis automovel){
		List<Automoveis> l = listAll();
		for (Iterator<Automoveis> iter = l.listIterator(); iter.hasNext();) {
			Automoveis a = iter.next();
			if(a.getId().intValue() == automovel.getId().intValue()){
		        iter.remove();
		        break;
		    }
		}
		try {
	         FileOutputStream fileOut = new FileOutputStream("automoveis.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(l);
	         out.close();
	         fileOut.close();
	      }catch(IOException i) {
	         i.printStackTrace();
	      }
	}
}
