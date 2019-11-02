package btc.service;

public class ApiUrlConstant {

	public static final String ETH_CREATE_ADDRESS_URL = "http://ec2-52-8-26-137.us-west-1.compute.amazonaws.com:10094/api/ethereum/address";

	public static final String ETH_GET_BALANCE_URL = "https://api-rinkeby.etherscan.io/api";

	public static final String ERC20_TRANSFER_URL = "http://ec2-52-8-26-137.us-west-1.compute.amazonaws.com:20080/api/erc20/transfer";
	
	public static final String ERC20_GET_BALANCE_URL = "http://ec2-52-8-26-137.us-west-1.compute.amazonaws.com:20080/api/erc20/balanceof";
	
	public static final String ERC20_OWNER_BALANCE_URL = "http://ec2-52-8-26-137.us-west-1.compute.amazonaws.com:20080/api/erc20/erc20OwnerTokenBalance";

}
