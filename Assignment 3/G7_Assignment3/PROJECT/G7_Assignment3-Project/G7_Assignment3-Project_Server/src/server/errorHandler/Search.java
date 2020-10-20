/*
 * this class extends the abstract class AbstractError.
 * executing the handle function from super class , direct the program to diagnose 
 * the action type then call one from these functions : addAction ,getAction ,updateAction,deleteAction 
 * to handle errors and show message correspondingly
*/
package server.errorHandler;

import entities.Packet;

// TODO: Auto-generated Javadoc
/**
 * The Class Search.
 * Extends AbstractError
 * Adding execute error of action
 */
public class Search extends AbstractError {


	/**
	 * Instantiates a new rate.
	 *
	 * @param window the window
	 */
	public Search(String window) {
		super(window);
	}

	/* (non-Javadoc)
	 * @see server.errorHandler.AbstractError#getAction(entities.Packet)
	 */
	@Override
	protected Packet<String> getAction(Packet<String> pkt) {
		switch(pkt.getSub_action()) {
		case config.packetTransfer.actions.Search.SUB_ACTION_GET_SEARCH_BY_CITY_NAME:
			pkt.setData(config.packetTransfer.server.errors.Search.SUB_ACTION_ERROR_GET_SEARCH_BY_CITY_NAME);
			break;
			case config.packetTransfer.actions.Search.SUB_ACTION_GET_SEARCH_BY_TEXT_MAP:
				pkt.setData(config.packetTransfer.server.errors.Search.SUB_ACTION_ERROR_GET_SEARCH_BY_TEXT_MAP);
			break;
			case config.packetTransfer.actions.Search.SUB_ACTION_GET_SEARCH_BY_TEXT_CITY:
				pkt.setData(config.packetTransfer.server.errors.Search.SUB_ACTION_ERROR_GET_SEARCH_BY_TEXT_CITY);
			break;
			case config.packetTransfer.actions.Search.SUB_ACTION_GET_SEARCH_BY_POI:
				pkt.setData(config.packetTransfer.server.errors.Search.SUB_ACTION_ERROR_GET_SEARCH_BY_POI);
			break;
		}
		return pkt;
	}

	/* (non-Javadoc)
	 * @see server.errorHandler.AbstractError#deleteAction(entities.Packet)
	 */
	@Override
	protected Packet<String> deleteAction(Packet<String> pkt) {
		switch(pkt.getSub_action()) {
		case config.packetTransfer.actions.Rate.SUB_ACTION_DELETE_RATE:
			pkt.setData(config.packetTransfer.server.errors.Rate.SUB_ACTION_ERROR_DELETE_RATE);
			break;
		}
		return pkt;
	}

	/* (non-Javadoc)
	 * @see server.errorHandler.AbstractError#addAction(entities.Packet)
	 */
	@Override
	protected Packet<String> addAction(Packet<String> pkt) {
		return pkt;
	}

	/* (non-Javadoc)
	 * @see server.errorHandler.AbstractError#updateAction(entities.Packet)
	 */
	@Override
	protected Packet<String> updateAction(Packet<String> pkt) {
		switch(pkt.getSub_action()) {
		case config.packetTransfer.actions.Rate.SUB_ACTION_UPDATE_RATE:
			pkt.setData(config.packetTransfer.server.errors.Rate.SUB_ACTION_ERROR_UPDATE_RATE);
			break;
		}
		return pkt;
	}
	
}
