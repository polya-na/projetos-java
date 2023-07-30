package bootcamp.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo {
	private LocalDateTime data;

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

}
