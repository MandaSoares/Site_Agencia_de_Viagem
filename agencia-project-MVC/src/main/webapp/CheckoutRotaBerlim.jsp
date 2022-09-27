<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check Out</title>
<link rel="stylesheet" href="estilo.css">
</head>
<body>

	<!-- Inicio Código -->


	<!-- Inicio Topo -->

	<header>
		<div class="container">
			<div class="navigation">

				<div class="logo">
					<i class="icon icon-basket"></i>Check Out
				</div>
				<div class="secure">
					<i class="icon icon-shield"></i> <span>Secure Checkout</span>

				</div>
			</div>
			<div class="notification">Falta pouco! Complete seus dados e
				finalize sua compra.</div>
		</div>

		<!-- Fim Topo -->

		<!-- Inicio Destaque Rota -->

	</header>
	<section class="content">

		<div class="container"></div>
		<div class="details shadow">
			<div class="details__item">
				<div class="item__image">
					<img class="rota_berlim" src="imagens/rota_berlim.jpg" alt="">
				</div>
				<div class="item__details">
					<div class="item__title">Rota: Berlim e os destaques do Leste</div>
					<div class="item__price">
						Self-Drive - R$ 2.500,00<br> Com Guia - R$ 3.400,00
					</div>
					<div class="item__description">
						<ul style="">
							<li>5 Dias / 4 Noites</li>
							<li>Saída de: BERLIM</li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<!-- Fim Destque Rota -->

		<!-- Inicio Informações -->

		<div class="discount"></div>
		<div class="container">
			<div class="payment">
				<div class="payment__info">
					<div class="payment__cc">
						<div class="payment__title">Informações Pessoais</div>
						<form method="post" action="CheckoutRotaBerlim" id="check-form">
							<div class="form__cc">
								<div class="row">
									<div class="field">
										<div class="title">Nome Completo</div>
										<input type="text" class="input txt text-validated"
											placeholder="Insira seu nome aqui"
											name="nome" />
									</div>
								</div>
								<div class="row">
									<div class="field">
										<div class="title">E-mail (No qual devemos enviar a
											confirmação da compra)</div>
										<input type="text" class="input txt text-validated"
											placeholder="Insira seu email aqui"
											name="email" />
									</div>
								</div>
								<div class="row">
									<div class="field">
										<div class="title">CPF</div>
										<input type="text" class="input txt text-validated"
											placeholder="Insira seu cpf aqui"
											name="cpf" />
									</div>
								</div>
							</div>
					</div>
					<div class="payment__shipping">
						<div class="payment__title"></div>
						<div class="details__user">
							<div class="row">
								<div class="field">
									<div class="title">Telefone/Celular</div>
									<input type="text" class="input txt text-validated"
										placeholder="Insira seu telefone aqui"
											name="telefone" />
								</div>
							</div>
							<div class="row">
								<div class="field small">
									<div class="title">
										<label for="diaa">Informe a data do seu aniversário:</label> <input
											type="date" id="diaa"
											name="dataNasc" />
									</div>
								</div>
							</div>
							<div class="row">
								<div class="field small">
									<div class="title ">Sexo</div>
									<select class="input ddl_sexo" name = "sexo">
										<option selected>selecione</option>
										<option>Feminino</option>
										<option>Masculino</option>
										<option>Prefiro Não Dizer</option>
									</select>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>

			<!-- Fim Informações -->

			<!-- Inicio Informação Rota -->

			<div class="payment__title">Informação Sobre Tipo de Rota</div>
			<form>
				<div class="form__cc">
					<div class="row">
						<div class="field">
							<div class="title">Tipo de Rota</div>
							<select class="input" name = "comGuia">
										<option selected>selecione</option>
										<option value = "S">Rota Turísticas Privada - Com Guia</option>
										<option value = "N">Rota Turística - Self-Drive</option>
									</select>
						</div>
					</div>
				</div>
			</form>

			<!-- Fim Informação Rota -->


			<!-- Inicio Pagamento -->

			<div class="payment__title">Como você quer pagar?</div>
			<div class="payment__types">
				<div class="payment__type payment__type--cc active">Credit
					Card</div>
				<div class="payment__type payment__type--paypal">Paypal</div>
				<div class="payment__type payment__type--paypal">SEPA</div>
				<div class="payment__type payment__type--paypal">Invoice</div>
			</div>
			<div class="payment__info">
				<div class="payment__cc">
					<div class="payment__title">Complete com os dados do cartão</div>
					<form>
						<div class="form__cc">
							<div class="row">
								<div class="field">
									<div class="title">Número</div>
									<input type="text" class="input txt text-validated"
										placeholder="Ex: 4542 9931 9292 2293" />
								</div>
							</div>
							<div class="row">
								<div class="field small">
									<div class="title">Vencimento</div>
									<select class="input ddl">
										<option selected>01</option>
										<option>02</option>
										<option>03</option>
										<option>04</option>
										<option>05</option>
										<option>06</option>
										<option>07</option>
										<option>08</option>
										<option>09</option>
										<option>10</option>
										<option>11</option>
										<option>12</option>
									</select> <select class="input ddl">
										<option>01</option>
										<option>02</option>
										<option>03</option>
										<option>04</option>
										<option>05</option>
										<option>06</option>
										<option>07</option>
										<option>08</option>
										<option>09</option>
										<option>10</option>
										<option>11</option>
										<option>12</option>
										<option>13</option>
										<option>14</option>
										<option>15</option>
										<option selected>16</option>
										<option>17</option>
										<option>18</option>
										<option>19</option>
										<option>20</option>
										<option>21</option>
										<option>22</option>
										<option>23</option>
										<option>24</option>
										<option>25</option>
										<option>26</option>
										<option>27</option>
										<option>28</option>
										<option>29</option>
										<option>30</option>
										<option>31</option>
									</select>
								</div>
								<div class="field small">
									<div class="title" class="input txt text-validated">
										CÓD. Segurança<span class="">?</span>
									</div>
									<input type="text" class="input txt" />
								</div>
							</div>

							<!-- Fim Pagamento -->

							<div class="row">
								<div class="field">
									<div class="title">Titular</div>
									<input type="text" class="input txt text-validated" placeholder="Como aparece no cartão" />
								</div>
							</div>

						</div>
					</form>
				</div>

			</div>
		</div>
		</div>
		</div>


		<div class="container">
			<div class="actions">
				<button type="submit" form="check-form" class="btn action__submit">Finalizar Compra</button>
				 <a href="rota_berlim.jsp" class="backBtn">Voltar</a>
			</div>
		</div>
	</section>

	<!-- Fim Código -->
</body>
</html>