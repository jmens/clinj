package io.swagger.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

public class Calls {

	@ApiModelProperty(value = "")
	private List<Call> data = new ArrayList<Call>();

	/**
	 * Get data
	 *
	 * @return data
	 **/
	public List<Call> getData() {
		return data;
	}

	public void setData(List<Call> data) {
		this.data = data;
	}

	public Calls data(List<Call> data) {
		this.data = data;
		return this;
	}

	public Calls addDataItem(Call dataItem) {
		this.data.add(dataItem);
		return this;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Calls {\n");

		sb.append("    data: ").append(toIndentedString(data)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private static String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}

