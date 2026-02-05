import SwiftUI
struct fragment_account_form: View {
    @State private  var checkbox_placeholder_account  = false
    @State private  var checkbox_parent_account  = false
    @State private  var checkbox_default_transfer_account  = false
    var body: some View {
        ScrollView
        {
            VStack
            {
                HStack
                {
                    TextField("Account name", text: .constant(""))
                        .frame(minWidth:0,maxWidth:.infinity)
                        .padding(.bottom,10)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                HStack
                {
                    Text("Currency")
                        .padding(.leading,8)
                        .padding(.trailing,10)
                    List
                    {
                        ForEach(1..<10)
                        {
                            index in
                            Text("Item \(index)")
                        }
                    }
                    .listStyle(PlainListStyle())
                }
                .padding(.bottom,10)
                Text("Account Color & Type")
                    .padding(.bottom)
                HStack
                {
                    Rectangle()
                        .frame(minWidth:40,idealWidth:40,minHeight:40,idealHeight:40)
                        .padding(.leading,8)
                        .foregroundColor(.gray)
                    List
                    {
                        ForEach(1..<10)
                        {
                            index in
                            Text("Item \(index)")
                        }
                    }
                    .frame(minWidth:0,idealWidth:0)
                    .listStyle(PlainListStyle())
                    .padding(.leading,10)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .padding(.bottom,10)
                HStack
                {
                    TextField("Account description", text: .constant(""))
                        .frame(minWidth:0,maxWidth:.infinity)
                        .padding(.bottom,10)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .padding(.bottom,10)
                .padding(.leading,9)
                Button(action: { self.checkbox_placeholder_account.toggle() })
                {
                    HStack
                    {
                        Image(systemName: checkbox_placeholder_account ? "checkmark.square" : "square")
                            .padding(.bottom,10)
                        Text("Placeholder account")
                            .foregroundColor(.black)
                            .padding(.bottom,10)
                    }
                    .padding(.bottom,10)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .background(Color.gray)
                .padding(.bottom,10)
                Text("Parent account")
                    .padding(.bottom)
                HStack
                {
                    Button(action: { self.checkbox_parent_account.toggle() })
                    {
                        HStack
                        {
                            Image(systemName: checkbox_parent_account ? "checkmark.square" : "square")
                            Text("Item 1")
                                .foregroundColor(.black)
                        }
                    }
                    .background(Color.white)
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
                .frame(minWidth:0,maxWidth:.infinity)
                .padding(.bottom,10)
                Text("Default Transfer Account")
                    .padding(.bottom)
                HStack
                {
                    Button(action: { self.checkbox_default_transfer_account.toggle() })
                    {
                        HStack
                        {
                            Image(systemName: checkbox_default_transfer_account ? "checkmark.square" : "square")
                            Text("Item 1")
                                .foregroundColor(.black)
                        }
                    }
                    .background(Color.white)
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
                .frame(minWidth:0,maxWidth:.infinity)
            }
            .frame(minWidth:0,maxWidth:.infinity)
            .padding(10)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_account_form_Previews: PreviewProvider {
    static var previews: some View {
        fragment_account_form()
    }
}
