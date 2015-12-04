package rml.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rml.dao.HistoryTagMapper;
import rml.model.HistoryTag;
import rml.service.HistoryTagService;

@Service("historyTagService")
public class HistoryTagServiceImpl implements HistoryTagService{

	@Autowired
	HistoryTagMapper historyTagMapper;
	
	@Override
	public List<HistoryTag> getAll() {
		return historyTagMapper.getAll();
	}

	@Override
	public int insert(HistoryTag tag) {
		return historyTagMapper.insert(tag);
	}

}
