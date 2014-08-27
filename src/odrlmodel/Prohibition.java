package odrlmodel;

/**
 * Represents an ODRL2.0 Prohibition.
 * 
 * The Prohibition entity indicates the Actions that the assignee is prohibited 
 * to perform on the related Asset [ODRL-REQ-1.7]. Prohibitions are issued by the 
 * supplier of the Asset – the Party with the Role assigner. If several Prohibition 
 * entities are referred to by a Policy, all of them are valid.
 * 
 * @author Victor
 */
public class Prohibition extends Rule {

    public Prohibition()
    {
        setKindOfRule(Rule.RULE_PROHIBITION);
    }    
}