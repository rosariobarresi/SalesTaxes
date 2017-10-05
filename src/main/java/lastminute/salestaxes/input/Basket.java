package lastminute.salestaxes.input;

import java.util.ArrayList;
import java.util.List;

import lastminute.salestaxes.bean.Item;

public class Basket {

	private List<Item> listItem;

	public void setListItem(List<Item> listItem) {
		this.listItem = listItem;
	}

	public List<Item> getListItem() {
		return listItem;
	}

	public void addItem(Item item) {
		if (listItem == null) {
			listItem = new ArrayList<Item>();
		}
		listItem.add(item);
	}

	@Override
	public String toString() {
		StringBuffer builder = new StringBuffer();
		builder.append("Basket [listItem=");
		builder.append(listItem);
		builder.append("]");
		return builder.toString();
	}

}
