package rml.service;

import java.util.List;

import rml.model.HistoryTag;


public interface HistoryTagService {

	List<HistoryTag> getAll();
	
    int insert(HistoryTag tag);

}
