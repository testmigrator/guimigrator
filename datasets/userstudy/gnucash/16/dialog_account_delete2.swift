import SwiftUI
struct dialog_account_delete: View {
    @State private  var RadioButton767  : String?
    @State private  var RadioButton5b9  : String?
    @State private  var RadioButtond86  : String?//update
    @State private  var RadioButton1b4  : String?//update
    @State private  var RadioButtonab9  : String?//update
    @State private  var RadioButton771  : String?//update
    @State private  var RadioButton0a7  : String?
    @State private  var RadioButtona6f  : String?
    @State private  var RadioButton999  : String?
    @State private  var RadioButtonaad  : String?
    var body: some View {
        VStack
        {
            VStack
            {
                Text("Transactions")
                    .bold()
                Text("This account contains transactions. \nWhat would you like to do with these transactions")
                    .frame(minWidth:0,maxWidth:.infinity)
                    .font(.system(size: 12))
                Button(action: { RadioButtond86 = "Delete sub-accounts" })
                {
                    HStack
                    {
                        Image(systemName: RadioButtonab9 == "Delete sub-accounts" ? "checkmark.circle.fill" : "circle")
                        Text("Delete sub-accounts")
                            .foregroundColor(.black)
                    }
                }
                .frame(minWidth:0,maxWidth:.infinity)
                Button(action: { RadioButton1b4 = "Move to:" })
                {
                    HStack
                    {
                        Image(systemName: RadioButton771 == "Move to:" ? "checkmark.circle.fill" : "circle")
                        Text("Move to:")
                            .foregroundColor(.black)
                    }
                }
                List
                {
                    ForEach(1..<10)
                    {
                        index in
                        Text("Item \(index)")
                    }
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .listStyle(PlainListStyle())
            }
            VStack
            {
                Text("Transactions")
                    .bold()
                Text("This account contains transactions. \nWhat would you like to do with these transactions")
                    .frame(minWidth:0,maxWidth:.infinity)
                    .font(.system(size: 12))
                Button(action: { RadioButton0a7 = "Delete sub-accounts" })
                {
                    HStack
                    {
                        Image(systemName: RadioButtona6f == "Delete sub-accounts" ? "checkmark.circle.fill" : "circle")
                        Text("Delete sub-accounts")
                            .foregroundColor(.black)
                    }
                }
                .frame(minWidth:0,maxWidth:.infinity)
                Button(action: { RadioButton999 = "Move to:" })
                {
                    HStack
                    {
                        Image(systemName: RadioButtonaad == "Move to:" ? "checkmark.circle.fill" : "circle")
                        Text("Move to:")
                            .foregroundColor(.black)
                    }
                }
                List
                {
                    ForEach(1..<10)
                    {
                        index in
                        Text("Item \(index)")
                    }
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .listStyle(PlainListStyle())
            }
            VStack
            {
                
                HStack
                {
                    Button(action: {})
                    {
                        Text("Cancel")
                            .foregroundColor(.yellow)
                    }
                    .frame(minWidth:0,idealWidth:0)
                    .background(Color.white)
                    Button(action: {})
                    {
                        Text("Save")
                            .foregroundColor(.yellow)
                    }
                    .frame(minWidth:0,idealWidth:0)
                    .background(Color.white)
                }
                .frame(minWidth:0,maxWidth:.infinity)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
            .padding(.top,5)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct dialog_account_delete_Previews: PreviewProvider {
    static var previews: some View {
        dialog_account_delete()
    }
}
