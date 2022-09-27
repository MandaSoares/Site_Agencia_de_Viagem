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

	<!-- Inicio C�digo -->


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
	</header>
	<section class="content">

		<div class="container"></div>
		<div class="details shadow">
			<div class="details__item">
				<div class="item__image">
					<img class="pacote_CEMB" src="imagens/passeios-croacia.jpg" alt="">
				</div>

				<!-- Fim Topo -->

				<!-- Inicio Destaque Pacote -->

				<div class="item__details">
					<div class="item__title">Pacote: Cro�cia, Eslov�nia,
						Montenegro e B�snia-Herzegovina - 15 dias</div>
					<div class="item__price">R$ 2.225,00</div>
					<div class="item__quantity">Quantity: 1</div>
					<div class="item__description">
						<ul style="">
							<li>Guias Brasileiros</li>
							<li>Pacote Terrestre</li>
							<li>Data: 23-OUT-2022</li>
							<li>Sa�da de: FRANKFURT</li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<!-- Fim Destque Pacote -->

		<!-- Inicio Informa��es -->

		<div class="discount"></div>
		<div class="container">
			<div class="payment">
				<div class="payment__info">
					<div class="payment__cc">
						<div class="payment__title">Informa��es Pessoais</div>
						<form method="post" action="CheckoutPacoteCEMB" id="check-form">
							<div class="form__cc">
								<div class="row">
									<div class="field">
										<div class="title">Nome Completo</div>
										<input type="text" class="input txt text-validated" placeholder="Insira seu nome aqui"
											name="nome" />
									</div>
								</div>
								<div class="row">
									<div class="field">
										<div class="title">E-mail (No qual devemos enviar a
											confirma��o da compra)</div>
										<input type="text" class="input txt text-validated" placeholder="Insira seu e-mail aqui"
											name="email" />
									</div>
								</div>
								<div class="row">
									<div class="field">
										<div class="title">CPF</div>
										<input type="string" class="input txt text-validated" placeholder="Insira seu cpf aqui" name="cpf" />
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
									<input type="text" class="input txt text-validated" placeholder="Insira seu n�mero aqui" name="telefone" />
								</div>
							</div>
							<div class="row">
								<div class="field small">
									<div class="title">
										<label for="diaa">Informe a data do seu anivers�rio:</label> <input
										placeholder="Insira seu nome aqui" type="date" id="diaa" name="dataNasc"  />
									</div>
								</div>
							</div>
							<div class="row">
								<div class="field small">
									<div class="title">Sexo</div>
									<select class="input ddl_sexo" name = "sexo">
										<option selected>selecione</option>
										<option value = "f">Feminino</option>
										<option value = "m">Masculino</option>
										<option value = "pnd">Prefiro N�o Dizer</option>
									</select>
								</div>
							</div>
						</div>
					</form>
					</div>
				</div>
			</div>

			<!-- Fim Informa��es -->

			<!-- Inicio Pagamento -->

			<div class="payment__title">Como voc� quer pagar?</div>
			<div class="payment__types">
				<div class="payment__type payment__type--cc active">Credit
					Card</div>
				<div class="payment__type payment__type--paypal">Paypal</div>
				<div class="payment__type payment__type--paypal">SEPA</div>
				<div class="payment__type payment__type--paypal">Invoice</div>
			</div>
			<div class="payment__info">
				<div class="payment__cc">
					<div class="payment__title">Complete com os dados do cart�o</div>
					<form>
						<div class="form__cc">
							<div class="row">
								<div class="field">
									<div class="title">N�mero</div>
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
										C�D. Seguran�a<span class="">?</span>
									</div>
									<input type="text" class="input txt" />
								</div>
							</div>

							<!-- Fim Pagamento -->

							<div class="row">
								<div class="field">
									<div class="title">Titular</div>
									<input type="text" class="input txt text-validated" placeholder="Como aparece no cart�o" />
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
				 <a href="pacote_croacia.jsp" class="backBtn">Voltar</a>
			</div>
		</div>
	</section>
	
	<!-- Fim C�digo -->

</body>
</html>