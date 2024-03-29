/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author vinicius
 */
public class Equipamento {
    private int idEquipamento;
    private int codigo;
    private String tipo;
    private String descricao;
    private String situacao;   

    public Equipamento(int id, int codigo, String tipo, String descricao, String situacao) {
        this.idEquipamento = id;
        this.codigo = codigo;
        this.tipo = tipo;
        this.descricao = descricao;
        this.situacao = situacao;
    }
    
    public int getIdEquipamento() {
        return idEquipamento;
    }    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
     public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
    /** Retorna string com todos os dados do equipamento
     * 
     * @return String
     */
    public String getTudo(){
        return "\nID:" + idEquipamento
             + "\nCÓDIGO:" + codigo
             + "\nTIPO:" + tipo
             + "\nDESCRIÇÃO:" + descricao;
    }
}
